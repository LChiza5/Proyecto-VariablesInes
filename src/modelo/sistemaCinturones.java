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
    private EstadoCinturon cinturón;  

    public sistemaCinturones() {
        this.cinturón = EstadoCinturon.NO_ABROCHADO;
    }

    public void abrocharCinturon() {
        this.cinturón = EstadoCinturon.ABROCHADO;
    }

    public void desabrocharCinturon() {
        this.cinturón = EstadoCinturon.NO_ABROCHADO;
    }

    public EstadoCinturon getEstadoCinturon() {
        return cinturón;
    }

    public boolean estaAbrochado() {
        return cinturón == EstadoCinturon.ABROCHADO;
    }
}


