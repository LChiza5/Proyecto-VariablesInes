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
    private sistemaPuertas puertas;

    public sistemaIluminacion(sistemaEncendido encendido, sistemaPuertas puertas) {
        this.encendido = encendido;
        this.puertas = puertas;
        this.lucesDelanteras = TipoLuz.APAGADA;
        this.intermitentes = false;
        this.lucesEmergencia = false;
        this.lucesPuertas = false;
    }

    public boolean cambiarLucesDelanteras(TipoLuz tipo) {
        if (encendido.permiteSubsistemasBasicos()) {
            this.lucesDelanteras = tipo;
            return true;
        }
        return false;
    }

    public void activarIntermitentes(boolean estado) {
        this.intermitentes = estado;
    }

    public void activarLucesEmergencia(boolean estado) {
        this.lucesEmergencia = estado;
    }

    // Actualiza luces puertas según estado de puertas
    public void actualizarLucesPuertas() {
        this.lucesPuertas = !puertas.estaTodasCerradas();
    }

    public TipoLuz getLucesDelanteras(){ 
        return lucesDelanteras;
    }
    public boolean isIntermitentes() {
        return intermitentes; 
    }
    public boolean isLucesEmergencia() {
        return lucesEmergencia; 
    }
    public boolean isLucesPuertas() {
        return lucesPuertas; 
    }
}


