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

    int posti;
    static ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();

    public Garage(int posti) {
        this.posti = posti;
        veicoli=new ArrayList<>(posti);
    }

    public int getPosti() {
        return posti;
    }

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
        System.out.println("Posti Parcheggio");

        for (int posto=0; posto<veicoli.size();posto++) {
            System.out.println("Posto " + posto + " " + veicoli.toString());
        }

    }

}
