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

public class Login {
    
    private String usuario = null;
    private String contraseña = null;
    
    public static boolean sesion = false;
    
    public Login () {
        this.usuario = null;
        this.contraseña = null;
    }
    
    public Login (String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getLogin() {
        return usuario;
    }

    public void setLogin(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
