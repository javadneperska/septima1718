/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.dneperska.septima1718.popovic.popovicmaros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Žiak
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadaj slovo");
        Scanner sc = new Scanner(System.in);
        int pocetSamohlasok = 0;
        String slovo = "-";
        if (!sc.hasNextInt()) {            
            slovo = sc.next();
        }
        
        String samohlasky = "aeiouäáéíóú";
        for (String a : slovo.split("")) {
            if(samohlasky.contains(a)){
                pocetSamohlasok++;
            }
        }
        System.out.println(pocetSamohlasok);
            
      
    }
    
}
