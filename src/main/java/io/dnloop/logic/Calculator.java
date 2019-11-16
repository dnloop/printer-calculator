package io.dnloop.logic;

import java.math.BigDecimal;
import java.math.MathContext;

import io.dnloop.model.Energy;
import io.dnloop.model.Job;
import io.dnloop.model.Material;
import io.dnloop.model.Printer;

public class Calculator {

    private static MathContext mc = new MathContext(4);

    public static BigDecimal energyTotal(Energy energy) {
	int totalConsumption = energy.getTotalConsumption();
	int printerConsumption = energy.getPrinterConsumption();
	BigDecimal totalPrice = energy.getTotalPrice();
	int workTime = energy.getWorkHours();
	/*
	 * totalConsumption (Kw) * printerConsumption (W) * 1000
	 */
	BigDecimal totalWatt = new BigDecimal(Converter.toWatt(totalConsumption) * printerConsumption);
	BigDecimal totalWork = new BigDecimal(workTime * printerConsumption);
	/*
	 * (totalWork (machine consumption) * totalPrice (Electric Bill)) / totalWatt
	 */

	try {
	    return totalPrice.multiply(totalWork, mc).divide(totalWatt, mc);
	} catch (ArithmeticException e) {
	    return new BigDecimal(0);
	}
    }

    public static BigDecimal jobTotal(Job job) {
	BigDecimal hourlyRate = job.getHourlyRate();
	BigDecimal workHour = new BigDecimal(job.getWorkHours());

	return hourlyRate.multiply(workHour, mc);
    }

    public static BigDecimal maintenanceTotal(Printer printer) {
	BigDecimal lifeSpan = new BigDecimal(printer.getMaintenance().getLifeSpan());

	BigDecimal workHours = lifeSpan.multiply(new BigDecimal(printer.getMaintenance().getWorkHours())); // daily ->
													   // yearly

	BigDecimal depreciationExpense = printer.getPrinterPrice().divide(lifeSpan.multiply(workHours));

	BigDecimal powerConsumption = new BigDecimal(printer.getEnergy().getYearlyConsumption() * 24); // Watt

	BigDecimal maintenance = printer.getParts().totalParts().divide(workHours); // maintenance cost

	BigDecimal total = maintenance.add(depreciationExpense).add(powerConsumption); // machine overhead per hour

	return total;
    }

    /**
     * Currently it only manages filament values in millimeters and weight in grams
     */
    public static BigDecimal materialTotal(Material material) {

	BigDecimal diameter = new BigDecimal(material.getDiameter()); // mm

	BigDecimal radius = diameter.divide(new BigDecimal(2), mc).pow(2);

	BigDecimal pi = new BigDecimal(Math.PI);

	BigDecimal length = new BigDecimal(material.getFilamentLength()); // mm

	BigDecimal density = new BigDecimal(material.getType().getDensity());

	BigDecimal weight = new BigDecimal(material.getFilamentWeigth());

	BigDecimal price = material.getMaterialPrice();

	BigDecimal materialCost = density.multiply(pi).multiply(radius).multiply(length).multiply(price);

	return materialCost.divide(weight, mc).divide(weight, mc);
    }
}
