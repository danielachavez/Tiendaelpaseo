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

public class Articulos {
    
    private int stock = 0;
    private String name = null;
    private double precio = 0.0;
    private Negocio negocio = null;
    
    public Articulos () {
        
    }
    
    public Articulos (int stock, String name, double precio, Negocio negocio) {
        this.stock = stock;
        this.name = name;
        this.negocio = negocio;
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }
}
