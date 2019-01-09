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
public class Kocka {
    //kvader
        public void countObjem(double x,double y, double z){
        Rozmery r = new Rozmery(x, y, z);

        System.out.println("Objem je: "+(r.getDlzka()*r.getVyska()*r.getHlbka())+" j.d.");
    }
    
    public void countObsah(double x, double y, double z){
        Rozmery r = new Rozmery(x, y, 0);

        System.out.println("Obsah je: "+2*(r.getDlzka()*r.getVyska()+r.getDlzka()*r.getHlbka()+r.getVyska()*r.getHlbka())+" j.d.");
    }
    
}
