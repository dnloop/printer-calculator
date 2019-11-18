package io.dnloop.model;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

public class Energy {

    @Min(value = 1)
    @Digits(fraction = 0, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private Integer totalConsumption;

    @Min(value = 1)
    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal totalPrice;

    @Min(value = 1)
    @Digits(fraction = 0, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private Integer workHours;

    public Energy() {
    }

    public Energy(Integer totalConsumption, BigDecimal totalPrice, Integer printerConsumption, Integer workHours) {
	super();
	this.totalConsumption = totalConsumption;
	this.totalPrice = totalPrice;
	this.workHours = workHours;
    }

    public Integer getTotalConsumption() {
	return totalConsumption;
    }

    public void setTotalConsumption(Integer totalConsumption) {
	this.totalConsumption = totalConsumption;
    }

    public BigDecimal getTotalPrice() {
	return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
	this.totalPrice = totalPrice;
    }

    public Integer getWorkHours() {
	return workHours;
    }

    public void setWorkHours(Integer workHours) {
	this.workHours = workHours;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((totalConsumption == null) ? 0 : totalConsumption.hashCode());
	result = prime * result + ((totalPrice == null) ? 0 : totalPrice.hashCode());
	result = prime * result + ((workHours == null) ? 0 : workHours.hashCode());
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
	Energy other = (Energy) obj;
	if (totalConsumption == null) {
	    if (other.totalConsumption != null)
		return false;
	} else if (!totalConsumption.equals(other.totalConsumption))
	    return false;
	if (totalPrice == null) {
	    if (other.totalPrice != null)
		return false;
	} else if (!totalPrice.equals(other.totalPrice))
	    return false;
	if (workHours == null) {
	    if (other.workHours != null)
		return false;
	} else if (!workHours.equals(other.workHours))
	    return false;

	return true;
    }

    @Override
    public String toString() {
	return "Energy [totalConsumption=" + totalConsumption + ", totalPrice=" + totalPrice + ", workHours="
		+ workHours + "]";
    }

}
