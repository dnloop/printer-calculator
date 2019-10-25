package io.dnloop.model;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;

public class Maintenance {

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal totalPartsPrice;

    @Digits(fraction = 0, integer = 3, message = "Exceso de Dígitos: mayor a 3")
    private int lifeSpan;

    @Digits(fraction = 0, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private int workHours;

    private Parts parts;

    public Maintenance() {
    }

    public Maintenance(BigDecimal totalPartsPrice, int lifeSpan, int workHours) {
	super();
	this.totalPartsPrice = totalPartsPrice;
	this.lifeSpan = lifeSpan;
	this.workHours = workHours;
    }

    public Maintenance(Integer lifeSpan, Integer workHours) {
	this.lifeSpan = lifeSpan;
	this.workHours = workHours;
    }

    public BigDecimal getTotalPartsPrice() {
	return totalPartsPrice;
    }

    public void setTotalPartsPrice(BigDecimal totalPartsPrice) {
	this.totalPartsPrice = totalPartsPrice;
    }

    public int getLifeSpan() {
	return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
	this.lifeSpan = lifeSpan;
    }

    public int getWorkHours() {
	return workHours;
    }

    public void setWorkHours(int workHours) {
	this.workHours = workHours;
    }

    public Parts getParts() {
	return parts;
    }

    public void setParts(Parts parts) {
	this.parts = parts;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + lifeSpan;
	result = prime * result + ((parts == null) ? 0 : parts.hashCode());
	result = prime * result + ((totalPartsPrice == null) ? 0 : totalPartsPrice.hashCode());
	result = prime * result + workHours;
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
	Maintenance other = (Maintenance) obj;
	if (lifeSpan != other.lifeSpan)
	    return false;
	if (parts == null) {
	    if (other.parts != null)
		return false;
	} else if (!parts.equals(other.parts))
	    return false;
	if (totalPartsPrice == null) {
	    if (other.totalPartsPrice != null)
		return false;
	} else if (!totalPartsPrice.equals(other.totalPartsPrice))
	    return false;
	if (workHours != other.workHours)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Maintenance [totalPartsPrice=" + totalPartsPrice + ", lifeSpan=" + lifeSpan + ", workHours=" + workHours
		+ ", parts=" + parts + "]";
    }

}
