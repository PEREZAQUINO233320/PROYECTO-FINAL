package com.example.proyectofinal.models;

public class Admin extends Usuario {
    String correo;

    public Admin(){

    }

    public Admin(String nombre, String apellido, String numeroTel, String tipo, String usuario, int contrasena, String correo) {
        super(nombre, apellido, numeroTel, tipo, usuario, contrasena);
        this.correo = correo;
    }

    public String generarTipoUsuario(){
        return "Administrador";
    }
}
