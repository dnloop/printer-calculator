package io.dnloop.model;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;

public class Material {

    private String type;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private float diameter;

    @Digits(fraction = 0, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private int filamentLenght;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal materialPrice;

    public Material() {
    }

    public Material(String type, float diameter, int filamentLenght, BigDecimal materialPrice) {
	super();
	this.type = type;
	this.diameter = diameter;
	this.filamentLenght = filamentLenght;
	this.materialPrice = materialPrice;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public float getDiameter() {
	return diameter;
    }

    public void setDiameter(float diameter) {
	this.diameter = diameter;
    }

    public int getFilamentLenght() {
	return filamentLenght;
    }

    public void setFilamentLenght(int filamentLenght) {
	this.filamentLenght = filamentLenght;
    }

    public BigDecimal getMaterialPrice() {
	return materialPrice;
    }

    public void setMaterialPrice(BigDecimal materialPrice) {
	this.materialPrice = materialPrice;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Float.floatToIntBits(diameter);
	result = prime * result + filamentLenght;
	result = prime * result + ((materialPrice == null) ? 0 : materialPrice.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Material other = (Material) obj;
	if (Float.floatToIntBits(diameter) != Float.floatToIntBits(other.diameter))
	    return false;
	if (filamentLenght != other.filamentLenght)
	    return false;
	if (materialPrice == null) {
	    if (other.materialPrice != null)
		return false;
	} else if (!materialPrice.equals(other.materialPrice))
	    return false;
	if (type == null) {
	    if (other.type != null)
		return false;
	} else if (!type.equals(other.type))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Material [type=" + type + ", diameter=" + diameter + ", filamentLenght=" + filamentLenght
		+ ", materialPrice=" + materialPrice + "]";
    }

}
