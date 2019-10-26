package io.dnloop.validator;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Material;

public class MaterialValidator extends EntityValidator {

    private Material material;

    public MaterialValidator(Material material) {
	this.material = material;
    }

    public boolean validateTextField(CustomTextField textField, String property) {
	if (!validateProperty(material, property).isEmpty()) {
	    registerValidation(textField, validateProperty(material, property).iterator().next().getMessage());
	    return true;
	} else
	    return false;
    }

    public boolean validate(CustomTextField diameter, CustomTextField length, CustomTextField filamentPrice) {
	boolean status = true;

	if (validateTextField(diameter, "diameter"))
	    status = false;

	if (validateTextField(length, "filamentLength"))
	    status = false;

	if (validateTextField(filamentPrice, "materialPrice"))
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
