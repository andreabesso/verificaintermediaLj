/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;



/**
 *
 * @author andre
 */
public abstract class Riparazione implements Riparabile {
   private String riparazione;
   private float costoRip;

    public Riparazione(String riparazione, float costoRip) {
        this.riparazione = riparazione;
        this.costoRip = costoRip;
    }

    public String getRiparazione() {
        return riparazione;
    }

    public void setRiparazione(String riparazione) {
        this.riparazione = riparazione;
    }

    public float getCostoRip() {
        return costoRip;
    }

    public void setCostoRip(float costoRip) {
        this.costoRip = costoRip;
    }

    @Override
    public String toString() {
        String ris="";
        ris = "Riparazione: "+ riparazione + ", Prezzo:"  + costoRip + '}';
        return ris;
    } 
}
