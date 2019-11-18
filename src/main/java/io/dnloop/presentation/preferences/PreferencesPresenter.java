package io.dnloop.presentation.preferences;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Maintenance;
import io.dnloop.model.Material;
import io.dnloop.model.MaterialProperty;
import io.dnloop.model.Parts;
import io.dnloop.model.Printer;
import io.dnloop.validator.PrinterValidator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuItem;

public class PreferencesPresenter {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem miSave;

    @FXML
    private MenuItem miExit;

    @FXML
    private CustomTextField txtConsumption;

    @FXML
    private CustomTextField txtPrinter;

    @FXML
    private ChoiceBox<MaterialProperty> cbMaterialType;

    @FXML
    private CustomTextField txtDiameter;

    @FXML
    private CustomTextField txtMaterialPrice;

    @FXML
    private CustomTextField txtWorkHour;

    @FXML
    private CustomTextField txtLifeSpan;

    @FXML
    private CustomTextField txtHotbed;

    @FXML
    private CustomTextField txtPowerSwitch;

    @FXML
    private CustomTextField txtFan;

    @FXML
    private CustomTextField txtDisplay;

    @FXML
    private CustomTextField txtProximitySensor;

    @FXML
    private CustomTextField txtHotEnd;

    @FXML
    private CustomTextField txtDriver;

    @FXML
    private CustomTextField txtNozzle;

    @FXML
    private CustomTextField txtExtruder;

    @FXML
    private CustomTextField txtBelt;

    @FXML
    private CustomTextField txtShield;

    @FXML
    private CustomTextField txtResistanceCartridge;

    @FXML
    private CustomTextField txtEndStop;

    @FXML
    private CustomTextField txtBearing;

    @FXML
    private CustomTextField txtPulley;

    @FXML
    private CustomTextField txtStepEngine;

    @FXML
    private CustomTextField txtCoupler;

    @FXML
    private CustomTextField txtThreadedRod;

