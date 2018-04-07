/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela Chavez
 */
 package Poo;

public class Negocio {
    private String nombre = null;
    private String direccion = null;
    private String telefono = null;
    private Proveedores proveedores = null;
    
    public Negocio () {
    this.proveedores = new Proveedores();
    }
    
    public Negocio (String nombre, String direccion, String telefono, Proveedores proveedores){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.proveedores = proveedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Proveedores getProveedores(){
        return proveedores;
    }

    public void setProveedores (Proveedores proveedores){
        this.proveedores = proveedores;
    }
}

