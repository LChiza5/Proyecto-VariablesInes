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

    public double getDistancia() {
        return distancia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getRpm() {
        return rpm;
    }
 
    public void actualizar(double incrementoDistancia, double nuevaVelocidad, int nuevaRPM) {
        this.distancia += incrementoDistancia;
        this.velocidad = nuevaVelocidad;
        this.rpm = nuevaRPM;
    }
}
