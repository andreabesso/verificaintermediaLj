/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author andre
 */
public class App {

    static Garage g = new Garage(15);

    public static void main(String[] args) {
        Auto a=new Auto("Fiat", 2018, 1200, 4, Auto.Alimentazione.BENZINA);
        g.addVeicolo(a);
        g.addVeicolo(new Furgone(14, "Ducati", 2008, 1600));
        g.addVeicolo(new Moto(4, "500", 2012, 1200));
        g.infoGarage();
        g.removeVeicolo(2);
        g.infoGarage();
    }
    
   
}