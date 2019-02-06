/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita12;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
       int amount = sc.nextInt();
       
     
           
       int[] notes = new int[]{ 500, 200, 100, 50, 20, 10, 5 }; 
        int[] noteCounter = new int[7]; 
       
    
        for (int i = 0; i < 7; i++) { 
            if ( amount >= notes[i]) { 
                noteCounter[i] = amount / notes[i]; 
                amount = amount - noteCounter[i] * notes[i]; 
            } 
        } 
       
        
        System.out.println("Bank notes :"); 
        for (int i = 0; i < 7; i++) { 
            if (noteCounter[i] != 0) { 
                System.out.println(notes[i] + " x " + noteCounter[i]); 
            } 
        }
        
        int[] change = new int[]{ 2, 1 }; 
        int[] changeCounter = new int[2]; 
       
    
        for (int i = 0; i < 2; i++) { 
            if ( amount >= change[i]) { 
                changeCounter[i] = amount / change[i]; 
                amount = amount - changeCounter[i] * change[i]; 
            } 
        } 
       
        
        System.out.println("Change :"); 
        for (int i = 0; i < 2; i++) { 
            if (changeCounter[i] != 0) { 
                System.out.println(change[i] + " x " + changeCounter[i]); 
            } 
        } 
        
        
        
        }
       else  { 
           System.out.println("Invalid");
           
           }
       }
    }
    

