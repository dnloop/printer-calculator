package io.dnloop.presentation.preferences;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.textfield.CustomTextField;

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
    private ChoiceBox<?> cbMaterialType;

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
    private CustomTextField txtResitanceCartridge;

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

    }

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
	assert txtResitanceCartridge != null : "fx:id=\"txtResitanceCartridge\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtEndStop != null : "fx:id=\"txtEndStop\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtBearing != null : "fx:id=\"txtBearing\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtPulley != null : "fx:id=\"txtPulley\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtStepEngine != null : "fx:id=\"txtStepEngine\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtCoupler != null : "fx:id=\"txtCoupler\" was not injected: check your FXML file 'preferences.fxml'.";
	assert txtThreadedRod != null : "fx:id=\"txtThreadedRod\" was not injected: check your FXML file 'preferences.fxml'.";

    }
}
