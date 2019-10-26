package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Energy;

public class EnergyValidator extends EntityValidator {

    private Energy energy;

    public EnergyValidator() {
    }

    public EnergyValidator(Energy energy) {
	this.energy = energy;
    }

    public boolean validateTextField(CustomTextField textField, String property) {
	if (!validateProperty(energy, property).isEmpty()) {
	    registerValidation(textField, validateProperty(energy, property).iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField totalConsumption, CustomTextField totalPrice,
	    CustomTextField printerConsumption, CustomTextField workHours) {
	boolean status = true;

	if (validateTextField(totalConsumption, "totalConsumption"))
	    status = false;

	if (validateTextField(totalPrice, "totalPrice"))
	    status = false;

	if (validateTextField(printerConsumption, "printerConsumption"))
	    status = false;

	if (validateTextField(workHours, "workHours"))
	    status = false;

	return status;

    }

    public Energy getEnergy() {
	return energy;
    }

    public void setEnergy(Energy energy) {
	this.energy = energy;
    }
}
