/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Žiak
 */
public class Main {
        public static void main(String[] args){
            Zakaznik z = new Zakaznik("Meno","Priezvisko");
            Zakaznik c = new Zakaznik("Meno","Priezvisko");
            Zakaznik d = new Zakaznik("Meno","Priezvisko");
            
            System.out.println("POCET ZAKAZNIKOV JE "+Zakaznik.pocetZakaznikov);
    }
}
