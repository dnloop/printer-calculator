package io.dnloop.validator;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.controlsfx.control.textfield.CustomTextField;
import org.controlsfx.validation.ValidationSupport;

public class EntityValidator {

    static ValidatorFactory factory;

    static javax.validation.Validator validator;

    static ValidationSupport validationSupport = new ValidationSupport();

    public static void buildValid() {
	factory = Validation.buildDefaultValidatorFactory();
	validator = factory.getValidator();
    }

    public static void closeValid() {
	factory.close();
    }

    static <T> Set<ConstraintViolation<T>> validate(T entity) {
	return validator.validate(entity);
    } // validate all

    static <T> Set<ConstraintViolation<T>> validateProperty(T entity, String name) {
	return validator.validateProperty(entity, name);
    } // validate all

    static void registerValidation(CustomTextField textField, String property) {
	validationSupport.registerValidator(textField,
		org.controlsfx.validation.Validator.createEmptyValidator(property));
    }
}
