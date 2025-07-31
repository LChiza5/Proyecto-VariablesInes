/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enums.EstadoEncendido;
import Enums.EstadoPuerta;

/**
 *
 * @author Luisk
 */
public class sistemaEncendido {
    private EstadoEncendido estado;
    private sistemaCinturones cinturones;
    private sistemaPuertas puertas;
    private sistemaSensores sensores;

    public sistemaEncendido(sistemaCinturones cinturones, sistemaPuertas puertas, sistemaSensores sensores) {
        this.estado = EstadoEncendido.APAGADO;
        this.cinturones = cinturones;
        this.puertas = puertas;
        this.sensores = sensores;
    }

    public void apagar() {
        estado = EstadoEncendido.APAGADO;
        System.out.println("Auto apagado.");
    }

    public void activarModoEmision() {
        if (estado == EstadoEncendido.APAGADO) {
            estado = EstadoEncendido.EMISION;
            System.out.println("Modo EMISIÓN activado.");
        } else {
            System.out.println("El modo EMISIÓN solo puede activarse desde APAGADO.");
        }
    }

    public boolean encender() {
        if (estado != EstadoEncendido.EMISION) {
        System.out.println("⚠ No puedes encender el auto si no está en modo EMISIÓN.");
        return false;
        }

        if (!cinturones.estaAbrochado()) { 
            System.out.println("¡Advertencia! Cinturón del piloto no está abrochado.");
            // En GUI: JOptionPane.showMessageDialog(null, "¡Advertencia! Cinturón no abrochado.");
        }

        for (int i = 0; i <  puertas.getCantidadPuertas(); i++) {
            if (puertas.getEstadoPuerta(i) == EstadoPuerta.ABIERTA) {
                System.out.println("¡Advertencia! La puerta " + i + " está abierta.");
            }
        }

        if (sensores.isFrenoManoActivo()) {
            System.out.println("¡Advertencia! Freno de mano está activo.");
        }

        estado = EstadoEncendido.ENCENDIDO;
        System.out.println("Auto encendido.");
        return false;
    }

    public boolean estaEncendido() {
        return estado == EstadoEncendido.ENCENDIDO;
    }

    public boolean estaApagado() {
        return estado == EstadoEncendido.APAGADO;
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
    
    public void setEstado(EstadoEncendido estado) {
    this.estado = estado;
    }

  }

