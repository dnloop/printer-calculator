package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Parts;

public class PartsValidator extends EntityValidator {

    private Parts parts;

    public PartsValidator(Parts parts) {
	super();
	this.parts = parts;
    }

    public PartsValidator() {
    }

    public boolean validateTextField(CustomTextField textField, String property) {
	if (!validateProperty(parts, property).isEmpty()) {
	    registerValidation(textField, validateProperty(parts, property).iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField txtHotBed, CustomTextField txtPowerSwitch, CustomTextField txtFan,
	    CustomTextField txtDisplay, CustomTextField txtProximitySensor, CustomTextField txtHotEnd,
	    CustomTextField txtDriver, CustomTextField txtNozzle, CustomTextField txtExtruder, CustomTextField txtBelt,
	    CustomTextField txtShield, CustomTextField txtResistanceCartridge, CustomTextField txtEndStop,
	    CustomTextField txtBearing, CustomTextField txtPulley, CustomTextField txtStepEngine,
	    CustomTextField txtCoupler, CustomTextField txtThreadedRod) {

	boolean status = true;

	if (validateTextField(txtHotBed, "hotEnd"))
	    status = false;

	if (validateTextField(txtPowerSwitch, "powerSwitch"))
	    status = false;

	if (validateTextField(txtFan, "fan"))
	    status = false;

	if (validateTextField(txtDisplay, "display"))
	    status = false;

	if (validateTextField(txtProximitySensor, "proximitySensor"))
	    status = false;

	if (validateTextField(txtHotEnd, "hotEnd"))
	    status = false;

	if (validateTextField(txtDriver, "driver"))
	    status = false;

	if (validateTextField(txtNozzle, "nozzle"))
	    status = false;

	if (validateTextField(txtExtruder, "extruder"))
	    status = false;

	if (validateTextField(txtBelt, "belt"))
	    status = false;

	if (validateTextField(txtShield, "shield"))
	    status = false;

	if (validateTextField(txtResistanceCartridge, "resistanceCartridge"))
	    status = false;

	if (validateTextField(txtEndStop, "endStop"))
	    status = false;

	if (validateTextField(txtBearing, "bearing"))
	    status = false;

	if (validateTextField(txtPulley, "pulley"))
	    status = false;

	if (validateTextField(txtStepEngine, "stepEngine"))
	    status = false;

	if (validateTextField(txtCoupler, "coupler"))
	    status = false;

	if (validateTextField(txtThreadedRod, "threadedRod"))
	    status = false;

	return status;
    }

    public Parts getParts() {
	return parts;
    }

    public void setParts(Parts parts) {
	this.parts = parts;
    }

}
