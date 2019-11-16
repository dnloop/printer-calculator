package io.dnloop.model;

import javafx.util.Pair;

public class MaterialProperty {

    private String name;

    private String brand;

    private Pair<Integer, Integer> serviceTemp;

    private Pair<Integer, Integer> extruderTemp;

    private Pair<Integer, Integer> bedTemp;

    private float termalExpansion;

    private float density;

    public MaterialProperty() {
	super();
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getBrand() {
	return brand;
    }

    public void setBrand(String brand) {
	this.brand = brand;
    }

    public Pair<Integer, Integer> getServiceTemp() {
	return serviceTemp;
    }

    public void setServiceTemp(Pair<Integer, Integer> serviceTemp) {
	this.serviceTemp = serviceTemp;
    }

    public Pair<Integer, Integer> getExtruderTemp() {
	return extruderTemp;
    }

    public void setExtruderTemp(Pair<Integer, Integer> extruderTemp) {
	this.extruderTemp = extruderTemp;
    }

    public Pair<Integer, Integer> getBedTemp() {
	return bedTemp;
    }

    public void setBedTemp(Pair<Integer, Integer> bedTemp) {
	this.bedTemp = bedTemp;
    }

    public float getTermalExpansion() {
	return termalExpansion;
    }

    public void setTermalExpansion(float termalExpansion) {
	this.termalExpansion = termalExpansion;
    }

    public float getDensity() {
	return density;
    }

    public void setDensity(float density) {
	this.density = density;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bedTemp == null) ? 0 : bedTemp.hashCode());
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + Float.floatToIntBits(density);
	result = prime * result + ((extruderTemp == null) ? 0 : extruderTemp.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((serviceTemp == null) ? 0 : serviceTemp.hashCode());
	result = prime * result + Float.floatToIntBits(termalExpansion);
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
	MaterialProperty other = (MaterialProperty) obj;
	if (bedTemp == null) {
	    if (other.bedTemp != null)
		return false;
	} else if (!bedTemp.equals(other.bedTemp))
	    return false;
	if (brand == null) {
	    if (other.brand != null)
		return false;
	} else if (!brand.equals(other.brand))
	    return false;
	if (Float.floatToIntBits(density) != Float.floatToIntBits(other.density))
	    return false;
	if (extruderTemp == null) {
	    if (other.extruderTemp != null)
		return false;
	} else if (!extruderTemp.equals(other.extruderTemp))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (serviceTemp == null) {
	    if (other.serviceTemp != null)
		return false;
	} else if (!serviceTemp.equals(other.serviceTemp))
	    return false;
	if (Float.floatToIntBits(termalExpansion) != Float.floatToIntBits(other.termalExpansion))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "MaterialProperty [name=" + name + "]";
    }

}
