package com.example.proyectofinal.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class CatalogoProveedor {
    ArrayList<Proveedor> listaProveedores = new ArrayList<>();
    public ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }
    public void altaProveedor(Proveedor proveedor){
        listaProveedores.add(proveedor);
    }
    public void bajaProveedores(Proveedor proveedor){
        listaProveedores.remove(proveedor);
    }
    public void editarProveedor(int index, Proveedor proveedor){
        listaProveedores.set(index,proveedor);
    }
}
