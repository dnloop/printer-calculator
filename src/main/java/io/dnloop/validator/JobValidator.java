package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Job;

public class JobValidator extends EntityValidator {
    private Job entity;

    public JobValidator(Job entity) {
	this.entity = entity;
    }

    public boolean workHour(CustomTextField textField) {
	if (!validateProperty(entity, "workHour").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "workHour").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean hourlyRate(CustomTextField textField) {
	if (!validateProperty(entity, "hourlyRate").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "hourlyRate").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }
}
