package com.example.workshopjavafx;

import com.example.workshopjavafx.gui.MainViewJ;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Scene mainScene = new Scene(new MainViewJ());

        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Sample JavaFX application");
        primaryStage.show();
    }

}
