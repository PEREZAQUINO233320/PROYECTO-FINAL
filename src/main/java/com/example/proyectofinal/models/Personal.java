package com.example.proyectofinal.models;

public class Personal extends Usuario {
    int edad;
    String domicilio;

    public Personal(String nombre, String apellido, String numeroTel, String tipo, String usuario, int contrasena, int edad, String domicilio) {
        super(nombre, apellido, numeroTel, tipo, usuario, contrasena);
        this.edad = edad;
        this.domicilio = domicilio;
    }
    public String generarTipoUsuario(){
        return "Personal";
    }
}
