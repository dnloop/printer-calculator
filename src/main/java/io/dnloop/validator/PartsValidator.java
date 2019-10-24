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

    public boolean hotBed(CustomTextField textField) {
	if (!validateProperty(parts, "hotBed").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "hotBed").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean powerSwitch(CustomTextField textField) {
	if (!validateProperty(parts, "powerSwitch").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "powerSwitch").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean fan(CustomTextField textField) {
	if (!validateProperty(parts, "fan").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "fan").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean display(CustomTextField textField) {
	if (!validateProperty(parts, "display").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "display").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean proximitySensor(CustomTextField textField) {
	if (!validateProperty(parts, "proximitySensor").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "proximitySensor").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean hotEnd(CustomTextField textField) {
	if (!validateProperty(parts, "hotEnd").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "hotEnd").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean driver(CustomTextField textField) {
	if (!validateProperty(parts, "driver").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "driver").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean nozzle(CustomTextField textField) {
	if (!validateProperty(parts, "nozzle").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "nozzle").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean extruder(CustomTextField textField) {
	if (!validateProperty(parts, "extruder").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "extruder").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean belt(CustomTextField textField) {
	if (!validateProperty(parts, "belt").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "belt").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean shield(CustomTextField textField) {
	if (!validateProperty(parts, "shield").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "shield").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean resistanceCartridge(CustomTextField textField) {
	if (!validateProperty(parts, "resistanceCartridge").isEmpty()) {
	    registerValidation(textField,
		    validateProperty(parts, "resistanceCartridge").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean endStop(CustomTextField textField) {
	if (!validateProperty(parts, "endStop").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "endStop").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean bearing(CustomTextField textField) {
	if (!validateProperty(parts, "bearing").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "bearing").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean pulley(CustomTextField textField) {
	if (!validateProperty(parts, "pulley").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "pulley").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean stepEngine(CustomTextField textField) {
	if (!validateProperty(parts, "stepEngine").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "stepEngine").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean coupler(CustomTextField textField) {
	if (!validateProperty(parts, "coupler").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "coupler").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean threadedRod(CustomTextField textField) {
	if (!validateProperty(parts, "threadedRod").isEmpty()) {
	    registerValidation(textField, validateProperty(parts, "threadedRod").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField txtHotbed, CustomTextField txtPowerSwitch, CustomTextField txtFan,
	    CustomTextField txtDisplay, CustomTextField txtProximitySensor, CustomTextField txtHotEnd,
	    CustomTextField txtDriver, CustomTextField txtNozzle, CustomTextField txtExtruder, CustomTextField txtBelt,
	    CustomTextField txtShield, CustomTextField txtResistanceCartridge, CustomTextField txtEndStop,
	    CustomTextField txtBearing, CustomTextField txtPulley, CustomTextField txtStepEngine,
	    CustomTextField txtCoupler, CustomTextField txtThreadedRod) {

	boolean status = true;

	if (hotBed(txtHotEnd))
	    status = false;

	if (powerSwitch(txtPowerSwitch))
	    status = false;

	if (fan(txtFan))
	    status = false;

	if (display(txtDisplay))
	    status = false;

	if (proximitySensor(txtProximitySensor))
	    status = false;

	if (hotEnd(txtHotEnd))
	    status = false;

	if (driver(txtDriver))
	    status = false;

	if (nozzle(txtNozzle))
	    status = false;

	if (extruder(txtExtruder))
	    status = false;

	if (belt(txtBelt))
	    status = false;

	if (shield(txtShield))
	    status = false;

	if (resistanceCartridge(txtResistanceCartridge))
	    status = false;

	if (endStop(txtEndStop))
	    status = false;

	if (bearing(txtBearing))
	    status = false;

	if (pulley(txtPulley))
	    status = false;

	if (stepEngine(txtStepEngine))
	    status = false;

	if (coupler(txtCoupler))
	    status = false;

	if (threadedRod(txtThreadedRod))
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
