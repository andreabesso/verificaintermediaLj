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
public class App {

    public static void main(String[] args) {
        Sim s1 = new Sim("3466055887", 25);
        s1.addTelefonata("0125751484", 13);
        s1.addTelefonata("0125751456", 5);
        s1.addTelefonata("0125881242", 25);
        s1.addTelefonata("0125753384", 11);
        s1.addTelefonata("0125744582", 35);
        s1.addTelefonata("0125751484", 3);
        System.out.println(s1.toString());
        System.out.println(s1.numRichiamato("0125751484"));
        System.out.println(s1.totMin());
    }
}
