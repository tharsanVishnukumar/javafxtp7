package com.tharsan.tp7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe utilitaire pour gérer la connexion à la base de données MySQL
 */
public class DbConnection {
    // Constantes de connexion à la base de données
    private static final String URL = "jdbc:mysql://localhost:3306/tp7";
    private static final String USER = "root";
    private static final String PASSWORD = "tharsan";

    /**
     * Établit et retourne une connexion à la base de données
     * @return Une connexion active à la base de données
     * @throws SQLException En cas d'erreur de connexion
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        // Utilisation de DriverManager pour créer une connexion avec les paramètres spécifiés
        return DriverManager.getConnection(URL, USER, PASSWORD);

        // Note: Dans une application réelle, ces paramètres devraient être externalisés
        // dans un fichier de configuration et non codés en dur
    }
}
