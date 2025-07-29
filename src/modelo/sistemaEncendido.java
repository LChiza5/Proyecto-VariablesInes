/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enums.EstadoEncendido;

/**
 *
 * @author Luisk
 */
public class sistemaEncendido {
     private EstadoEncendido estado;

    public void apagar() {
        estado = EstadoEncendido.APAGADO;
    }

    public void activarModoEmision() {
        estado = EstadoEncendido.EMISION;
    }

    public void encender() {
        estado = EstadoEncendido.ENCENDIDO;
    }

    public boolean estaEncendido() {
        return estado == EstadoEncendido.ENCENDIDO;
    }

    public boolean enModoEmision() {
        return estado == EstadoEncendido.EMISION;
    }

    public boolean permiteSubsistemasBasicos() {
        return estado == EstadoEncendido.EMISION || estado == EstadoEncendido.ENCENDIDO;
    }

    public EstadoEncendido getEstado() {
        return estado;
        }
    
    public sistemaEncendido() {
        this.estado = EstadoEncendido.APAGADO;
        }
    }

