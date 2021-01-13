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
public class App {

    static Garage garage=new Garage();

    public static void main(String[] args) {
        Auto veicolo1 = new Auto("Fiat", 2018, 1200, 4, Auto.Alimentazione.Benzina);
        garage.addVeicolo(veicolo1);
        Furgone veicolo2 = new Furgone(14, "Ducati", 2008, 1600);
        garage.addVeicolo(veicolo2);
        Moto veicolo3 = new Moto(4, "500", 2012, 1200);
        garage.addVeicolo(veicolo3);
        garage.infoGarage();
        garage.removeVeicolo(2);
        garage.infoGarage();
    }

}