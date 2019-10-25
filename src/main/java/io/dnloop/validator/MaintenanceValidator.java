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

    public boolean totalPartsPrice(CustomTextField textField) {
	if (!validateProperty(maintenance, "totalPartsPrice").isEmpty()) {
	    registerValidation(textField,
		    validateProperty(maintenance, "totalPartsPrice").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean lifeSpan(CustomTextField textField) {
	if (!validateProperty(maintenance, "lifeSpan").isEmpty()) {
	    registerValidation(textField, validateProperty(maintenance, "lifeSpan").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean workHours(CustomTextField textField) {
	if (!validateProperty(maintenance, "workHours").isEmpty()) {
	    registerValidation(textField, validateProperty(maintenance, "workHours").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField partsCost, CustomTextField expectedLife, CustomTextField maintenanceWork) {
	boolean status = true;

	if (totalPartsPrice(partsCost))
	    status = false;

	if (lifeSpan(expectedLife))
	    status = false;

	if (workHours(maintenanceWork))
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
