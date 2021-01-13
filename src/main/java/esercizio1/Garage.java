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

    static ArrayList<Veicolo> garage = new ArrayList<Veicolo>();

    public static void addVeicolo(Veicolo veicolo) {
        Veicolo v = veicolo;
        garage.add(v);
    }

    public static Veicolo removeVeicolo(int idx) {
        Veicolo v = garage.get(idx);
        garage.remove(idx);
        return v;
    }

    public String infoGarage() {
        String ris = "";
        for (Veicolo v : garage) {
            ris += v.info();
        }
        return ris;
    }

}