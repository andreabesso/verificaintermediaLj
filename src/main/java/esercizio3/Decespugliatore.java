/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

/**
 *
 * @author andre
 */
public class Decespugliatore extends Apparecchiatura {

    private boolean accElettrica;

    public Decespugliatore(boolean accElettronica, String marca) {
        super(marca);
        this.accElettrica = accElettronica;
    }

    public boolean isAccElettrica() {
        return accElettrica;
    }

    @Override
    public String toString() {
        String ris = "";

        ris += "Decespugliatore, Accensione: ";
        if (accElettrica) {
            ris += "elettrica," + super.toString();
        } else {
            ris += "non elettrica," + super.toString();
        }
        return ris;
    }

}
