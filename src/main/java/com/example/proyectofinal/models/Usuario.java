package com.example.proyectofinal.models;

public class Usuario {
    private String nombre;
    private String apellido;
    private String numeroTel;
    private String tipo;
    private String usuario;
    private int contrasena;

    public Usuario (){

    }

    public Usuario(String nombre, String apellido, String numeroTel, String tipo, String usuario, int contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTel = numeroTel;
        this.tipo = tipo;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public String generarTipoUsuario(){
        return "";
    }

}
