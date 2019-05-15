/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Žiak
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          HashMap<String, Integer> znamky = new HashMap<String, Integer>();

    // Add keys and values (Country, City)
    znamky.put("Jozef", 5);
    znamky.put("Marek", 1);
    znamky.put("Peter", 2);
    znamky.put("Janko", 3);
    znamky.put("Maros", 4);
    znamky.put("Henrich", 5);
    znamky.put("Adolf", 1);
    int input = 1;
     while(input != 0){   

        String info = "";
        
    Scanner sc = new Scanner(System.in);
    do{        System.out.println("1 - pridaj ziaka");
        System.out.println("0 - vypis ziakov");
        input = sc.nextInt();
    } while(input != 1 && input != 0);
        sc.nextLine();
    if(input == 1){
        System.out.println("Zadaj meno a znamku");
        info = sc.nextLine();
        znamky.put(info.split(" ")[0], Integer.parseInt(info.split(" ")[1]));
    }
    

        
    }
    
    for (String i : znamky.keySet()) {
        if(znamky.get(i) < 5){
            System.out.println("meno: " + i + " znamka: " + znamky.get(i));
        }
    }
    
}}
