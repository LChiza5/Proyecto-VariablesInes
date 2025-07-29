/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enums.TipoLuz;

/**
 *
 * @author Luisk
 */
public class sistemaIluminacion {
    private TipoLuz lucesDelanteras;
    private boolean intermitentes;
    private boolean lucesEmergencia;
    private boolean lucesPuertas;
    private sistemaEncendido encendido;

    public void cambiarLucesDelanteras(TipoLuz tipo) {
        if (encendido.permiteSubsistemasBasicos()) {
            this.lucesDelanteras = tipo;
        }
    }

    public void activarIntermitentes(boolean estado) {
        this.intermitentes = estado; 
    }

    public void activarLucesEmergencia(boolean estado) {
        this.lucesEmergencia = estado; 
    }

    public void activarLucesPuertas(boolean estado) {
        this.lucesPuertas = estado;
    }

    public TipoLuz getLucesDelanteras() { 
        return lucesDelanteras; }
    public boolean isIntermitentes() { 
        return intermitentes; }
    public boolean isLucesEmergencia() { 
        return lucesEmergencia; }
    public boolean isLucesPuertas() { 
        return lucesPuertas; }
    
     public sistemaIluminacion(sistemaEncendido encendido) {
        this.encendido = encendido;
        this.lucesDelanteras = TipoLuz.APAGADA;
        this.intermitentes = false;
        this.lucesEmergencia = false;
        this.lucesPuertas = false;
    }
}


