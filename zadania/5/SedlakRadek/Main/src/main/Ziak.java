/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Žiak
 */
public class Ziak implements Ziaci, Human {

    private String meno;
    private int znamka;
    private int vek;
    
    public Ziak(String meno, int znamka, int vek) {
        this.meno = meno;
        this.znamka = znamka;
        this.vek = vek;
    }


    
    @Override
    public int getZnamka() {
        return znamka;
    }

    @Override
    public int getVek() {
       return vek;
    }

    @Override
    public String getMeno() {
        return meno;
    }
    
}
