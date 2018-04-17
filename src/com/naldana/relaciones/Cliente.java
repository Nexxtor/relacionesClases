package com.naldana.relaciones;

/**
 * Representa a un cliente del negocio
 * y todos sus datos
 * @author Néstor Aldana <nexxtor at naldana.com>
 */
public class Cliente {
    private String nombre;
    public Cuenta cuenta;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

}
