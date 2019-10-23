package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.PrintingCost;

public class PrintingCostValidator extends EntityValidator {

    private PrintingCost entity;

    private EnergyValidator energyValidator;

    private MaterialValidator materialValidator;

    private JobValidator jobValidator;

    private MaintenanceValidator maintenanceValidator;

    public PrintingCostValidator(PrintingCost entity) {
	this.entity = entity;
    }

    public PrintingCostValidator() {
    }

    public boolean markup(CustomTextField textField) {
	if (!validateProperty(entity, "markup").isEmpty()) {
	    registerValidation(textField, validateProperty(entity, "markup").iterator().next().getMessage());
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
	energyValidator = new EnergyValidator(entity.getEnergy());
	materialValidator = new MaterialValidator(entity.getMaterial());
	maintenanceValidator = new MaintenanceValidator(entity.getMaintenance());
	jobValidator = new JobValidator(entity.getJob());

	/* BEG Energy Validations */
	if (energyValidator.totalConsumption(totalConsumption))
	    status = false;

	if (energyValidator.totalPrice(consumptionPrice))
	    status = false;

	if (energyValidator.printerConsumption(printerConsumption))
	    status = false;

	if (energyValidator.totalConsumption(workTime))
	    status = false;
	/* END Energy Validations */
	/* BEG Material Validations */
	if (materialValidator.diameter(diameter))
	    status = false;

	if (materialValidator.filamentLenght(length))
	    status = false;

	if (materialValidator.materialPrice(filamentPrice))
	    status = false;
	/* END Material Validations */
	/* BEG Maintenance Validations */
	if (maintenanceValidator.totalPartsPrice(partsCost))
	    status = false;

	if (maintenanceValidator.lifeSpan(expectedLife))
	    status = false;

	if (maintenanceValidator.workHours(maintenanceWork))
	    status = false;
	/* END Maintenance Validations */
	/* BEG Job Validations */
	if (jobValidator.workHour(jobWT))
	    status = false;

	if (jobValidator.hourlyRate(jobCost))
	    status = false;
	/* END Job Validations */
	/* BEG Markup Validation */
	if (markup(markup))
	    status = false;
	/* END Markup Validation */
	return status;
    }

    public PrintingCost getEntity() {
	return entity;
    }

    public void setEntity(PrintingCost entity) {
	this.entity = entity;
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
