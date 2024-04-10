package com.example.proyectofinal.controllers;

import com.example.proyectofinal.models.ListaUsuario;
import com.example.proyectofinal.models.Login;
import com.example.proyectofinal.models.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;

public class LoginController {

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtPass;

    @FXML
    private TextField txtUser;

    private ListaUsuario usuarios = new ListaUsuario();
    private Login login = new Login();

    @FXML
    void clickLogin(ActionEvent event) {
        login.setContrasena(Integer.parseInt(txtPass.getText()));
        login.setUsuario(txtUser.getText());
        if(login.validarUsuario(usuarios)){
            System.out.println("Logeado");
            System.out.println(login.getPermiso());

            Stage currentStage = (Stage) btnLogin.getScene().getWindow();
            //abrir otra ruta
            try {
                String ruta;
                if(login.getPermiso().equals("Administrador")){
                    ruta="/com/example/proyectofinal/menuAdmin.fxml";
                }
                else {
                    ruta="/com/example/proyectofinal/menuPersonal.fxml";
                }
                // Cargar la vista del menú
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(ruta));
                Parent menuRoot = fxmlLoader.load();

                // Crear una nueva escena con la vista del menú
                Scene menuScene = new Scene(menuRoot);

                // Establecer la nueva escena en la misma ventana
                currentStage.setScene(menuScene);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("NO LOGEADO");
        }
    }

    @FXML
    void initialize(){
        ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Rosel","Santos","9612497084","Administrador","admin",2345));
        lista.add(new Usuario("Milton","Gomez","9613225654","Personal","user1",1234));
        usuarios.setListaUsuario(lista);
    }

}

