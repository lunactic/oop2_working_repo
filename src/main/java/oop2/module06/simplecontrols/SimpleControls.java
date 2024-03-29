package oop2.module06.simplecontrols;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class SimpleControls extends VBox {
	private Label     label;
	private Button    button;
	private TextField textField;
	private TextArea  textArea;

	public SimpleControls() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		label     = new Label("ein Label");
		textField = new TextField("text field");
		textArea  = new TextArea("text area");
		button    = new Button("ein Button");
	}

	private void layoutControls() {
		setPadding(new Insets(5));
		setSpacing(5);

		setVgrow(textArea, Priority.ALWAYS);

		getChildren().addAll(label, textField, textArea, button);
	}

}
