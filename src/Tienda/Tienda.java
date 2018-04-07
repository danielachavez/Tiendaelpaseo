package Tienda;

import Poo.Login;
import java.util.Scanner;

public class Tienda {
    
    private static boolean session = false;
    
    private static Login user = null;
    
    
    private static void menu (String[] menu, int pantalla) {
        Scanner scanner = new Scanner(System.in);
        
        if (pantalla == 1) {
            if (!Tienda.session) {
                String usuario = null; String contraseña = null;
                System.out.println(menu[0]); // Imprime menu[0] => "Ingrese nombre usuario: "
                usuario = scanner.next();
                System.out.println(menu[1]); // Imprime menu[1] =>  "Ingrese contraseña:"
                contraseña = scanner.next();

                Tienda.user.setLogin(usuario);
                Tienda.user.setContraseña(contraseña);
                
                if (Tienda.user.getLogin().equals("Chavez") && Tienda.user.getContraseña().equals("0000")) {
                    session = true;
                } else {
                    System.out.println("¡Los Datos incresados son incorrectos!");
                }
            } else {
                System.out.println("Ya hay una sesión abierta!");
            }
        } else {
            for (int i = 0; i < menu.length; i ++) {
                System.out.println(menu[i]);
            }
        }
    }
    
    public static void main (String[] args) {
        Tienda.user = new Login();
        
        while (true) {
            if (!session) {
                String login[] = {
                    "Ingrese el nombre usuario: ",
                    "Ingrese la contraseña:"
                };
                System.out.println("Tienda el paseo ");
                menu(login, 1);
             } else {
                String principal[] = {
                  "Bienvenido a la tienda el Paseo",
                  "1. Agregar producto",
                  "2. Eliminar producto",
                  "3. Modificar producto",
                  "4. Descargar producto ",
                  "5. Cargar Producto",
                  "6. Salir",
                
                };
                menu(principal, 2);
                break;
                
                
             }
        }
    }
    
}
