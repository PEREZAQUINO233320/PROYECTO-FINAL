package com.example.proyectofinal.models;

import java.util.ArrayList;

public class ListaCorte {
    private ArrayList<Corte> listaCortes;

    public ArrayList<Corte> getListaCortes() {
        return listaCortes;
    }

    public void setListaCortes(ArrayList<Corte> listaCortes) {
        this.listaCortes = listaCortes;
    }

    public void addCorte(Corte corte){
        listaCortes.add(corte);
    }
}
