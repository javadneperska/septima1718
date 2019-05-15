/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.HashMap;

/**
 *
 * @author Žiak
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Create a HashMap object called capitalCities
    HashMap<String, Integer> znamky = new HashMap<String, Integer>();

    // Add keys and values (Country, City)
    znamky.put("Jozef", 5);
    znamky.put("Marek", 1);
    znamky.put("Peter", 2);
    znamky.put("Janko", 3);
    znamky.put("Maros", 4);
    znamky.put("Henrich", 5);
    znamky.put("Adolf", 1);
    
    for (String i : znamky.keySet()) {
        if(znamky.get(i) < 5){
            System.out.println("meno: " + i + " znamka: " + znamky.get(i));
        }
}
    }
    
}
