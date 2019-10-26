package io.dnloop.logic;

import java.math.BigDecimal;
import java.math.MathContext;

import io.dnloop.model.Energy;
import io.dnloop.model.Job;
import io.dnloop.model.Material;
import io.dnloop.model.Printer;

public class Calculator {

    private static MathContext mc = new MathContext(2);

    public static BigDecimal energyTotal(Energy energy) {
	int totalConsumption = energy.getTotalConsumption();
	int printerConsumption = energy.getPrinterConsumption();
	BigDecimal consumptionPrice = energy.getTotalPrice();
	int workTime = energy.getWorkHours();
	BigDecimal totalWatt = new BigDecimal(Converter.toWatt(totalConsumption) * printerConsumption);
	BigDecimal totalWork = new BigDecimal(workTime * printerConsumption);

	return totalWatt.divide(consumptionPrice.multiply(totalWork, mc), mc);
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

    public static BigDecimal materialTotal(Material material) {

	BigDecimal diameter = new BigDecimal(material.getDiameter()); // mm

	BigDecimal radius = diameter.divide(new BigDecimal(2));

	BigDecimal pi = new BigDecimal(Math.PI);

	BigDecimal length = new BigDecimal(material.getFilamentLength()); // mm

	BigDecimal volume = radius.pow(2).multiply(length).multiply(pi);

	BigDecimal weight = new BigDecimal(1000); // kg

	BigDecimal density = weight.divide(volume);

	BigDecimal materialCost = density.multiply(pi).multiply(
		diameter.divide(new BigDecimal(2)).pow(2).multiply(length).multiply(material.getMaterialPrice()));

	return materialCost;
    }
}
