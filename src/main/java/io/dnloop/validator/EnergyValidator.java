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

    public boolean totalConsumption(CustomTextField textField) {
	if (!validateProperty(energy, "totalConsumption").isEmpty()) {
	    registerValidation(textField, validateProperty(energy, "totalConsumption").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean totalPrice(CustomTextField textField) {
	if (!validateProperty(energy, "totalPrice").isEmpty()) {
	    registerValidation(textField, validateProperty(energy, "totalPrice").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean printerConsumption(CustomTextField textField) {
	if (!validateProperty(energy, "printerConsumption").isEmpty()) {
	    registerValidation(textField,
		    validateProperty(energy, "printerConsumption").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean workHours(CustomTextField textField) {
	if (!validateProperty(energy, "workHours").isEmpty()) {
	    registerValidation(textField, validateProperty(energy, "workHours").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField totalConsumption, CustomTextField consumptionPrice,
	    CustomTextField printerConsumption, CustomTextField workTime) {
	boolean status = true;

	if (totalConsumption(totalConsumption))
	    status = false;

	if (totalPrice(consumptionPrice))
	    status = false;

	if (printerConsumption(printerConsumption))
	    status = false;

	if (totalConsumption(workTime))
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
