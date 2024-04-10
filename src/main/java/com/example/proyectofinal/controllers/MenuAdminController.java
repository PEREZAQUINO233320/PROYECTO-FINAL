package com.example.proyectofinal.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MenuAdminController {
    @FXML
    private AnchorPane APPanel;

    @FXML
    private Button btnCorte;

    @FXML
    private Button btnVender;

    @FXML
    void clickCorte(ActionEvent event) {

    }

    @FXML
    void clickVender(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setBuilderFactory(new JavaFXBuilderFactory());
            loader.setLocation(getClass().getResource("ruta_al_archivo_fxml.fxml"));

            // Cargar el archivo FXML en un nodo raíz
            Pane subSceneRoot = loader.load();

            // Crear una SubScene y establecer la raíz del archivo FXML como su contenido
            SubScene subSceneContainer = new SubScene(subSceneRoot, 400, 300);
            subSceneContainer.setRoot(subSceneRoot);
            subSceneContainer.setFill(null);

            // Agregar la SubScene al Pane contenedor
            APPanel.getChildren().add(subSceneContainer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

