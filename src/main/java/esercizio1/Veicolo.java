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
public class Veicolo {

    private String marca;
    private int anno, cilindrata;

    public Veicolo(String marca, int anno, int cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    public int getCilindrata() {
        return cilindrata;
    }
    
    public String info() {
        String ris = "";
        ris +="\n";
        ris += "Marca: " + getMarca()+", ";
        ris += "Anno: " + getAnno()+", ";
        ris += "Cilindrata: " + getCilindrata()+", ";
        return ris;
    }

}
