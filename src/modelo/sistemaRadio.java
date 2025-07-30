/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enums.ModoRadio;

/**
 *
 * @author Luisk
 */
public class sistemaRadio {
    private boolean encendido;
    private ModoRadio modo;
    private double frecuencia;
    private final sistemaEncendido sistemaEncendido;

    public boolean encender() {
        if (sistemaEncendido.permiteSubsistemasBasicos()) {
            encendido = true;
            return true;
        }
        return false;
    }

    public void apagar() {
        encendido = false;
    }
    
     public boolean isEncendido() { 
        return encendido; }
    public ModoRadio getModo() { 
        return modo; }
    public double getFrecuencia() { 
        return frecuencia; }

    public boolean cambiarModo(ModoRadio nuevoModo) {
        if (encendido) {
            this.modo = nuevoModo;
            switch (nuevoModo) {
                case AM -> frecuencia = 1000;
                case FM -> frecuencia = 98.5;
                case BLUETOOTH -> frecuencia = 0;
            }
            return true;
        }
        return false;
    }

    public boolean sintonizar(double nuevaFrecuencia) {
        if (encendido && (modo == ModoRadio.AM || modo == ModoRadio.FM)) {
            this.frecuencia = nuevaFrecuencia;
            return true;
        }
        return false;
    }
    
     public sistemaRadio(sistemaEncendido sistemaEncendido) {
        this.sistemaEncendido = sistemaEncendido;
        this.modo = ModoRadio.FM;     // Por defecto
        this.frecuencia = 98.5;       // FM típica
        this.encendido = false;
    }
}
