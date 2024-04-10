package com.example.proyectofinal.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuPersonalController {

    @FXML
    private Label txtPer;

    @FXML
    void click(ActionEvent event) {
        txtPer.setText("BIENVENIDO PERSONAL");
    }

}
