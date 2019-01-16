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
public class Ucitel implements Human, Ucitelia{

    public Ucitel(int vek, String meno, int znamka) {
        this.vek = vek;
        this.meno = meno;
        this.znamka = znamka;
    }
    
        public Ucitel(int vek, String meno) {
        this.vek = vek;
        this.meno = meno;
    }

    private int vek;
    private int znamka;
    private String meno;
    
    
    @Override
    public int getVek() {
        return vek;
    }

    @Override
    public String getMeno() {
        return meno;
    }

    @Override
    public void dajZnamku() {
        System.out.println("Zadana znamka je "+znamka);
    }
    
}
