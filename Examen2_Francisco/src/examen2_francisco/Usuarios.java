/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_francisco;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Francisco Santos
 */
public class Usuarios implements Serializable{
     private String nombre, username, password;
     private int edad;
     ArrayList<PlayList> lista = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String username, String password, int edad) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuarios: " + "nombre=" + nombre + ", username=" + username + ", password=" + password + ", edad=" + edad ;
    }
     
     
     
}
