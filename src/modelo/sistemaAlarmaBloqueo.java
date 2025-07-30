/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Luisk
 */
public class sistemaAlarmaBloqueo {
    private boolean alarmaActiva;
    private boolean puertasBloqueadas;

    public void activarAlarma(boolean estado) {
        this.alarmaActiva = estado;
    }

    public void bloquearPuertas(boolean estado) {
        this.puertasBloqueadas = estado;
    }

    public boolean isAlarmaActiva() { 
        return alarmaActiva; }
    public boolean isPuertasBloqueadas() { 
        return puertasBloqueadas; }
}

