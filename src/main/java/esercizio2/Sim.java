/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Sim {

    static ArrayList<Integer> telefonate = new ArrayList<Integer>();
    int numerotelefono;
    float credito;

    public Sim(int numerotelefono, float credito) {
        this.numerotelefono = numerotelefono;
        this.credito = credito;
        telefonate = new ArrayList<Integer>();
    }

    public static ArrayList<Integer> getTelefonate() {
        return telefonate;
    }

    public int getNumerotelefono() {
        return numerotelefono;
    }

    public float getCredito() {
        return credito;
    }

    @Override
    public String toString() {
        return "Sim{" + "numerotelefono=" + numerotelefono + ", credito=" + credito + '}';
    }
    
    
}
