package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Material;

public class MaterialValidator extends EntityValidator {

    private Material material;

    public MaterialValidator(Material material) {
	this.material = material;
    }

    public boolean diameter(CustomTextField textField) {
	if (!validateProperty(material, "diameter").isEmpty()) {
	    registerValidation(textField, validateProperty(material, "diameter").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean filamentLenght(CustomTextField textField) {
	if (!validateProperty(material, "filamentLenght").isEmpty()) {
	    registerValidation(textField, validateProperty(material, "filamentLenght").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean materialPrice(CustomTextField textField) {
	if (!validateProperty(material, "materialPrice").isEmpty()) {
	    registerValidation(textField, validateProperty(material, "materialPrice").iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField diameter, CustomTextField length, CustomTextField filamentPrice) {
	boolean status = true;

	if (diameter(diameter))
	    status = false;

	if (filamentLenght(length))
	    status = false;

	if (materialPrice(filamentPrice))
	    status = false;

	return status;
    }

    public Material getMaterial() {
	return material;
    }

    public void setMaterial(Material material) {
	this.material = material;
    }

}
