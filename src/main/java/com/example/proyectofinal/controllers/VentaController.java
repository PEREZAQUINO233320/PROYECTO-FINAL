package com.example.proyectofinal.controllers;

import com.example.proyectofinal.models.Venta;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class VentaController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnConfirm;

    @FXML
    private TableColumn colCantidad;

    @FXML
    private TableColumn colProducto;

    @FXML
    private TableColumn colTotal;

    @FXML
    private TableView<Venta> tblVenta;

    ObservableList<Venta> listaVenta;

    @FXML
    void clickCancelar(ActionEvent event) {

    }

    @FXML
    void clickConfirmar(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

}
