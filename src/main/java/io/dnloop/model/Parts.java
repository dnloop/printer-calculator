package io.dnloop.model;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.validation.constraints.Digits;

public class Parts {

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal hotBed;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal powerSwitch;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal fan;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal display;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal proximitySensor;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal hotEnd;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal driver;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal nozzle;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal extruder;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal belt;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal shield;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal resistanceCartridge;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal endStop;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal bearing;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal pulley;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal stepEngine;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal coupler;

    @Digits(fraction = 2, integer = 9, message = "Exceso de Dígitos: mayor a 9")
    private BigDecimal threadedRod;

    public Parts() {
    }

    public Parts(BigDecimal hotBed, BigDecimal powerSwitch, BigDecimal fan, BigDecimal display,
	    BigDecimal proximitySensor, BigDecimal hotEnd, BigDecimal driver, BigDecimal nozzle, BigDecimal extruder,
	    BigDecimal belt, BigDecimal shield, BigDecimal resistanceCartridge, BigDecimal endStop, BigDecimal bearing,
	    BigDecimal pulley, BigDecimal stepEngine, BigDecimal coupler, BigDecimal threadeRod) {
	super();
	this.hotBed = hotBed;
	this.powerSwitch = powerSwitch;
	this.fan = fan;
	this.display = display;
	this.proximitySensor = proximitySensor;
	this.hotEnd = hotEnd;
	this.driver = driver;
	this.nozzle = nozzle;
	this.extruder = extruder;
	this.belt = belt;
	this.shield = shield;
	this.resistanceCartridge = resistanceCartridge;
	this.endStop = endStop;
	this.bearing = bearing;
	this.pulley = pulley;
	this.stepEngine = stepEngine;
	this.coupler = coupler;
	this.threadedRod = threadeRod;
    }

    public BigDecimal getHotBed() {
	return hotBed;
    }

    public void setHotBed(BigDecimal hotBed) {
	this.hotBed = hotBed;
    }

    public BigDecimal getPowerSwitch() {
	return powerSwitch;
    }

    public void setPowerSwitch(BigDecimal powerSwitch) {
	this.powerSwitch = powerSwitch;
    }

    public BigDecimal getFan() {
	return fan;
    }

    public void setFan(BigDecimal fan) {
	this.fan = fan;
    }

    public BigDecimal getDisplay() {
	return display;
    }

    public void setDisplay(BigDecimal display) {
	this.display = display;
    }

    public BigDecimal getProximitySensor() {
	return proximitySensor;
    }

    public void setProximitySensor(BigDecimal proximitySensor) {
	this.proximitySensor = proximitySensor;
    }

    public BigDecimal getHotEnd() {
	return hotEnd;
    }

    public void setHotEnd(BigDecimal hotEnd) {
	this.hotEnd = hotEnd;
    }

    public BigDecimal getDriver() {
	return driver;
    }

    public void setDriver(BigDecimal driver) {
	this.driver = driver;
    }

    public BigDecimal getNozzle() {
	return nozzle;
    }

    public void setNozzle(BigDecimal nozzle) {
	this.nozzle = nozzle;
    }

    public BigDecimal getExtruder() {
	return extruder;
    }

    public void setExtruder(BigDecimal extruder) {
	this.extruder = extruder;
    }

    public BigDecimal getBelt() {
	return belt;
    }

    public void setBelt(BigDecimal belt) {
	this.belt = belt;
    }

    public BigDecimal getShield() {
	return shield;
    }

    public void setShield(BigDecimal shield) {
	this.shield = shield;
    }

    public BigDecimal getResistanceCartridge() {
	return resistanceCartridge;
    }

    public void setResistanceCartridge(BigDecimal resistanceCartridge) {
	this.resistanceCartridge = resistanceCartridge;
    }

    public BigDecimal getEndStop() {
	return endStop;
    }

    public void setEndStop(BigDecimal endStop) {
	this.endStop = endStop;
    }

