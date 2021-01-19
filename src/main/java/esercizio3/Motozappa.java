/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

/**
 *
 * @author andre
 */
public class Motozappa extends Apparecchiatura{
   private int nruote;

    public Motozappa(int nruote, String marca) {
        super(marca);
        this.nruote = nruote;
    }

    public int getNruote() {
        return nruote;
    }

    @Override
    public String toString() {
        String ris="";
        ris += "Motozappa, " + nruote+" ruote,"+super.toString();
        return ris;
    }
   

   
}
