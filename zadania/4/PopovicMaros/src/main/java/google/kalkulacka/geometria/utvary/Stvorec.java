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
public class Stvorec {
    //obdlznik
    public void countObvod(double x,double y){
        Rozmery r = new Rozmery(x, y, 0);
        //obvod
        System.out.println("Obvod je: "+2*(r.getDlzka()+r.getVyska())+" j.d.");
    }
    
    public void countObsah(double x, double y){
        Rozmery r = new Rozmery(x, y, 0);
        //obvod
        System.out.println("Obvod je: "+r.getDlzka()*r.getVyska()+" j.d.");
    }
    
    
}
