package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Printer;

public class PrinterValidator extends EntityValidator {

    private Printer printer;

    private EnergyValidator energyValidator;

    private MaterialValidator materialValidator;

    private MaintenanceValidator maintenanceValidator;

    private PartsValidator partsValidator;

    public boolean validateTextField(CustomTextField textField, String property) {
	if (!validateProperty(printer, property).isEmpty()) {
	    registerValidation(textField, validateProperty(printer, property).iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField txtHotbed, CustomTextField txtPowerSwitch, CustomTextField txtFan,
	    CustomTextField txtDisplay, CustomTextField txtProximitySensor, CustomTextField txtHotEnd,
	    CustomTextField txtDriver, CustomTextField txtNozzle, CustomTextField txtExtruder, CustomTextField txtBelt,
	    CustomTextField txtShield, CustomTextField txtResistanceCartridge, CustomTextField txtEndStop,
	    CustomTextField txtBearing, CustomTextField txtPulley, CustomTextField txtStepEngine,
	    CustomTextField txtCoupler, CustomTextField txtThreadedRod, CustomTextField txtConsumption,
	    CustomTextField txtDiameter, CustomTextField txtMaterialPrice, CustomTextField txtLifeSpan,
	    CustomTextField txtWorkHours, CustomTextField txtPrinter) {

	boolean status = true;

	energyValidator = new EnergyValidator(printer.getEnergy());
	maintenanceValidator = new MaintenanceValidator(printer.getMaintenance());
	materialValidator = new MaterialValidator(printer.getMaterial());
	partsValidator = new PartsValidator(printer.getParts());

	if (energyValidator.validateTextField(txtConsumption, "printerConsumption"))
	    status = false;

	if (validateTextField(txtPrinter, "printer"))
	    status = false;

	if (materialValidator.validateTextField(txtDiameter, "diameter"))
	    status = false;

	if (materialValidator.validateTextField(txtMaterialPrice, "materialPrice"))
	    status = false;

	if (maintenanceValidator.validateTextField(txtLifeSpan, "lifeSpan"))
	    status = false;

	if (maintenanceValidator.validateTextField(txtWorkHours, "workHours"))
	    status = false;

	if (partsValidator.validate(txtHotbed, txtPowerSwitch, txtFan, txtDisplay, txtProximitySensor, txtHotEnd,
		txtDriver, txtNozzle, txtExtruder, txtBelt, txtShield, txtResistanceCartridge, txtEndStop, txtBearing,
		txtPulley, txtStepEngine, txtCoupler, txtThreadedRod))
	    status = false;

	return status;
    }

    public Printer getSettings() {
	return printer;
    }

    public void setSettings(Printer printer) {
	this.printer = printer;
    }

}
