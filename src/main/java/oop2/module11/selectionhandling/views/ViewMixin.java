package oop2.module11.selectionhandling.views;

import java.util.List;

public interface ViewMixin {

	default void init() {
        initializeSelf();
        initializeControls();
		layoutControls();
		setupEventHandlers();
		setupValueChangedListeners();
		setupBindings();
	}

	default void initializeSelf(){
    }

	void initializeControls();

	void layoutControls();

	default void setupEventHandlers() {
	}

	default void setupValueChangedListeners() {
	}

	default void setupBindings() {
	}

    default void addStylesheetFiles(String... stylesheetFile){
        for(String file : stylesheetFile){
            String stylesheet = getClass().getResource(file).toExternalForm();
            getStylesheets().add(stylesheet);
        }
    }

    List<String> getStylesheets();
}
