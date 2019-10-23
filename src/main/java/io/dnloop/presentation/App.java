package io.dnloop.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.airhacks.afterburner.injection.Injector;

import io.dnloop.presentation.printerCalculator.PrinterCalculatorView;
import io.dnloop.validator.EntityValidator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class App extends Application {

    private ConfigurableApplicationContext springContext;

    @Override
    public void init() throws Exception {
	EntityValidator.buildValid();
	springContext = SpringApplication.run(App.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
	PrinterCalculatorView mainView = new PrinterCalculatorView();
	stage.setScene(new Scene(mainView.getView()));
	stage.show();
    }

    @Override
    public void stop() throws Exception {
	EntityValidator.closeValid();
	Injector.forgetAll();
	springContext.close();
    }

}
