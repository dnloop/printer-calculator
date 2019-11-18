package io.dnloop.logic;

import java.math.BigDecimal;
import java.math.MathContext;

import io.dnloop.model.Energy;
import io.dnloop.model.Job;
import io.dnloop.model.Material;
import io.dnloop.model.Printer;

public class Calculator {

    private static MathContext mc = new MathContext(4);

    /**
     * <p>
     * The total cost of energy per single printed model.
     * <p>
     * 
     * @param energy
     * @param printer
     * @return BigDecimal
     */
    public static BigDecimal energyTotal(Energy energy, Printer printer) {
	int totalConsumption = energy.getTotalConsumption();
	int printerConsumption = printer.getPrinterConsumption();
	// Note: The total price covers the electricity for every appliance.
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

    /**
     * The labor cost in post processing the model.
     * 
     * @param job
     * @return
     */
    public static BigDecimal jobTotal(Job job) {
	BigDecimal hourlyRate = job.getHourlyRate();
	BigDecimal workHour = new BigDecimal(job.getWorkHours());

	return hourlyRate.multiply(workHour, mc);
    }

    /**
     * The machine maintenance expense cost.
     * 
     * @param energy
     * @param printer
     * @return
     */
    public static BigDecimal maintenanceTotal(Energy energy, Printer printer) {
	BigDecimal total = new BigDecimal(0);

	BigDecimal depreciationExpense;

	int lifeSpan = printer.getMaintenance().getLifeSpan();

	int workHours = lifeSpan * printer.getMaintenance().getWorkHours();

	energy.setWorkHours(workHours * 360);

	BigDecimal powerConsumption = energyTotal(energy, printer);

	try {
	    depreciationExpense = printer.getPrinterPrice().divide(new BigDecimal(lifeSpan * workHours), mc);
	} catch (ArithmeticException e) {
	    depreciationExpense = new BigDecimal(0);
	}

	// Maintenance calculation could be optional but in case its used..
	total.add(depreciationExpense).add(powerConsumption);

	try {
	    BigDecimal maintenance = printer.getParts().totalParts().divide(new BigDecimal(workHours), mc); // maintenance
													    // cost
	    total.add(maintenance); // machine overhead per hour
	} catch (ArithmeticException e) {
	}

	return total;
    }

    /**
     * The total material cost. Currently it only manages filament values in
     * millimeters and weight in grams.
     * 
     * @param material
     * @return
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
