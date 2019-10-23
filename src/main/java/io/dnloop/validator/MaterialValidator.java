package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Material;

public class MaterialValidator extends EntityValidator {

    private Material entity;

    public MaterialValidator(Material entity) {
	this.entity = entity;
    }

    public boolean diameter(CustomTextField textField) {
	if (!validateProperty(entity, "diameter").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "diameter").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean filamentLenght(CustomTextField textField) {
	if (!validateProperty(entity, "filamentLenght").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "filamentLenght").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean materialPrice(CustomTextField textField) {
	if (!validateProperty(entity, "materialPrice").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "materialPrice").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

}
