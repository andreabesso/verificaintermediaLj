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

  private  int porte;
//   public String alimentazione;
public static enum Alimentazione{
    Benzina, Disel;
}
Alimentazione alimentazione;
      public Auto( String marca, int anno, int cilindrata, int porte, Alimentazione alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }


    public int getPorte() {
        return porte;
    }



   public Alimentazione getAlimentazione() {
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