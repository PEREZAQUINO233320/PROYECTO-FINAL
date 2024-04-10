package com.example.proyectofinal.models;

import java.util.ArrayList;

public class Stock {

    private ArrayList<Producto> listaProductos;

    public void altaProductos(Producto producto){
        listaProductos.add(producto);
    }

    public void bajaProductos(Producto producto){
        listaProductos.remove(producto);
    }

    public void editarProductos(int index, Producto producto){
        listaProductos.set(index,producto);
    }

}
