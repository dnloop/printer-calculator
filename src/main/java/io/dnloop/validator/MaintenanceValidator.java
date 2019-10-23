package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Maintenance;

public class MaintenanceValidator extends EntityValidator {
    private Maintenance entity;

    public MaintenanceValidator(Maintenance entity) {
	this.entity = entity;
    }

    public boolean totalPartsPrice(CustomTextField textField) {
	if (!validateProperty(entity, "totalPartsPrice").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "totalPartsPrice").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean lifeSpan(CustomTextField textField) {
	if (!validateProperty(entity, "lifeSpan").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "lifeSpan").iterator().next().getMessage());
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
