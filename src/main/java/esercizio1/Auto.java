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
public class Auto extends Veicolo {

  public  int porte;
   public String alimentazione;

     Auto(int porte, String alimentazione, String marca, int anno, int cilindrata) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    public int getPorte() {
        return porte;
    }


    public String getAlimentazione() {
        return alimentazione;
    }

    @Override
   public String info() {
        String ris = "";
        ris += super.info();
        ris += "Numero porte: " + getPorte()+", ";
        ris += "Alimentazione: " + getAlimentazione()+", ";
        return ris;
    }
}
