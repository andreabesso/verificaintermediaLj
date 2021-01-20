/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Aggiusteria {

    static List<Apparecchiatura> listaApparecchi;
    private int posti;

    public Aggiusteria(int posti) {
        this.posti = posti;
        listaApparecchi = new ArrayList<>(posti);
        inizializza();
    }

    public int getPosti() {
        return posti;
    }

     public void entra(Apparecchiatura a, Riparazione r) {
        if (postoLibero()== -1) {
            throw new AggiusteriaException("Aggiusteria piena...");
        }else{
            a.addRiparazione(r);
        listaApparecchi.set(postoLibero(), a);
        }
    }

     public Apparecchiatura esci(int posto) {
        if (posto >= this.posti || listaApparecchi.get(posto) == null) {
            throw new AggiusteriaException("Il posto non esiste oppure è vuoto");
        }
        Apparecchiatura a = listaApparecchi.get(posto);
        listaApparecchi.set(posto, null);
        return a;
    }

  public void situazione() {
        for (int posto = 0; posto < listaApparecchi.size(); posto++) {
            if (listaApparecchi.get(posto) != null) {
                System.out.println("--------------- POSTO " + posto + "------------------");
                System.out.println(listaApparecchi.get(posto));
                System.out.println("---------------------------------");
                System.out.println();
            }

        }
    }

    private void inizializza() {
      for (int i = 0; i < this.posti; i++) {
            listaApparecchi.add(null);
        }
    }
     private int postoLibero() {
        return listaApparecchi.indexOf(null);
    }
}
