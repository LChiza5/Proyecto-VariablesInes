/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Luisk
 */
public class sistemaKilometraje {
    private double distancia;
    private double velocidad;
    private int rpm;
    private sistemaEncendido encendido;
    private sistemaSensores sensores;

    public sistemaKilometraje(sistemaEncendido encendido, sistemaSensores sensores) {
        this.encendido = encendido;
        this.sensores = sensores;
    }

    public void actualizar(double incrementoDistancia, double nuevaVelocidad, int nuevaRPM) {
        if (encendido.estaEncendido() && !sensores.isFrenoManoActivo()) {
            if (nuevaVelocidad >= 0 && nuevaRPM >= 0) {
                this.distancia += incrementoDistancia;
                this.velocidad = nuevaVelocidad;
                this.rpm = nuevaRPM;
            }
        }
    }

    public double getDistancia(){
        return distancia; 
    }
    public double getVelocidad(){
        return velocidad;
    }
    public int getRPM(){
        return rpm;
    }
}
