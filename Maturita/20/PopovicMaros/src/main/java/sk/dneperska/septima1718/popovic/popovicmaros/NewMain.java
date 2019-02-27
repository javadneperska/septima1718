/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.dneperska.septima1718.popovic.popovicmaros;

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
        double vklad = 0;
        int pow = 0;
        double urok = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("zadaj vklad");
        if(sc.hasNextDouble()){
            vklad = Double.parseDouble(sc.next());
        } else {
            System.out.println("Chyba");
            System.exit(0);
        }
        
        System.out.println("zadaj pocet rokov");
        if(sc.hasNextInt()){
            pow = Integer.parseInt(sc.next());
        } else {
            System.out.println("Chyba");
            System.exit(0);
        }
        
        System.out.println("zadaj urok %");
        if(sc.hasNextDouble()){
            urok = Double.parseDouble(sc.next());
        } else {
            System.out.println("Chyba");
            System.exit(0);
        }
        
        urok = (100+urok)/100;
        
        double eur = vklad*Math.pow(urok, pow);
        eur = Math.round(eur*100);
        eur /= 100;
        
        System.out.println(eur+" €");
    }
    
}
