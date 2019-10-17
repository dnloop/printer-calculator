package io.dnloop.printcalc;

import java.io.IOException;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    private ConfigurableApplicationContext context;

    @Override
    public void init() throws Exception {

	ApplicationContextInitializer<GenericApplicationContext> initializer = applicationContext -> {
	    applicationContext.registerBean(Application.class, () -> App.this);
	    applicationContext.registerBean(Parameters.class, this::getParameters);
	    applicationContext.registerBean(HostServices.class, this::getHostServices);

	};

	this.context = new SpringApplicationBuilder().sources(PrintCalcApplication.class).initializers(initializer)
		.run(getParameters().getRaw().toArray(new String[0]));
    }

    @Override
    public void start(Stage stage) throws IOException {
	this.context.publishEvent(new StageReadyEvent(stage));
    }

    static void setRoot(String fxml) throws IOException {
	scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
	FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
	return fxmlLoader.load();
    }

    public static void main(String[] args) {
	launch();
    }

    @Override
    public void stop() throws Exception {
	this.context.close();
	Platform.exit();
    }

    class StageReadyEvent extends ApplicationEvent {

	/**
	 * Serialization UID
	 */
	private static final long serialVersionUID = 1L;

	public Stage getStage() {
	    return Stage.class.cast(getSource());
	}

	public StageReadyEvent(Object source) {
	    super(source);
	}
    }
}