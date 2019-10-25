package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Settings;

public class SettingsValidator extends EntityValidator {

    private Settings settings;

    private EnergyValidator energyValidator;

    private MaterialValidator materialValidator;

    private MaintenanceValidator maintenanceValidator;

    private PartsValidator partsValidator;

    public boolean validate(CustomTextField txtHotbed, CustomTextField txtPowerSwitch, CustomTextField txtFan,
	    CustomTextField txtDisplay, CustomTextField txtProximitySensor, CustomTextField txtHotEnd,
	    CustomTextField txtDriver, CustomTextField txtNozzle, CustomTextField txtExtruder, CustomTextField txtBelt,
	    CustomTextField txtShield, CustomTextField txtResistanceCartridge, CustomTextField txtEndStop,
	    CustomTextField txtBearing, CustomTextField txtPulley, CustomTextField txtStepEngine,
	    CustomTextField txtCoupler, CustomTextField txtThreadedRod, CustomTextField txtConsumption,
	    CustomTextField txtDiameter, CustomTextField txtMaterialPrice, CustomTextField txtLifeSpan,
	    CustomTextField txtWorkHour) {

	boolean status = true;

	energyValidator = new EnergyValidator(settings.getEnergy());
	maintenanceValidator = new MaintenanceValidator(settings.getMaintenance());
	materialValidator = new MaterialValidator(settings.getMaterial());

	if (energyValidator.totalConsumption(txtConsumption))
	    status = false;

	if (materialValidator.diameter(txtDiameter))
	    status = false;

	if (materialValidator.materialPrice(txtMaterialPrice))
	    status = false;

	if (maintenanceValidator.lifeSpan(txtLifeSpan))
	    status = false;

	if (maintenanceValidator.workHours(txtWorkHour))
	    status = false;

	if (partsValidator.validate(txtHotbed, txtPowerSwitch, txtFan, txtDisplay, txtProximitySensor, txtHotEnd,
		txtDriver, txtNozzle, txtExtruder, txtBelt, txtShield, txtResistanceCartridge, txtEndStop, txtBearing,
		txtPulley, txtStepEngine, txtCoupler, txtThreadedRod))
	    status = false;

	return status;
    }

    public Settings getSettings() {
	return settings;
    }

    public void setSettings(Settings settings) {
	this.settings = settings;
    }

}
