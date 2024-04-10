package com.example.proyectofinal.models;

import java.util.Objects;

public class Login {
    private String usuario;
    private int contrasena;

    private String permiso;

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
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

    public boolean validarUsuario(ListaUsuario user){
        for (Usuario i:user.getListaUsuario()){
            if(this.usuario.equals(i.getUsuario()) && this.contrasena==i.getContrasena()){
                setPermiso(i.getTipo());
                return true;
            }
        }
        return false;
    }
}
