package io.dnloop.presentation.printerCalculator;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.textfield.CustomTextField;
import org.springframework.stereotype.Controller;

import io.dnloop.model.Energy;
import io.dnloop.model.Job;
import io.dnloop.model.Maintenance;
import io.dnloop.model.Material;
import io.dnloop.model.PrintingCost;
import io.dnloop.validator.PrintingCostValidator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

@Controller
public class PrinterCalculatorPresenter {

    protected static final String INTFLOAT = "\\d{0,9}([\\.]\\d{0,2})?";

    protected static final String INT = "\\d{0,9}";

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
	if (validateFields(readFields()))
	    System.out.println("valid");
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

    private PrintingCostValidator costValidator = new PrintingCostValidator();

    @FXML
    void initialize() {
	assert miNew != null : "fx:id=\"miNew\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert miOpen != null : "fx:id=\"miOpen\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert miOpenRecent != null : "fx:id=\"miOpenRecent\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert miSave != null : "fx:id=\"miSave\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert miSaveAs != null : "fx:id=\"miSaveAs\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert miPreferences != null : "fx:id=\"miPreferences\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert miQuit != null : "fx:id=\"miQuit\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert total != null : "fx:id=\"total\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert btnCalculate != null : "fx:id=\"btnCalculate\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert btnReload != null : "fx:id=\"btnReload\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert totalConsumption != null : "fx:id=\"totalConsumption\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert consumptionPrice != null : "fx:id=\"consumptionPrice\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert printerConsumption != null : "fx:id=\"printerConsumption\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert workTime != null : "fx:id=\"workTime\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert powerSubtotal != null : "fx:id=\"powerSubtotal\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert partsCost != null : "fx:id=\"partsCost\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert expectedLife != null : "fx:id=\"expectedLife\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert maintenanceWork != null : "fx:id=\"maintenanceWork\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert maintenanceSubtotal != null : "fx:id=\"maintenanceSubtotal\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert filamentType != null : "fx:id=\"filamentType\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert diameter != null : "fx:id=\"diameter\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert length != null : "fx:id=\"length\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert filamentPrice != null : "fx:id=\"filamentPrice\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert materialSubtotal != null : "fx:id=\"materialSubtotal\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert jobWT != null : "fx:id=\"jobWT\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert jobCost != null : "fx:id=\"jobCost\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert jobSubtotal != null : "fx:id=\"jobSubtotal\" was not injected: check your FXML file 'printercalculator.fxml'.";
	assert markup != null : "fx:id=\"markup\" was not injected: check your FXML file 'printercalculator.fxml'.";

	totalConsumption.textProperty().addListener((observable, oldValue, newValue) -> {
	    if (!newValue.matches(INTFLOAT))
		totalConsumption.setText(oldValue);
	});

	consumptionPrice.textProperty().addListener((observable, oldValue, newValue) -> {
	    if (!newValue.matches(INTFLOAT))
		consumptionPrice.setText(oldValue);
	});

	printerConsumption.textProperty().addListener((observable, oldValue, newValue) -> {
	    if (!newValue.matches(INT))
		printerConsumption.setText(oldValue);
	});

	workTime.textProperty().addListener((observable, oldValue, newValue) -> {
	    if (!newValue.matches(INT))
		workTime.setText(oldValue);
	});

	powerSubtotal.textProperty().addListener((observable, oldValue, newValue) -> {
	    if (!newValue.matches(INTFLOAT))
		powerSubtotal.setText(oldValue);
	});

//	btnCalculate.setOnAction((event) -> {
//	    if (validateFields(readFields()))
//		System.out.println("valid");
//	}); WTF!
    }

    private PrintingCost readFields() {
	Integer tc = totalConsumption.getText().isEmpty() ? 0 : Integer.valueOf(totalConsumption.getText());
	BigDecimal cp = consumptionPrice.getText().isEmpty() ? new BigDecimal(0)
		: new BigDecimal(consumptionPrice.getText());
	Integer pc = printerConsumption.getText().isEmpty() ? 0 : Integer.valueOf(printerConsumption.getText());
	Integer wt = workTime.getText().isEmpty() ? 0 : Integer.valueOf(workTime.getText());

	Energy energy = new Energy(tc, cp, pc, wt);

	Float dm = diameter.getText().isEmpty() ? 0 : Float.valueOf(diameter.getText());
	Integer lg = length.getText().isEmpty() ? 0 : Integer.valueOf(length.getText());

	BigDecimal fp = filamentPrice.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(filamentPrice.getText());

	Material material = new Material(filamentType.getSelectionModel().getSelectedItem(), dm, lg, fp);

	BigDecimal ptsc = partsCost.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(partsCost.getText());
	Integer el = expectedLife.getText().isEmpty() ? 0 : Integer.valueOf(expectedLife.getText());
	Integer mw = maintenanceWork.getText().isEmpty() ? 0 : Integer.valueOf(maintenanceWork.getText());

	Maintenance maintenance = new Maintenance(ptsc, el, mw);

	Integer jwt = jobWT.getText().isEmpty() ? 0 : Integer.valueOf(jobWT.getText());
	BigDecimal jc = jobCost.getText().isEmpty() ? new BigDecimal(0) : new BigDecimal(jobCost.getText());

	Job job = new Job(jwt, jc);

	return new PrintingCost(energy, maintenance, material, job);
    }

    private boolean validateFields(PrintingCost fields) {
	costValidator.setEntity(fields);
	return costValidator.validate(totalConsumption, consumptionPrice, printerConsumption, workTime, diameter,
		length, filamentPrice, partsCost, expectedLife, maintenanceWork, jobWT, jobCost, markup);
    }

}