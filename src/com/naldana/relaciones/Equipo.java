/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naldana.relaciones;

import java.util.ArrayList;

/**
 *
 * @author Néstor Aldana <nexxtor at naldana.com>
 */
public class Equipo {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Cuenta> cuentas;
    
    public Equipo() {
       
    }
  
    
    
    public void add(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public boolean remove(Jugador jugador){
        return jugadores.remove(jugador);
    }
    
    
    public ArrayList<Jugador> getJugadores(){
        return jugadores;
    }
}
