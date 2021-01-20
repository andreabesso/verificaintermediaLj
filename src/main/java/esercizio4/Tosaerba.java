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
public class Tosaerba extends Apparecchiatura{
    
    private int nruote;

    public Tosaerba(int nruote, String marca) {
        super(marca);
        this.nruote = nruote;
    }

    public int getNruote() {
        return nruote;
    }

    @Override
    public String toString() {
        String ris="";
        ris += "Tosaerba, " + nruote+" ruote,"+super.toString();
        return ris;
    }

   

    
    
}
