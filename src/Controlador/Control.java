/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Enums.EstadoClimatizado;
import Enums.EstadoEncendido;
import Enums.EstadoPuerta;
import Enums.ModoRadio;
import Enums.TipoLuz;
import Enums.VelocidadLimpiaParabrisas;
import modelo.sistemaAlarmaBloqueo;
import modelo.sistemaCinturones;
import modelo.sistemaClimatizado;
import modelo.sistemaEncendido;
import modelo.sistemaEnergia;
import modelo.sistemaIluminacion;
import modelo.sistemaKilometraje;
import modelo.sistemaLimpiaParabrisas;
import modelo.sistemaPuertas;
import modelo.sistemaRadio;
import modelo.sistemaSensores;

/**
 *
 * @author ilope
 */
public class Control{
    private sistemaEncendido encendido;
    private sistemaCinturones cinturones;
    private sistemaPuertas puertas;
    private sistemaSensores sensores;
    private sistemaAlarmaBloqueo alarmaBloqueo;
    private sistemaIluminacion iluminacion;
    private sistemaLimpiaParabrisas limpiaParabrisas;
    private sistemaRadio radio;
    private sistemaClimatizado climatizacion;
    private sistemaEnergia energia;
    private sistemaKilometraje kilometraje;

    // Constructor inicializa todos los sistemas y conecta dependencias
    public Control(int cantidadPuertas, int cantidadCinturones) {
        this.alarmaBloqueo = new sistemaAlarmaBloqueo();
        this.puertas = new sistemaPuertas(cantidadPuertas, alarmaBloqueo);
        this.sensores = new sistemaSensores();
        this.encendido = new sistemaEncendido(cinturones, puertas, sensores);
        this.iluminacion = new sistemaIluminacion(encendido, puertas);
        this.limpiaParabrisas = new sistemaLimpiaParabrisas(encendido);
        this.radio = new sistemaRadio(encendido);
        this.climatizacion = new sistemaClimatizado(encendido);
        this.energia = new sistemaEnergia();
        this.kilometraje = new sistemaKilometraje(encendido, sensores);
        this.cinturones = new sistemaCinturones();
    }

    // Métodos para controlar encendido
    public boolean encenderAuto() {
        return encendido.encender();
    }

    public void apagarAuto() {
        encendido.apagar();
        radio.apagar();
        limpiaParabrisas.cambiarVelocidad(VelocidadLimpiaParabrisas.OFF);
        climatizacion.activarModoAC(false);
        climatizacion.activarModoCalefaccion(false);
        // Aquí podrías apagar más subsistemas si quieres
    }

    public void activarModoEmision() {
        encendido.activarModoEmision();
    }

    public EstadoEncendido getEstadoEncendido() {
        return encendido.getEstado();
    }
    
    public void encenderMotor() {
    encendido.setEstado(EstadoEncendido.ENCENDIDO);
    }

    public void apagarMotor() {
    encendido.setEstado(EstadoEncendido.APAGADO);
    }
    

    // Métodos para puertas
    public boolean abrirPuerta(int indice) {
        return puertas.abrirPuerta(indice);
    }

    public void cerrarPuerta(int indice) {
        puertas.cerrarPuerta(indice);
    }

    public EstadoPuerta getEstadoPuerta(int indice) {
        return puertas.getEstadoPuerta(indice);
    }
    
    public boolean getEstadoPuertasBloqueadas() {
    return alarmaBloqueo.isPuertasBloqueadas();
    }
    public boolean todasLasPuertasCerradas() {
    return puertas != null && puertas.estaTodasCerradas();
}



    // Métodos para cinturón
    
    public void setCinturonPiloto(boolean estado) {
    cinturones.setPilotoAbrochado(estado);
    }

    public void setCinturonPasajero(boolean estado) {
    cinturones.setPasajeroAbrochado(estado);
    }

    public boolean isCinturonPiloto() {
    return cinturones.isPilotoAbrochado();
    }

    public boolean isCinturonPasajero() {
    return cinturones.isPasajeroAbrochado();
    }

    public boolean sePuedeAcelerar() {
    return cinturones.isPilotoAbrochado() && cinturones.isPasajeroAbrochado();
    }

    // Métodos para alarma y bloqueo
    public void activarAlarma(boolean estado) {
        alarmaBloqueo.activarAlarma(estado);
    }

    public void bloquearPuertas(boolean estado) {
        alarmaBloqueo.bloquearPuertas(estado);
    }

    // Métodos para iluminación
    public void cambiarLucesDelanteras(TipoLuz tipo) {
        iluminacion.cambiarLucesDelanteras(tipo);
    }

    public void activarIntermitentes(boolean estado) {
        iluminacion.activarIntermitentes(estado);
    }

    public void activarLucesEmergencia(boolean estado) {
        iluminacion.activarLucesEmergencia(estado);
    }

    public boolean getLucesPuertas() {
        iluminacion.actualizarLucesPuertas();
        return iluminacion.isLucesPuertas();
    }

    // Métodos para limpia parabrisas
    public boolean cambiarVelocidadLimpiaParabrisas(VelocidadLimpiaParabrisas velocidad) {
        return limpiaParabrisas.cambiarVelocidad(velocidad);
    }
    public VelocidadLimpiaParabrisas getVelocidadLimpiaParabrisas() {
    return limpiaParabrisas.getVelocidad();
}

    // Métodos para radio
    public void encenderRadio() {
        radio.encender();
    }

    public void apagarRadio() {
        radio.apagar();
    }

    public void cambiarModoRadio(ModoRadio modo) {
        radio.cambiarModo(modo);
    }

    public void sintonizarRadio(double frecuencia) {
        radio.sintonizar(frecuencia);
    }

    // Métodos para climatización
   
    public void cambiarVelocidadClimatizacion(EstadoClimatizado velocidad) {
        climatizacion.cambiarVelocidad(velocidad);
    }

    public void activarAC(boolean estado) {
        climatizacion.activarModoAC(estado);
    }

    public void activarCalefaccion(boolean estado) {
        climatizacion.activarModoCalefaccion(estado);
    }
    public EstadoClimatizado getVelocidadClimatizacion() {
    return climatizacion.getVelocidad();
    }

    public boolean isACActivo() {
    return climatizacion.isAC();
    }

    public boolean isCalefaccionActiva() {
    return climatizacion.isCalefaccion();
    }

    public void apagarClimatizacion() {
    climatizacion.apagar();
    }

    public boolean permiteClimatizacion() {
    return encendido.permiteSubsistemasBasicos(); // Asumiendo que este método ya existe
    }

    // Métodos para energía
    public double getNivelEnergia() {
        return energia.getNivel();
    }

    public void consumirEnergia(double cantidad) {
        energia.consumir(cantidad);
    }

    public void recargarEnergia(double cantidad) {
        energia.recargar(cantidad);
    }

    // Métodos para sensores
    public void setFrenoManoActivo(boolean estado) {
        sensores.setFrenoManoActivo(estado);
    }

    public void setObstaculoDetras(boolean estado) {
        sensores.setObstaculoDetras(estado);
    }
    
    public sistemaSensores getSensores() {
    return sensores;
    }

    // Métodos para kilometraje
    public void actualizarKilometraje(double distancia, double velocidad, int rpm) {
        kilometraje.actualizar(distancia, velocidad, rpm);
    }

    public double getDistanciaRecorrida() {
        return kilometraje.getDistancia();
    }

    public double getVelocidadActual() {
        return kilometraje.getVelocidad();
    }

    public int getRPMActual() {
        return kilometraje.getRPM();
    }
} 
