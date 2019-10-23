package io.dnloop.logic;

import java.math.BigDecimal;
import java.math.MathContext;

import io.dnloop.model.Energy;
import io.dnloop.model.Job;
import io.dnloop.model.Maintenance;
import io.dnloop.model.Material;

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
	BigDecimal workHour = new BigDecimal(job.getWorkHour());
	return hourlyRate.multiply(workHour, mc);
    }

    public static BigDecimal maintenanceTotal(Maintenance maintenance) {
	return null;
    }

    public static BigDecimal materialTotal(Material material) {
	return null;
    }
}
