package com.tharsan.tp7.Model;

/**
 * Classe modèle représentant un utilisateur avec ses attributs
 * Utilisée pour la liaison avec TableView
 */
public class DetailsUtilisateur {
    private int id;         // Identifiant unique de l'utilisateur
    private String nom;     // Nom de l'utilisateur
    private String email;   // Email de l'utilisateur

    /**
     * Constructeur pour créer une instance d'utilisateur
     * @param id Identifiant unique
     * @param nom Nom de l'utilisateur
     * @param email Email de l'utilisateur
     */
    public DetailsUtilisateur(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    // Getters et setters - Nécessaires pour la liaison avec TableView via PropertyValueFactory

    /**
     * @return L'identifiant de l'utilisateur
     */
    public int getId() {
        return id;
    }

    /**
     * @param id Le nouvel identifiant
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Le nom de l'utilisateur
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom Le nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return L'email de l'utilisateur
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email Le nouvel email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DetailsUtilisateur[id:"+id+"; nom:"+nom+"; email: "+email+"]";
    }
}

