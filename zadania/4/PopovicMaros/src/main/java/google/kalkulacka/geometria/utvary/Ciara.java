/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package google.kalkulacka.geometria.utvary;

import google.kalkulacka.geometria.Rozmery;

/**
 *
 * @author Žiak
 */
public class Ciara {


    public void countLength(double length) {
        Rozmery r = new Rozmery(length, 0, 0);
        System.out.println("Dlzka je: "+r.getDlzka()+" j.d.");
    }
}
