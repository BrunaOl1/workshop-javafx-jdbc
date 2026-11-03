package com.example.workshopjavafx.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainViewJ extends AnchorPane {
    public MainViewJ() {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/gui/MainView.fxml")
        );

        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
