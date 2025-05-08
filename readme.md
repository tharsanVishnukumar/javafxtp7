## 🧮 Calculatrice JavaFX

- Interface créée avec **FXML**
- Contrôleur : `CalculatorController.java`
- Fonctionnalités :
    - Opérations de base : addition, soustraction, multiplication, division
    - Gestion du point décimal
    - Sécurité de division par zéro
- Vue : `Calculatrice.fxml`
- Style : `myCSS.css`

### 📷 Aperçu

- Affichage : champ `TextField` non modifiable
- Boutons numériques et opérateurs organisés dans une `GridPane` 4x4

---

## 👤 Gestion d’utilisateurs avec MySQL

- Interface TableView affichant la liste des utilisateurs (`id`, `nom`, `email`)
- Vue : `UserView.fxml`
- Contrôleur : `FXMLUserController.java`
- Classe modèle : `DetailsUtilisateur.java`
- Connexion à MySQL via `DbConnection.java`

### 📋 Fonctionnalité

- Chargement des données depuis la base `tp7` via un bouton "Charger"
- Données affichées dans un tableau JavaFX (`TableView`)

---

## 🔌 Connexion MySQL

```java
// Exemple de configuration
URL      = jdbc:mysql://localhost:3306/tp7
USER     = root
PASSWORD = tharsan
