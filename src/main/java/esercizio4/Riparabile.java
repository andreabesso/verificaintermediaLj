/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;

/**
 *
 * 
 * @author andre
 */
public interface Riparabile {

    String getRiparazione();

    float getCostoRip();

    void entra(Apparecchiatura a, Riparazione r);
     Apparecchiatura esci(int posto);
}
