package com.tharsan.tp7.Controller;

import javafx.fxml.FXML;


import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField display;  // Référence à la zone d'affichage

    private double firstOperand = 0;   // Stocke le premier opérande
    private String operator = "";     // Stocke l'opérateur choisi
    private boolean startNew = true;    // Indique si on commence une nouvelle saisie

    @FXML
    private void handleNumber(javafx.event.ActionEvent event) {
        // Récupérer le texte du bouton cliqué
        String value = ((javafx.scene.control.Button) event.getSource()).getText();
        if (startNew) {
            display.setText(value);  // Nouvelle saisie remplace l'affichage
            startNew = false;
        } else {
            display.setText(display.getText() + value);  // Concaténer le chiffre
        }
    }

    @FXML
    private void handleDecimal(javafx.event.ActionEvent event) {
        // Ajouter un point décimal si absent
        if (startNew) {
            display.setText("0.");
            startNew = false;
        } else if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    }

    @FXML
    private void handleOperator(javafx.event.ActionEvent event) {
        // Stocker l'opérateur et le premier opérande
        operator = ((javafx.scene.control.Button) event.getSource()).getText();
        firstOperand = Double.parseDouble(display.getText());
        startNew = true;  // Préparer la saisie du second opérande
    }

    @FXML
    private void handleEquals(javafx.event.ActionEvent event) {
        // Calculer le résultat selon l'opérateur
        double secondOperand = Double.parseDouble(display.getText());
        double result = 0;
        switch (operator) {
            case "+": result = firstOperand + secondOperand; break;
            case "-": result = firstOperand - secondOperand; break;
            case "*": result = firstOperand * secondOperand; break;
            case "/": result = secondOperand != 0 ? firstOperand / secondOperand : 0; break;
        }
        display.setText(String.valueOf(result));  // Afficher le résultat
        startNew = true;  // Préparer une nouvelle saisie
    }
}