/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package google.kalkulacka.geometria;

/**
 *
 * @author Žiak
 */
public class Rozmery {
    
    private double dlzka;
    private double vyska;
    private double hlbka;
    
    public Rozmery(double dlzka, double vyska, double hlbka) {
        this.dlzka = dlzka;
        this.vyska = vyska;
        this.hlbka = hlbka;
    }

    public double getDlzka() {
        return dlzka;
    }

    public double getVyska() {
        return vyska;
    }

    public double getHlbka() {
        return hlbka;
    }

    
}
