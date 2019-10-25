package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Job;

public class JobValidator extends EntityValidator {
    private Job job;

    public JobValidator(Job job) {
	this.job = job;
    }

    public boolean workHour(CustomTextField textField) {
	if (!validateProperty(job, "workHour").isEmpty()) {
	    registerValidation(textField, validateProperty(job, "workHour").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean hourlyRate(CustomTextField textField) {
	if (!validateProperty(job, "hourlyRate").isEmpty()) {
	    registerValidation(textField, validateProperty(job, "hourlyRate").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField jobWT, CustomTextField jobCost) {
	boolean status = true;

	if (workHour(jobWT))
	    status = false;

	if (hourlyRate(jobCost))
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
