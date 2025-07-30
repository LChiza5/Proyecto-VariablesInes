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

    public void cambiarVelocidad(VelocidadLimpiaParabrisas nuevaVelocidad) {
        if (encendido.permiteSubsistemasBasicos()) {
            this.velocidad = nuevaVelocidad;
        }
    }
}
