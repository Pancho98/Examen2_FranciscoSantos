/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_francisco;

import java.util.ArrayList;

/**
 *
 * @author Francisco Santos
 */
public class Albums {
    private String nombre,artista;
    private ArrayList<Canciones> listaCanciones = new ArrayList();

    public Albums() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Canciones> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Canciones> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    @Override
    public String toString() {
        return "Albums{" + "nombre=" + nombre + '}';
    }
    
    
}
