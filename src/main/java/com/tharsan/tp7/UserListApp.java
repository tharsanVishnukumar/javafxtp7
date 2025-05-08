package com.tharsan.tp7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Classe principale qui lance l'application de gestion des utilisateurs
 */
public class UserListApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charger le fichier FXML qui définit l'interface utilisateur
        Parent root = FXMLLoader.load(getClass().getResource("/com/tharsan/tp7/UserList.fxml"));

        // Créer la scène principale
        Scene scene = new Scene(root);

        // Appliquer la feuille de style CSS (optionnel pour cette application)
        scene.getStylesheets().add(getClass().getResource("/com/tharsan/tp7/UserList.css").toExternalForm());

        // Configurer et afficher la fenêtre principale
        primaryStage.setTitle("Liste des Utilisateurs");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Point d'entrée principal de l'application
     * @param args Arguments de ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        launch(args);  // Initialiser et lancer l'application JavaFX
    }
}
