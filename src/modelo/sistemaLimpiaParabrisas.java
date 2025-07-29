/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enums.VelocidadLimpiaParabrisas;

/**
 *
 * @author huete
 */
public class sistemaLimpiaParabrisas {
    private VelocidadLimpiaParabrisas Estado;

    public VelocidadLimpiaParabrisas getEstado() {
        return Estado;
     
    }
    
    private void Apagar(){
        Estado = VelocidadLimpiaParabrisas.OFF;
    }
    private void ActivarLenta(){
        Estado = VelocidadLimpiaParabrisas.LENTA;
    }
    private void ActivarMedia(){
        Estado = VelocidadLimpiaParabrisas.MEDIA;
    }
    private void ActivarRapida(){
        Estado = VelocidadLimpiaParabrisas.RAPIDA;
    }
    public boolean Apagado(){
        return Estado == VelocidadLimpiaParabrisas.OFF;
    }
    public boolean VelocidadLenta(){
        return Estado == VelocidadLimpiaParabrisas.LENTA;
    }
    public boolean VelocidadMedia(){
        return Estado == VelocidadLimpiaParabrisas.MEDIA;
    }
    public boolean VelocidadRapida(){
        return Estado == VelocidadLimpiaParabrisas.RAPIDA;
    }

    public sistemaLimpiaParabrisas() {
        this.Estado = VelocidadLimpiaParabrisas.OFF;
    }
    
}
