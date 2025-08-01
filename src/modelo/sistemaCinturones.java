/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enums.EstadoCinturon;

/**
 *
 * @author LOLO
 */

public class sistemaCinturones {
    private EstadoCinturon cinturonPiloto;
    private EstadoCinturon cinturonPasajero;

    public sistemaCinturones() {
        this.cinturonPiloto = EstadoCinturon.NO_ABROCHADO;
        this.cinturonPasajero = EstadoCinturon.NO_ABROCHADO;
    }

    public void setPilotoAbrochado(boolean abrochado) {
        this.cinturonPiloto = abrochado ? EstadoCinturon.ABROCHADO : EstadoCinturon.NO_ABROCHADO;
    }

    public void setPasajeroAbrochado(boolean abrochado) {
        this.cinturonPasajero = abrochado ? EstadoCinturon.ABROCHADO : EstadoCinturon.NO_ABROCHADO;
    }

    public boolean isPilotoAbrochado() {
        return cinturonPiloto == EstadoCinturon.ABROCHADO;
    }

    public boolean isPasajeroAbrochado() {
        return cinturonPasajero == EstadoCinturon.ABROCHADO;
    }

    public EstadoCinturon getEstadoPiloto() {
        return cinturonPiloto;
    }

    public EstadoCinturon getEstadoPasajero() {
        return cinturonPasajero;
    }

    public boolean ambosAbrochados() {
        return isPilotoAbrochado() && isPasajeroAbrochado();
    }
}

