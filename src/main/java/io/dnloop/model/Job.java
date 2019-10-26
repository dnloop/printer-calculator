package io.dnloop.model;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;

public class Job {

    @Digits(fraction = 0, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private int workHours;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal hourlyRate;

    public Job() {
    }

    public Job(int workHours, BigDecimal hourlyRate) {
	super();
	this.workHours = workHours;
	this.hourlyRate = hourlyRate;
    }

    public BigDecimal getHourlyRate() {
	return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
	this.hourlyRate = hourlyRate;
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
	result = prime * result + ((hourlyRate == null) ? 0 : hourlyRate.hashCode());
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
	Job other = (Job) obj;
	if (hourlyRate == null) {
	    if (other.hourlyRate != null)
		return false;
	} else if (!hourlyRate.equals(other.hourlyRate))
	    return false;
	if (workHours != other.workHours)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Job [workHours=" + workHours + ", hourlyRate=" + hourlyRate + "]";
    }

}
