package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Energy;

public class EnergyValidator extends EntityValidator {

    private Energy entity;

    public EnergyValidator(Energy entity) {
	this.entity = entity;
    }

    public boolean totalConsumption(CustomTextField textField) {
	if (!validateProperty(entity, "totalConsumption").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "totalConsumption").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean totalPrice(CustomTextField textField) {
	if (!validateProperty(entity, "totalPrice").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "totalPrice").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean printerConsumption(CustomTextField textField) {
	if (!validateProperty(entity, "printerConsumption").isEmpty()) {
	    registerValidation(textField,
		    validateProperty(entity, "printerConsumption").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean workHours(CustomTextField textField) {
	if (!validateProperty(entity, "workHours").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "workHours").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }
}
