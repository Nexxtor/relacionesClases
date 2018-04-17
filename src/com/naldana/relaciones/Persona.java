package com.naldana.relaciones;

import java.util.ArrayList;

/**
 *
 * @author Néstor Aldana <nexxtor at naldana.com>
 */
public class Persona {
    private String nombre;
    public ArrayList<Perro> mascotas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Perro> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Perro> mascotas) {
        this.mascotas = mascotas;
    }
    
    
}
