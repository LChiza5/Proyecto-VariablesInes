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
    private EstadoCinturon conductor;
    private EstadoCinturon pasajero;
    private EstadoCinturon traseroIzquierdo;
    private EstadoCinturon traseroDerecho;

    public sistemaCinturones() {
        conductor = EstadoCinturon.NO_ABROCHADO;
        pasajero = EstadoCinturon.NO_ABROCHADO;
        traseroIzquierdo = EstadoCinturon.NO_ABROCHADO;
        traseroDerecho = EstadoCinturon.NO_ABROCHADO;
    }

    public void abrochar(String posicion) {
        switch(posicion.toLowerCase()) {
            case "conductor": conductor = EstadoCinturon.ABROCHADO; break;
            case "pasajero": pasajero = EstadoCinturon.ABROCHADO; break;
            case "traseroizquierdo": traseroIzquierdo = EstadoCinturon.ABROCHADO; break;
            case "traseroderecho": traseroDerecho = EstadoCinturon.ABROCHADO; break;
        }
    }

    public void desabrochar(String posicion) {
        switch(posicion.toLowerCase()) {
            case "conductor": conductor = EstadoCinturon.NO_ABROCHADO; break;
            case "pasajero": pasajero = EstadoCinturon.NO_ABROCHADO; break;
            case "traseroizquierdo": traseroIzquierdo = EstadoCinturon.NO_ABROCHADO; break;
            case "traseroderecho": traseroDerecho = EstadoCinturon.NO_ABROCHADO; break;
        }
    }

    public String obtenerEstadoCinturones() {
        return "Conductor: " + conductor +
               ", Pasajero: " + pasajero +
               ", Trasero Izquierdo: " + traseroIzquierdo +
               ", Trasero Derecho: " + traseroDerecho;
    }
}


