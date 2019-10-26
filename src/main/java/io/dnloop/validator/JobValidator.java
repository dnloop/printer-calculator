package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Job;

public class JobValidator extends EntityValidator {
    private Job job;

    public JobValidator(Job job) {
	this.job = job;
    }

    public boolean validateTextField(CustomTextField textField, String property) {
	if (!validateProperty(job, property).isEmpty()) {
	    registerValidation(textField, validateProperty(job, property).iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField hourlyRate, CustomTextField workHours) {
	boolean status = true;

	if (validateTextField(hourlyRate, "hourlyRate"))
	    status = false;

	if (validateTextField(workHours, "workHours"))
	    status = false;

	return status;

    }

    public Job getJob() {
	return job;
    }

    public void setJob(Job job) {
	this.job = job;
    }

}
