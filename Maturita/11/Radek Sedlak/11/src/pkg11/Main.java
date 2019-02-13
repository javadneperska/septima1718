/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

import java.util.Scanner;

/**
 *
 * @author Žiak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int i;
        int j;
        System.out.println("kolko schodov?");
        int g=sc.nextInt();
        System.out.println("aky dlhý schod");
        int h=sc.nextInt();
        String a = "     ";
       
          
    for (i = 1; i <= g; i++) {

    for (j = 1; j < i; j++) {
                
        System.out.print(a);
    }
        for (j = 1; j <= h; j++) {
    System.out.print("*");
    }
    System.out.println("");
    
    
    }
        
    }
    }
    
