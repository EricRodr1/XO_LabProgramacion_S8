/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SWING;

import javax.swing.JOptionPane;

/**
 *
 * @author Eric Rodriguez
 */
public class XO_LabProgra_S8 {

    /**
     * @param args the command line arguments
     */
    public static int jugadores_registrados = 0;
    public static Player jugador1;
    public static Player[] jugadores = new Player[100]; // Aqui guardamos todos los usuarios que se van a ir creando
    public Player jugador2;
    public static XO juego = new XO();
    public static menu_inicio menu = new menu_inicio();

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static Player inicio_sesion(String username, String password) {
        for (int i = 0; i < jugadores_registrados; i++) {
            if (jugadores[i].getUsername().equals(username) && jugadores[i].getPassword().equals(password)) {
                jugador1 = jugadores[i];
                return jugadores[i];
            }
        }
        System.out.println("Usuario o contrasena incorrectos");
        return null;
    }

    public void crear_jugador(String username, String password) {
        if (jugadores_registrados >= jugadores.length) {
            return;
        }

        jugadores[jugadores_registrados] = new Player(username, password);
        jugadores_registrados++;
    }

    public static boolean usuario_existente(String username) {
        for (int i = 0; i < jugadores_registrados; i++) {
            if (jugadores[i].getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public Player jugador2(String username) {
        for (int i = 0; i < jugadores_registrados; i++) {
            if (jugadores[i].getUsername().equals(username)) { 
                if (username.equalsIgnoreCase(jugador1.getUsername())) { 
                   
                    System.out.println("No se puede ingresar el nombre del jugador actual.");  
                    return null;  
                } else {
                    jugador2 = jugadores[i];
                    return jugadores[i];
                }
            }
        }
        return null; 
    }
}