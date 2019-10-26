package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.PrintingCost;

public class PrintingCostValidator extends EntityValidator {

    private PrintingCost printingCost;

    private EnergyValidator energyValidator;

    private MaterialValidator materialValidator;

    private JobValidator jobValidator;

    private MaintenanceValidator maintenanceValidator;

    public PrintingCostValidator(PrintingCost printingCost) {
	this.printingCost = printingCost;
    }

    public PrintingCostValidator() {
    }

    public boolean validateTextField(CustomTextField textField, String property) {
	if (!validateProperty(printingCost, property).isEmpty()) {
	    registerValidation(textField, validateProperty(printingCost, property).iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField totalConsumption, CustomTextField consumptionPrice,
	    CustomTextField printerConsumption, CustomTextField workTime, CustomTextField diameter,
	    CustomTextField length, CustomTextField filamentPrice, CustomTextField partsCost,
	    CustomTextField expectedLife, CustomTextField maintenanceWork, CustomTextField jobWT,
	    CustomTextField jobCost, CustomTextField markup) {
	boolean status = true;

	/* Validators */
	energyValidator = new EnergyValidator(printingCost.getEnergy());
	materialValidator = new MaterialValidator(printingCost.getMaterial());
	maintenanceValidator = new MaintenanceValidator(printingCost.getMaintenance());
	jobValidator = new JobValidator(printingCost.getJob());

	if (energyValidator.validate(totalConsumption, consumptionPrice, printerConsumption, workTime))
	    status = false;

	if (materialValidator.validate(diameter, length, filamentPrice))
	    status = false;

	if (maintenanceValidator.validate(partsCost, expectedLife, maintenanceWork))
	    status = false;

	if (jobValidator.validate(jobWT, jobCost))
	    status = false;

	if (validateTextField(markup, "markup"))
	    status = false;

	return status;
    }

    public PrintingCost getPrintingCost() {
	return printingCost;
    }

    public void setPrintingCost(PrintingCost printingCost) {
	this.printingCost = printingCost;
    }

    public EnergyValidator getEnergyValidator() {
	return energyValidator;
    }

    public void setEnergyValidator(EnergyValidator energyValidator) {
	this.energyValidator = energyValidator;
    }

    public MaterialValidator getMaterialValidator() {
	return materialValidator;
    }

    public void setMaterialValidator(MaterialValidator materialValidator) {
	this.materialValidator = materialValidator;
    }

    public JobValidator getJobValidator() {
	return jobValidator;
    }

    public void setJobValidator(JobValidator jobValidator) {
	this.jobValidator = jobValidator;
    }

    public MaintenanceValidator getMaintenanceValidator() {
	return maintenanceValidator;
    }

    public void setMaintenanceValidator(MaintenanceValidator maintenanceValidator) {
	this.maintenanceValidator = maintenanceValidator;
    }
}
