module com.tharsan.tp7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    // Ouvertures pour la réflexion JavaFX
    opens com.tharsan.tp7 to javafx.fxml;
    opens com.tharsan.tp7.Controller to javafx.fxml;
    opens com.tharsan.tp7.Model to javafx.base; // <-- LIGNE CRUCIALE

    // Exportation des packages
    exports com.tharsan.tp7;
    exports com.tharsan.tp7.Controller;
    exports com.tharsan.tp7.Model; // <-- (optionnel mais utile)
}