    public BigDecimal getBearing() {
	return bearing;
    }

    public void setBearing(BigDecimal bearing) {
	this.bearing = bearing;
    }

    public BigDecimal getPulley() {
	return pulley;
    }

    public void setPulley(BigDecimal pulley) {
	this.pulley = pulley;
    }

    public BigDecimal getStepEngine() {
	return stepEngine;
    }

    public void setStepEngine(BigDecimal stepEngine) {
	this.stepEngine = stepEngine;
    }

    public BigDecimal getCoupler() {
	return coupler;
    }

    public void setCoupler(BigDecimal coupler) {
	this.coupler = coupler;
    }

    public BigDecimal getThreadeRod() {
	return threadedRod;
    }

    public void setThreadeRod(BigDecimal threadeRod) {
	this.threadedRod = threadeRod;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bearing == null) ? 0 : bearing.hashCode());
	result = prime * result + ((belt == null) ? 0 : belt.hashCode());
	result = prime * result + ((coupler == null) ? 0 : coupler.hashCode());
	result = prime * result + ((display == null) ? 0 : display.hashCode());
	result = prime * result + ((driver == null) ? 0 : driver.hashCode());
	result = prime * result + ((endStop == null) ? 0 : endStop.hashCode());
	result = prime * result + ((extruder == null) ? 0 : extruder.hashCode());
	result = prime * result + ((fan == null) ? 0 : fan.hashCode());
	result = prime * result + ((hotBed == null) ? 0 : hotBed.hashCode());
	result = prime * result + ((hotEnd == null) ? 0 : hotEnd.hashCode());
	result = prime * result + ((nozzle == null) ? 0 : nozzle.hashCode());
	result = prime * result + ((powerSwitch == null) ? 0 : powerSwitch.hashCode());
	result = prime * result + ((proximitySensor == null) ? 0 : proximitySensor.hashCode());
	result = prime * result + ((pulley == null) ? 0 : pulley.hashCode());
	result = prime * result + ((resistanceCartridge == null) ? 0 : resistanceCartridge.hashCode());
	result = prime * result + ((shield == null) ? 0 : shield.hashCode());
	result = prime * result + ((stepEngine == null) ? 0 : stepEngine.hashCode());
	result = prime * result + ((threadedRod == null) ? 0 : threadedRod.hashCode());
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
	Parts other = (Parts) obj;
	if (bearing == null) {
	    if (other.bearing != null)
		return false;
	} else if (!bearing.equals(other.bearing))
	    return false;
	if (belt == null) {
	    if (other.belt != null)
		return false;
	} else if (!belt.equals(other.belt))
	    return false;
	if (coupler == null) {
	    if (other.coupler != null)
		return false;
	} else if (!coupler.equals(other.coupler))
	    return false;
	if (display == null) {
	    if (other.display != null)
		return false;
	} else if (!display.equals(other.display))
	    return false;
	if (driver == null) {
	    if (other.driver != null)
		return false;
	} else if (!driver.equals(other.driver))
	    return false;
	if (endStop == null) {
	    if (other.endStop != null)
		return false;
	} else if (!endStop.equals(other.endStop))
	    return false;
	if (extruder == null) {
	    if (other.extruder != null)
		return false;
	} else if (!extruder.equals(other.extruder))
	    return false;
	if (fan == null) {
	    if (other.fan != null)
		return false;
	} else if (!fan.equals(other.fan))
	    return false;
	if (hotBed == null) {
	    if (other.hotBed != null)
		return false;
	} else if (!hotBed.equals(other.hotBed))
	    return false;
	if (hotEnd == null) {
	    if (other.hotEnd != null)
		return false;
	} else if (!hotEnd.equals(other.hotEnd))
	    return false;
	if (nozzle == null) {
	    if (other.nozzle != null)
		return false;
	} else if (!nozzle.equals(other.nozzle))
	    return false;
	if (powerSwitch == null) {
	    if (other.powerSwitch != null)
		return false;
	} else if (!powerSwitch.equals(other.powerSwitch))
	    return false;
	if (proximitySensor == null) {
	    if (other.proximitySensor != null)
		return false;
	} else if (!proximitySensor.equals(other.proximitySensor))
	    return false;
	if (pulley == null) {
	    if (other.pulley != null)
		return false;
	} else if (!pulley.equals(other.pulley))
	    return false;
	if (resistanceCartridge == null) {
	    if (other.resistanceCartridge != null)
		return false;
	} else if (!resistanceCartridge.equals(other.resistanceCartridge))
	    return false;
	if (shield == null) {
	    if (other.shield != null)
		return false;
	} else if (!shield.equals(other.shield))
	    return false;
	if (stepEngine == null) {
	    if (other.stepEngine != null)
		return false;
	} else if (!stepEngine.equals(other.stepEngine))
	    return false;
	if (threadedRod == null) {
	    if (other.threadedRod != null)
		return false;
	} else if (!threadedRod.equals(other.threadedRod))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Parts [hotBed=" + hotBed + ", powerSwitch=" + powerSwitch + ", fan=" + fan + ", display=" + display
		+ ", proximitySensor=" + proximitySensor + ", hotEnd=" + hotEnd + ", driver=" + driver + ", nozzle="
		+ nozzle + ", extruder=" + extruder + ", belt=" + belt + ", shield=" + shield + ", resistanceCartridge="
		+ resistanceCartridge + ", endStop=" + endStop + ", bearing=" + bearing + ", pulley=" + pulley
		+ ", stepEngine=" + stepEngine + ", coupler=" + coupler + ", threadeRod=" + threadedRod + "]";
    }

    private void checkNull() {
	if (hotBed == null)
	    hotBed = new BigDecimal(0);

	if (powerSwitch == null)
	    powerSwitch = new BigDecimal(0);

	if (fan == null)
	    fan = new BigDecimal(0);

	if (display == null)
	    display = new BigDecimal(0);

	if (proximitySensor == null)
	    proximitySensor = new BigDecimal(0);

	if (hotEnd == null)
	    hotEnd = new BigDecimal(0);

	if (driver == null)
	    driver = new BigDecimal(0);

	if (nozzle == null)
	    nozzle = new BigDecimal(0);

	if (extruder == null)
	    extruder = new BigDecimal(0);

	if (belt == null)
	    belt = new BigDecimal(0);

	if (shield == null)
	    shield = new BigDecimal(0);

	if (resistanceCartridge == null)
	    resistanceCartridge = new BigDecimal(0);

	if (endStop == null)
	    endStop = new BigDecimal(0);

	if (bearing == null)
	    bearing = new BigDecimal(0);

	if (pulley == null)
	    pulley = new BigDecimal(0);

	if (stepEngine == null)
	    stepEngine = new BigDecimal(0);

	if (coupler == null)
	    coupler = new BigDecimal(0);

	if (threadedRod == null)
	    threadedRod = new BigDecimal(0);
    }

    private ArrayList<BigDecimal> partsList() {
	checkNull();
	ArrayList<BigDecimal> list = new ArrayList<>();
	list.add(hotBed);
	list.add(powerSwitch);
	list.add(fan);
	list.add(display);
	list.add(proximitySensor);
	list.add(hotEnd);
	list.add(driver);
	list.add(nozzle);
	list.add(extruder);
	list.add(belt);
	list.add(shield);
	list.add(resistanceCartridge);
	list.add(endStop);
	list.add(bearing);
	list.add(pulley);
	list.add(stepEngine);
	list.add(coupler);
	list.add(threadedRod);

	return list;
    }

    public BigDecimal totalParts() {
	BigDecimal total = new BigDecimal(0);
	for (BigDecimal part : partsList())
	    total.add(part);

	return total;
    }

}
