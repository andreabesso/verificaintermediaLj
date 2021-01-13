/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Garage {

    static ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();

    public static void addVeicolo(Veicolo veicolo) {
        Veicolo v = veicolo;
        veicoli.add(v);
    }

    public static Veicolo removeVeicolo(int idx) {
        Veicolo v = veicoli.get(idx);
        veicoli.remove(idx);
        return v;
    }

    public void infoGarage() {
        String ris = "";
        int i=0;
        for (Veicolo v : veicoli) {
            ++i;
            System.out.println("Posto "+ i+" " + v.info());
        }
        
    }

}