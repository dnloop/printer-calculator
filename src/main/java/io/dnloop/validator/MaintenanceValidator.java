package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Maintenance;

public class MaintenanceValidator extends EntityValidator {

    private Maintenance maintenance;

    public MaintenanceValidator() {
    }

    public MaintenanceValidator(Maintenance maintenance) {
	this.maintenance = maintenance;
    }

    public boolean validateTextField(CustomTextField textField, String property) {
	if (!validateProperty(maintenance, property).isEmpty()) {
	    registerValidation(textField, validateProperty(maintenance, property).iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField totalPartsPrice, CustomTextField lifeSpan, CustomTextField workHours) {
	boolean status = true;

	if (validateTextField(totalPartsPrice, "totalPartsPrice"))
	    status = false;

	if (validateTextField(lifeSpan, "lifeSpan"))
	    status = false;

	if (validateTextField(workHours, "workHours"))
	    status = false;

	return status;

    }

    public Maintenance getMaintenance() {
	return maintenance;
    }

    public void setMaintenance(Maintenance maintenance) {
	this.maintenance = maintenance;
    }

}
