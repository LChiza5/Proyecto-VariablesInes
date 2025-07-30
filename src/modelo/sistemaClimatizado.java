/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enums.EstadoClimatizado;

/**
 *
 * @author huete
 */
public class sistemaClimatizado {
    private EstadoClimatizado velocidad;
    private boolean ac;
    private boolean calefaccion;
    private final sistemaEncendido encendido;

    
    public sistemaClimatizado(sistemaEncendido encendido) {
        this.encendido = encendido;
        this.ac = false;
        this.calefaccion = false;
        this.velocidad = EstadoClimatizado.APAGADO;
    }

    
    public EstadoClimatizado getVelocidad() {
        return velocidad;
    }

    public boolean isAC() {
        return ac;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    
    public void activarModoAC() {
        if (encendido.permiteSubsistemasBasicos()) {
            this.ac = true;
            this.calefaccion = false;
            this.velocidad = EstadoClimatizado.BAJA;
        }
    }

    
    public void activarModoCalefaccion() {
        if (encendido.permiteSubsistemasBasicos()) {
            this.calefaccion = true;
            this.ac = false;
            this.velocidad = EstadoClimatizado.BAJA;
        }
    }

    
    public void cambiarVelocidad(EstadoClimatizado nuevaVelocidad) {
        if (encendido.permiteSubsistemasBasicos() && (ac || calefaccion)) {
            this.velocidad = nuevaVelocidad;
        }
    }

    
    public void apagar() {
        this.ac = false;
        this.calefaccion = false;
        this.velocidad = EstadoClimatizado.APAGADO;
    }
}