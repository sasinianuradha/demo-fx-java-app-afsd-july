module lk.acpt.demofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens lk.acpt.demofx to javafx.fxml;
    exports lk.acpt.demofx;
    exports lk.acpt.demofx.controller;
    opens lk.acpt.demofx.controller to javafx.fxml;
}