    @FXML
    void quit(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {
	if (validateFields(readFields()))
	    System.out.println("valid"); // temporal
    }

    protected static final String INTFLOAT = "\\d{0,9}([\\.]\\d{0,2})?";

    protected static final String INT = "\\d{0,9}";

    private PrinterValidator settingsValidator = new PrinterValidator();

    @FXML
    void initialize() {
	assert miSave != null : "fx:id=\"miSave\" was not injected: check your FXML file 'preferences.fxml'.";
	assert miExit != null : "fx:id=\"miExit\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtConsumption != null : "fx:id=\"txtConsumption\" was not injected: check your FXML file 'preferences.fxml'.";
	assert cbMaterialType != null : "fx:id=\"cbMaterialType\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtDiameter != null : "fx:id=\"txtDiameter\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtMaterialPrice != null : "fx:id=\"txtMaterialPrice\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtWorkHour != null : "fx:id=\"txtWorkHour\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtLifeSpan != null : "fx:id=\"txtLifeSpan\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtPrinter != null : "fx:id=\"txtPrinter\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtHotbed != null : "fx:id=\"txtHotbed\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtPowerSwitch != null : "fx:id=\"txtPowerSwitch\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtFan != null : "fx:id=\"txtFan\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtDisplay != null : "fx:id=\"txtDisplay\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtProximitySensor != null : "fx:id=\"txtProximitySensor\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtHotEnd != null : "fx:id=\"txtHotEnd\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtDriver != null : "fx:id=\"txtDriver\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtNozzle != null : "fx:id=\"txtNozzle\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtExtruder != null : "fx:id=\"txtExtruder\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtBelt != null : "fx:id=\"txtBelt\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtShield != null : "fx:id=\"txtShield\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtResistanceCartridge != null : "fx:id=\"txtResistanceCartridge\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtEndStop != null : "fx:id=\"txtEndStop\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtBearing != null : "fx:id=\"txtBearing\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtPulley != null : "fx:id=\"txtPulley\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtStepEngine != null : "fx:id=\"txtStepEngine\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtCoupler != null : "fx:id=\"txtCoupler\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtThreadedRod != null : "fx:id=\"txtThreadedRod\" was not injected: check your FXML file 'preferences.fxml'.";

    }

    private Printer readFields() {
	BigDecimal hotBed = txtHotbed.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtHotbed.getText());
	BigDecimal powerSwitch = txtPowerSwitch.getText().isEmpty() ? new BigDecimal(0)
		: new BigDecimal(txtPowerSwitch.getText());
	BigDecimal fan = txtFan.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtFan.getText());
	BigDecimal display = txtDisplay.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtDisplay.getText());
	BigDecimal proximitySensor = txtProximitySensor.getText().isEmpty() ? new BigDecimal(0)
		: new BigDecimal(txtProximitySensor.getText());
	BigDecimal hotEnd = txtHotEnd.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtHotbed.getText());
	BigDecimal driver = txtDriver.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtDriver.getText());
	BigDecimal nozzle = txtNozzle.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtNozzle.getText());
	BigDecimal extruder = txtExtruder.getText().isEmpty() ? new BigDecimal(0)
		: new BigDecimal(txtExtruder.getText());
	BigDecimal belt = txtBelt.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtBelt.getText());
	BigDecimal shield = txtShield.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtShield.getText());
	BigDecimal resistanceCartridge = txtResistanceCartridge.getText().isEmpty() ? new BigDecimal(0)
		: new BigDecimal(txtResistanceCartridge.getText());
	BigDecimal endStop = txtEndStop.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtEndStop.getText());
	BigDecimal bearing = txtBearing.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtBearing.getText());
	BigDecimal pulley = txtPulley.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtPulley.getText());
	BigDecimal stepEngine = txtStepEngine.getText().isEmpty() ? new BigDecimal(0)
		: new BigDecimal(txtStepEngine.getText());
	BigDecimal coupler = txtCoupler.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(txtCoupler.getText());
	BigDecimal threadedRod = txtThreadedRod.getText().isEmpty() ? new BigDecimal(0)
		: new BigDecimal(txtThreadedRod.getText());

	Integer consumption = txtConsumption.getText().isEmpty() ? 0 : Integer.valueOf(txtConsumption.getText());

	Float diameter = txtDiameter.getText().isEmpty() ? 0 : Float.valueOf(txtDiameter.getText());

	BigDecimal filamentPrice = txtMaterialPrice.getText().isEmpty() ? new BigDecimal(0)
		: new BigDecimal(txtMaterialPrice.getText());

	BigDecimal printerPrice = txtPrinter.getText().isEmpty() ? new BigDecimal(0)
		: new BigDecimal(txtPrinter.getText());

	Integer lifeSpan = txtLifeSpan.getText().isEmpty() ? 0 : Integer.valueOf(txtLifeSpan.getText());
	Integer workHours = txtWorkHour.getText().isEmpty() ? 0 : Integer.valueOf(txtWorkHour.getText());

	Parts parts = new Parts(hotBed, powerSwitch, fan, display, proximitySensor, hotEnd, driver, nozzle, extruder,
		belt, shield, resistanceCartridge, endStop, bearing, pulley, stepEngine, coupler, threadedRod);

	Material material = new Material(diameter, cbMaterialType.getSelectionModel().getSelectedItem(), filamentPrice);

	Maintenance maintenance = new Maintenance(lifeSpan, workHours);

	return new Printer(printerPrice, parts, maintenance, material, consumption);
    }

    private boolean validateFields(Printer settings) {
	settingsValidator.setSettings(settings);

	return settingsValidator.validate(txtHotbed, txtPowerSwitch, txtFan, txtDisplay, txtProximitySensor, txtHotEnd,
		txtDriver, txtNozzle, txtExtruder, txtBelt, txtShield, txtResistanceCartridge, txtEndStop, txtBearing,
		txtPulley, txtStepEngine, txtCoupler, txtThreadedRod, txtConsumption, txtDiameter, txtMaterialPrice,
		txtLifeSpan, txtWorkHour, txtPrinter);
    }
}
