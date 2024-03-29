package oop2.module06.simplecontrols;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimpleControlsStarter extends Application {

	@Override
	public void start(Stage primaryStage) {
		Parent rootPanel = new SimpleControls();

		Scene scene = new Scene(rootPanel);

		primaryStage.setTitle("Simple Controls");
		primaryStage.setScene(scene);

		primaryStage.centerOnScreen();
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
