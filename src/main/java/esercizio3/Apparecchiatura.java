/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Apparecchiatura {

    private final int nordine;
    private static int i;
    private String marca;
    private float totCosto;
    static List<Riparazione> listaRiparazioni;

    public Apparecchiatura(String marca) {
        this.marca = marca;
        this.nordine = ++i;
        this.totCosto=0;
        this.listaRiparazioni=new ArrayList<>();
    }

    public int getNordine() {
        return nordine;
    }

    public String getMarca() {
        return marca;
    }

    public float getTotCosto() {
        return totCosto;
    }
    
    public void addRiparazione(Riparazione r) {
        this.listaRiparazioni.add(r);
        this.totCosto +=r.getCostoRip();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.nordine;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Apparecchiatura other = (Apparecchiatura) obj;
        if (this.nordine != other.nordine) {
            return false;
        }
        return true;
    }

    
@Override
    public String toString() {
        return " Numero ordine: " + getNordine() + ", Marca: " + getMarca() + ", Totale costo riparazione: " + getTotCosto();
    }

}
