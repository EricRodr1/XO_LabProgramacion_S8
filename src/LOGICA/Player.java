/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGICA;

 
public class Player {
    public String username, password;
    public int puntos; 
    public int numero;
    public String[] logs;
    public static final int partidas = 100;
    
    public Player(String username, String password) {
        this.username = username;
        this.password = password; 
        this.logs = new String[partidas];
        this.puntos =0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
     
    public int getNumero() {
        return numero;
    }

     public void sumarPunto(){
         this.puntos++;
     }

    public String[] getLogs() {
        return logs;
    }

    public void setLogs(String[] logs) {
        this.logs = logs;
    }
    
    @Override
    public String toString() {
        return "Jugador: " + username + ", Puntos: " + puntos;
    }
}
