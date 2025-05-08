package com.tharsan.tp7.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.tharsan.tp7.DbConnection;
import com.tharsan.tp7.Model.DetailsUtilisateur;

/**
 * Contrôleur qui gère l'affichage et le chargement des données utilisateurs
 */
public class FXMLUserController {
    // Références aux éléments de l'interface définis dans le FXML
    @FXML private TableView<DetailsUtilisateur> tableView;  // Table d'affichage
    @FXML private TableColumn<DetailsUtilisateur, Integer> colId;  // Colonne ID
    @FXML private TableColumn<DetailsUtilisateur, String> colNom;  // Colonne Nom
    @FXML private TableColumn<DetailsUtilisateur, String> colEmail;  // Colonne Email

    // Collection observable pour stocker et lier les données à la TableView
    private ObservableList<DetailsUtilisateur> data;

    /**
     * Méthode d'initialisation appelée automatiquement après le chargement du FXML
     * Configure les colonnes de la TableView
     */
    @FXML
    private void initialize() {
        // Configurer chaque colonne pour afficher la propriété correspondante du modèle
        // PropertyValueFactory établit le lien entre les colonnes et les propriétés du modèle
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        // Initialiser la liste observable qui contiendra les données
        data = FXCollections.observableArrayList();
    }

    /**
     * Charge les données des utilisateurs depuis la base de données
     * Appelée lorsque l'utilisateur clique sur le bouton "Charger"
     */
    @FXML
    private void loadData() {
        data.clear();  // Vider la liste avant de recharger (évite les doublons)

        // Utilisation du try-with-resources pour assurer la fermeture des ressources SQL
        try (
                // Établir la connexion à la base de données
                Connection conn = DbConnection.getConnection();
                // Créer une déclaration SQL
                Statement stmt = conn.createStatement();
                // Exécuter la requête SQL et obtenir le résultat
                ResultSet rs = stmt.executeQuery("SELECT id, nom, email FROM utilisateurs")
        ) {
            // Parcourir les résultats ligne par ligne
            while (rs.next()) {
                // Créer un nouvel objet DetailsUtilisateur pour chaque enregistrement
                data.add(new DetailsUtilisateur(
                        rs.getInt("id"),         // Récupérer l'ID
                        rs.getString("nom"),      // Récupérer le nom
                        rs.getString("email")     // Récupérer l'email
                ));
            }
            System.out.println(data);
            // Lier la liste de données à la TableView pour l'affichage
            tableView.setItems(data);

        } catch (Exception e) {
            // Afficher les erreurs dans la console pour le débogage
            e.printStackTrace();

            // Note: Dans une application réelle, on afficherait un message d'erreur à l'utilisateur
            // par exemple avec une boîte de dialogue ou un label dédié
        }
    }
}
