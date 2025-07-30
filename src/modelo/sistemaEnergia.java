/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ilope
 */
public class sistemaEnergia {
    private double nivel;

    public sistemaEnergia() {
        nivel = 100;
    }

    public void consumir(double cantidad){
        nivel = Math.max(0, nivel - cantidad);
    }

    public void recargar(double cantidad)
    {
        nivel = Math.min(100, nivel + cantidad);
    }

    public double getNivel(){
        return nivel;
    }
}
