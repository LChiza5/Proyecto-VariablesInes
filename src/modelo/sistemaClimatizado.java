/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enums.EstadoClimatizado;

/**
 *
 * @author huete
 */
public class sistemaClimatizado {
    private EstadoClimatizado velocidad;
    private boolean Encendido;
    private boolean A_C;
    private boolean Calefaccion;

    public EstadoClimatizado getVelocidad() {
        return velocidad;
    }

    public boolean isEncendido() {
        return Encendido;
    }

    public boolean isA_C() {
        return A_C;
    }

    public boolean isCalefaccion() {
        return Calefaccion;
    }

    public sistemaClimatizado(EstadoClimatizado velocidad, boolean Encendido, boolean A_C, boolean Calefaccion) {
        this.Encendido = false;
        this.A_C = false;
        this.Calefaccion = false;
        this.velocidad = EstadoClimatizado.APAGADO;
    }
    public void Encender(){
     this.Encendido = true;
 }
 public void Apagar(){
     this.Encendido = false;
 }
 public void ModoA_C(){
     this.A_C=true;
     this.velocidad = EstadoClimatizado.BAJA;
     }
 public void ModoCalefaccion(){
     this.Calefaccion = true;
     this.velocidad = EstadoClimatizado.BAJA;
 }
     public void ActivarClimatizacion(){
         if(A_C = true){
             ModoA_C();
             Calefaccion=false;
         }else if(Calefaccion = true){
             ModoCalefaccion();
             A_C=false;
         }
     }
     private void ActivarMedia(){
         velocidad = EstadoClimatizado.MEDIA;
     }
     private void ActivarAlta(){
         velocidad = EstadoClimatizado.ALTA;
     }
    }
    