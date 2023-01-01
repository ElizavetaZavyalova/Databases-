module com.example.coursework {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.coursework to javafx.fxml;
    exports com.example.coursework;
    exports com.example.coursework.account;
    opens com.example.coursework.account to javafx.fxml;
    exports com.example.coursework.sculptureInformation;
    opens com.example.coursework.sculptureInformation to javafx.fxml;
}