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
    private EstadoPuerta[] puertas;
    private sistemaAlarmaBloqueo alarmaBloqueo;

    public sistemaPuertas(int totalPuertas, sistemaAlarmaBloqueo alarmaBloqueo) {
        this.alarmaBloqueo = alarmaBloqueo;
        puertas = new EstadoPuerta[totalPuertas];
        for (int i = 0; i < totalPuertas; i++) {
            puertas[i] = EstadoPuerta.CERRADA;
        }
    }

    public boolean abrirPuerta(int indice) {
        if (alarmaBloqueo.isPuertasBloqueadas()) {
            return false; 
        }
        puertas[indice] = EstadoPuerta.ABIERTA;
        return true;
    }

    public void cerrarPuerta(int indice) {
        puertas[indice] = EstadoPuerta.CERRADA;
    }

    public EstadoPuerta getEstadoPuerta(int indice) {
        return puertas[indice];
    }

    public boolean estaTodasCerradas() {
        for (EstadoPuerta puerta : puertas) {
            if (puerta != EstadoPuerta.CERRADA) return false;
        }
        return true;
    }

    public boolean algunaPuertaAbierta() {
        for (EstadoPuerta puerta : puertas) {
            if (puerta == EstadoPuerta.ABIERTA) return true;
        }
        return false;
    }
}


