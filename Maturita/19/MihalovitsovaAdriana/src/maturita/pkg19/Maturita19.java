/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg19;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
         if (sc.hasNextInt()) {
            
             System.out.println("Invalid.");
}

         else { 
          String s = sc.nextLine();
        
String[] arr = s.split(" ");    

for ( String ss : arr) {
    System.out.println(ss);
         
         }
    }
   } 
}
