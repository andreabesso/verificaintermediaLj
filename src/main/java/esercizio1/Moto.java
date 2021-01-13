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
public class Moto extends Veicolo{
    private int tempi;

    public Moto(int tempi, String marca, int anno, int cilindrata) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }

    public int getTempi() {
        return tempi;
    }

    @Override
    public String toString() {
        return super.toString()+"tempi=" + tempi;
    }

  
 
}