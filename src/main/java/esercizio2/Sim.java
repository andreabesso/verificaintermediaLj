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

    private final String numeroSim;
    private float credito;
    private ArrayList<Telefonata> elencoTelefonate;

    public Sim(String numeroSim, float credito) {
        this.numeroSim = numeroSim;
        this.credito = credito;
        this.elencoTelefonate = new ArrayList<Telefonata>();
    }

    public String getNumeroSim() {
        return numeroSim;
    }

    public float getCredito() {
        return credito;
    }

    public void addTelefonata(String numeroChiamato, int minuti) {
        this.elencoTelefonate.add(new Telefonata(numeroChiamato, minuti));
    }

    public String numRichiamato(String numeroRichiamato) {
        int numr = 0;
        for(Telefonata t : elencoTelefonate){
            if(t.getNumeroChiamato().equals(numeroRichiamato)) {
                numr++;
            }
        }
        return numr + " telefonate effettuate al numero: " + numeroRichiamato;
    }

    public String totMin() {
        int ris = 0;
        for (int i = 0; i < elencoTelefonate.size(); i++) {
            ris = ris + elencoTelefonate.get(i).getMinuti();
        }
        return "Minuti totali di conversazione: " + ris;
    }

    @Override
    public String toString() {
        String ris = "";
        ris = "Numero della sim: " + getNumeroSim() + ", Credito: " + getCredito() + " \nElenco telefonate:";
        for (int i = 0; i < elencoTelefonate.size(); i++) {
            ris += "\nNumero chiamato; " + elencoTelefonate.get(i).getNumeroChiamato() + ", minuti usati: " + elencoTelefonate.get(i).getMinuti();
        }
        return ris;
    }

}
