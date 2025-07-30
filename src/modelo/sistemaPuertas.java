/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enums.EstadoPuerta;

/**
 *
 * @author LOLO
 */
public class sistemaPuertas {
    private EstadoPuerta puertaConductor;
    private EstadoPuerta puertaPasajero;
    private EstadoPuerta puertaTraseraIzquierda;
    private EstadoPuerta puertaTraseraDerecha;

    public sistemaPuertas() {
        puertaConductor = EstadoPuerta.CERRADA;
        puertaPasajero = EstadoPuerta.CERRADA;
        puertaTraseraIzquierda = EstadoPuerta.CERRADA;
        puertaTraseraDerecha = EstadoPuerta.CERRADA;
    }

    public void abrirPuerta(String puerta) {
        switch(puerta.toLowerCase()) {
            case "conductor": puertaConductor = EstadoPuerta.ABIERTA; break;
            case "pasajero": puertaPasajero = EstadoPuerta.ABIERTA; break;
            case "traseraizquierda": puertaTraseraIzquierda = EstadoPuerta.ABIERTA; break;
            case "traseraderecha": puertaTraseraDerecha = EstadoPuerta.ABIERTA; break;
        }
    }

    public void cerrarPuerta(String puerta) {
        switch(puerta.toLowerCase()) {
            case "conductor": puertaConductor = EstadoPuerta.CERRADA; break;
            case "pasajero": puertaPasajero = EstadoPuerta.CERRADA; break;
            case "traseraizquierda": puertaTraseraIzquierda = EstadoPuerta.CERRADA; break;
            case "traseraderecha": puertaTraseraDerecha = EstadoPuerta.CERRADA; break;
        }
    }

    public String obtenerEstadoPuertas() {
        return "Conductor: " + puertaConductor +
               ", Pasajero: " + puertaPasajero +
               ", Trasera Izquierda: " + puertaTraseraIzquierda +
               ", Trasera Derecha: " + puertaTraseraDerecha;
    }
}


