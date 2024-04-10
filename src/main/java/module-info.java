module com.example.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectofinal to javafx.fxml;
    exports com.example.proyectofinal;
    exports com.example.proyectofinal.controllers;
    opens com.example.proyectofinal.controllers to javafx.fxml;
}