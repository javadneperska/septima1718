/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Žiak
 */
public class Zakaznik {
    String meno;
    String priezvisko;
    
    
    
    public static int pocetZakaznikov = 0;
    
        public Zakaznik(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        pocetZakaznikov++;
    }
        
        
        
        
    
    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }



}
