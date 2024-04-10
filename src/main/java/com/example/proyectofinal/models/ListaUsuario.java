package com.example.proyectofinal.models;

import java.util.ArrayList;

public class ListaUsuario {
    ArrayList<Usuario> listaUsuario = new ArrayList<>();

    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public void altaPerfil(Usuario user){
        listaUsuario.add(user);
    }
    public void bajaPerfil(Usuario user){
        listaUsuario.remove(user);
    }
    public void editarPerfil(int index, Usuario user){
        listaUsuario.set(index,user);
    }

}
