package com.naldana.relaciones;

/**
 * Representa a un usuario del sistema
 * @author Néstor Aldana <nexxtor at naldana.com>
 */
public class Usuario {
    private String nombre;
    public Clave clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clave getClave() {
        return clave;
    }

    public void setClave(Clave clave) {
        this.clave = clave;
    }
    
    
}
