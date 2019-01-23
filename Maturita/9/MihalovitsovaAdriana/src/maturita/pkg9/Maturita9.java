/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg9;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
     Scanner sc = new Scanner (System.in);
      
     
     if (sc.hasNextInt()) {
      int height = sc.nextInt(); 
         for ( int i=1 ; i<=height ; i++ ) {
             for ( int j=1 ; j <= i ; j++ ) {
                 if(i==1 || i==2 || i==height || j==1 | j==i)
                     System.out.print("*");
                 else
                     System.out.print(" ");
             }
             System.out.println();
         } }
     else {
         System.out.println("Invalid");
         }
     }
       }

    

