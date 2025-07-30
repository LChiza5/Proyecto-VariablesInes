/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ilope
 */
public class sistemaSensores {
    private boolean frenoManoActivo;
    private boolean obstaculoDetras;

    public void setFrenoManoActivo(boolean estado){
        frenoManoActivo = estado;
    }
    public void setObstaculoDetras(boolean estado){
        obstaculoDetras = estado;
    }

    public boolean isFrenoManoActivo(){
        return frenoManoActivo;
    }
    public boolean isObstaculoDetras(){
        return obstaculoDetras;
    }
}
