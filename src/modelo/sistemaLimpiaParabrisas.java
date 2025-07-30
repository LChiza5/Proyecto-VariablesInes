/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enums.VelocidadLimpiaParabrisas;

/**
 *
 * @author huete
 */
public class sistemaLimpiaParabrisas {
    private VelocidadLimpiaParabrisas velocidad;
    private sistemaEncendido encendido;

    public VelocidadLimpiaParabrisas getVelocidad() {
        return velocidad;
    }

    public sistemaLimpiaParabrisas(sistemaEncendido encendido) {
        this.encendido = encendido;
        this.velocidad = VelocidadLimpiaParabrisas.OFF;
    }

    public boolean cambiarVelocidad(VelocidadLimpiaParabrisas nuevaVelocidad) {
    if (encendido.estaEncendido()) {
        this.velocidad = nuevaVelocidad;
        return true;
    } else {
        System.out.println("No se puede cambiar la velocidad, el auto está apagado.");
        return false;
    }
    }
}
