/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package google.kalkulacka;

import google.kalkulacka.geometria.utvary.*;

/**
 *
 * @author Žiak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ciara c = new Ciara();
        c.countLength(10);
        
        Stvorec s = new Stvorec();
        s.countObsah(5, 10);
        s.countObvod(2, 6);
        
        Kocka k = new Kocka();
        k.countObjem(10, 5, 3);
        k.countObsah(4, 23, 2);
    }
    
}
