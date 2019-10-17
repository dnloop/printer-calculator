package io.dnloop.model;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;

public class Energy {

    @Digits(fraction = 0, integer = 9)
    private int totalConsumption;

    @Digits(fraction = 2, integer = 9)
    private BigDecimal totalPrice;

    @Digits(fraction = 0, integer = 9)
    private int printerConsumption;

    @Digits(fraction = 0, integer = 9)
    private int workHours;

    public Energy() {
    }

    public Energy(int totalConsumption, BigDecimal totalPrice, int printerConsumption, int workHours) {
	super();
	this.totalConsumption = totalConsumption;
	this.totalPrice = totalPrice;
	this.printerConsumption = printerConsumption;
	this.workHours = workHours;
    }

    public int getTotalConsumption() {
	return totalConsumption;
    }

    public void setTotalConsumption(int totalConsumption) {
	this.totalConsumption = totalConsumption;
    }

    public BigDecimal getTotalPrice() {
	return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
	this.totalPrice = totalPrice;
    }

    public int getPrinterConsumption() {
	return printerConsumption;
    }

    public void setPrinterConsumption(int printerConsumption) {
	this.printerConsumption = printerConsumption;
    }

    public int getWorkHours() {
	return workHours;
    }

    public void setWorkHours(int workHours) {
	this.workHours = workHours;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + printerConsumption;
	result = prime * result + totalConsumption;
	result = prime * result + ((totalPrice == null) ? 0 : totalPrice.hashCode());
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
	Energy other = (Energy) obj;
	if (printerConsumption != other.printerConsumption)
	    return false;
	if (totalConsumption != other.totalConsumption)
	    return false;
	if (totalPrice == null) {
	    if (other.totalPrice != null)
		return false;
	} else if (!totalPrice.equals(other.totalPrice))
	    return false;
	if (workHours != other.workHours)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Energy [totalConsumption=" + totalConsumption + ", totalPrice=" + totalPrice + ", printerConsumption="
		+ printerConsumption + ", workHours=" + workHours + "]";
    }

}
