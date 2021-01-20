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
public class App {

    public static void main(String[] args) {
        try {
            System.out.println("Inizio esercizio 3");
            Aggiusteria agg = new Aggiusteria(15);
            Apparecchiatura t1 = new Tosaerba(4, "Active");
            Riparazione r1 = new Riparazione("Cambio ruote", 150);
            immissioneAgg(agg, t1, r1);
            Apparecchiatura d1 = new Decespugliatore(true, "Bosh");
            Riparazione r2 = new Riparazione("Cambio filo", 50);
            immissioneAgg(agg, d1, r2);
            Apparecchiatura m1 = new Motozappa(2, "Benassi");
            Riparazione r3 = new Riparazione("Cambio maniglia", 30);
            immissioneAgg(agg, m1, r3);
            agg.situazione();
            Apparecchiatura uscita = uscitaAgg(agg, 1);
            System.out.println("E' uscita l'apparecchiatura:\n" + uscita + "\n");
            agg.situazione();

            System.out.println("Fine esercizio 3");
        } catch (Exception e) {
            System.out.println("Oops qualcosa è andato storto...");
        }
    }

    public static void immissioneAgg(Aggiusteria agg, Apparecchiatura a, Riparazione r) {
        try {
            agg.entra(a, r);
        } catch (AggiusteriaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Apparecchiatura uscitaAgg(Aggiusteria agg, int posto) {
        try {
            return agg.esci(posto);
        } catch (AggiusteriaException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
