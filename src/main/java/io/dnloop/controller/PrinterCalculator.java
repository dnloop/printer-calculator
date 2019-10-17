package io.dnloop.controller;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javax.validation.Valid;

import org.controlsfx.control.textfield.CustomTextField;

import io.dnloop.model.Energy;
import io.dnloop.model.Job;
import io.dnloop.model.Maintenance;
import io.dnloop.model.Material;
import io.dnloop.model.PrintingCost;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class PrinterCalculator {

    private final HostServices hostService;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem miNew;

    @FXML
    private MenuItem miOpen;

    @FXML
    private Menu miOpenRecent;

    @FXML
    private MenuItem miSave;

    @FXML
    private MenuItem miSaveAs;

    @FXML
    private MenuItem miPreferences;

    @FXML
    private MenuItem miQuit;

    @FXML
    private Button btnCalculate;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnReload;

    @FXML
    private CustomTextField total;

    @FXML
    private CustomTextField totalConsumption;

    @FXML
    private CustomTextField consumptionPrice;

    @FXML
    private CustomTextField printerConsumption;

    @FXML
    private CustomTextField workTime;

    @FXML
    private CustomTextField powerSubtotal;

    @FXML
    private CustomTextField partsCost;

    @FXML
    private CustomTextField expectedLife;

    @FXML
    private CustomTextField maintenanceWork;

    @FXML
    private CustomTextField maintenanceSubtotal;

    @FXML
    private ChoiceBox<String> filamentType;

    @FXML
    private CustomTextField diameter;

    @FXML
    private CustomTextField length;

    @FXML
    private CustomTextField filamentPrice;

    @FXML
    private CustomTextField materialSubtotal;

    @FXML
    private CustomTextField jobWT;

    @FXML
    private CustomTextField jobCost;

    @FXML
    private CustomTextField jobSubtotal;

    @FXML
    private CustomTextField markup;

    @FXML
    void calculate(ActionEvent event) {

    }

    @FXML
    void clear(ActionEvent event) {

    }

    @FXML
    void open(ActionEvent event) {

    }

    @FXML
    void openRecent(ActionEvent event) {

    }

    @FXML
    void preferences(ActionEvent event) {

    }

    @FXML
    void quit(ActionEvent event) {

    }

    @FXML
    void reload(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void saveAs(ActionEvent event) {

    }

    PrinterCalculator(HostServices hostServices) {
	this.hostService = hostServices;
    }

    @FXML
    void initialize() {
	assert miNew != null : "fx:id=\"miNew\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert miOpen != null : "fx:id=\"miOpen\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert miOpenRecent != null : "fx:id=\"miOpenRecent\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert miSave != null : "fx:id=\"miSave\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert miSaveAs != null : "fx:id=\"miSaveAs\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert miPreferences != null : "fx:id=\"miPreferences\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert miQuit != null : "fx:id=\"miQuit\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert total != null : "fx:id=\"total\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert btnCalculate != null : "fx:id=\"btnCalculate\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert btnReload != null : "fx:id=\"btnReload\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert totalConsumption != null : "fx:id=\"totalConsumption\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert consumptionPrice != null : "fx:id=\"consumptionPrice\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert printerConsumption != null : "fx:id=\"printerConsumption\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert workTime != null : "fx:id=\"workTime\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert powerSubtotal != null : "fx:id=\"powerSubtotal\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert partsCost != null : "fx:id=\"partsCost\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert expectedLife != null : "fx:id=\"expectedLife\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert maintenanceWork != null : "fx:id=\"maintenanceWork\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert maintenanceSubtotal != null : "fx:id=\"maintenanceSubtotal\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert filamentType != null : "fx:id=\"filamentType\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert diameter != null : "fx:id=\"diameter\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert length != null : "fx:id=\"length\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert filamentPrice != null : "fx:id=\"filamentPrice\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert materialSubtotal != null : "fx:id=\"materialSubtotal\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert jobWT != null : "fx:id=\"jobWT\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert jobCost != null : "fx:id=\"jobCost\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert jobSubtotal != null : "fx:id=\"jobSubtotal\" was not injected: check your FXML file 'printerCalculator.fxml'.";
	assert markup != null : "fx:id=\"markup\" was not injected: check your FXML file 'printerCalculator.fxml'.";

    }
    
    private PrintingCost readFields() {
	Energy energy = new Energy(
		Integer.valueOf(totalConsumption.getText()),
		new BigDecimal(consumptionPrice.getText()),
		Integer.valueOf(printerConsumption.getText()),
		Integer.valueOf(workTime.getText())
	);
	
	Material material = new Material(
		filamentType.getSelectionModel().getSelectedItem(), 
		Float.valueOf(diameter.getText()),
		Integer.valueOf(length.getText()),
		new BigDecimal(filamentPrice.getText())
	);
	
	Maintenance maintenance = new Maintenance(
		new BigDecimal(partsCost.getText()),
		Integer.valueOf(expectedLife.getText()),
		Integer.valueOf(maintenanceWork.getText())
	);
	
	Job job = new Job(Integer.valueOf(
		jobWT.getText()), 
		new BigDecimal(jobCost.getText())
	);
	
	@Valid
	PrintingCost printingCost = new PrintingCost(energy, maintenance, material, job);
	return printingCost ;
    }
}
