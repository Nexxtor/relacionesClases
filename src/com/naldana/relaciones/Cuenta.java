package com.naldana.relaciones;

/**
 * Representa la abstración del concepto de cuenta
 * bancaria
 * @author Néstor Aldana <nexxtor at naldana.com>
 */
public class Cuenta {
    private double saldo;
    private Cliente propietario;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    
    
}
