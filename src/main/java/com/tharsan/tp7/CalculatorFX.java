package com.tharsan.tp7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charger la vue FXML
        Parent root = FXMLLoader.load(getClass().getResource("/com/tharsan/tp7/Calculatrice.fxml"));
        // Créer la scène principale
        Scene scene = new Scene(root);
        // Appliquer la feuille de style
        scene.getStylesheets().add(getClass().getResource("/com/tharsan/tp7/Calculatrice.css").toExternalForm());

        primaryStage.setTitle("Calculatrice JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}