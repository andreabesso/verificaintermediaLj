/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author andre
 */
public class Telefonata {

    private String numeroChiamato;
    int minuti;

    public Telefonata(String numeroChiamato, int minuti) {
        this.numeroChiamato = numeroChiamato;
        this.minuti = minuti;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getMinuti() {
        return minuti;
    }

    public String toString() {
        String ris="";
        ris+="Numero chiamato; " + numeroChiamato + ", minuti usati: " + minuti;
        return ris;
    }
    
    
    
}
