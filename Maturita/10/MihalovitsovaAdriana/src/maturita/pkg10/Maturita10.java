/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg10;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[8];
    
   System.out.println("Please enter number");
if (sc.hasNextInt()) {
    for (int i = 0; i < 8; i++)
    {
       
        arr[i] = sc.nextInt();
       
    }
    
         for (int i = 0; i < arr.length-1; i++) {
             arr[i] -= 1;
             System.out.println("Numbers substracted by 1: " + arr[i]);
}
         }
    else {
        System.out.println("Invalid");
    }
    }
    }
 

            
        
    
    

