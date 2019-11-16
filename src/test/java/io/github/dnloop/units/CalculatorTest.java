package io.github.dnloop.units;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.dnloop.logic.Calculator;
import io.dnloop.model.Energy;
import io.dnloop.model.Job;
import io.dnloop.model.Maintenance;
import io.dnloop.model.Material;
import io.dnloop.model.MaterialProperty;
import io.dnloop.model.Printer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTest {

    private Printer printer;

    private Energy energy;

    private Maintenance maintenance;

    private Material material;

    private Job job;

    public CalculatorTest() {
    }

    @Test
    public void energyZeroDivision() {
	energy = new Energy(0, new BigDecimal(0), 0, 0);
	assertThat(Calculator.energyTotal(energy), is(new BigDecimal(0)));
    }

    @Test
    public void totalEnergy() {
	energy = new Energy(600, new BigDecimal(2500), 360, 8);
	System.out.println("totalEnergy: " + Calculator.energyTotal(energy));
	assertTrue(Calculator.energyTotal(energy).compareTo(new BigDecimal(0)) > 0);
    }

    @Test
    public void totalMaterial() {
	MaterialProperty materialProperty = new MaterialProperty();
	materialProperty.setDensity(1.24F);

	material = new Material(1.75F, materialProperty, new BigDecimal(1179));
	material.setFilamentLength(6980);
	material.setFilamentWeigth(1000);

	System.out.println("totalMaterial: " + Calculator.materialTotal(material));
	assertTrue(Calculator.materialTotal(material).compareTo(new BigDecimal(0)) > 0);
    }

}
