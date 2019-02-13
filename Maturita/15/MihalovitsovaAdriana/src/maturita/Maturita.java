/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String numberr = "0";        
        System.out.print("Enter a number with at least 3 digits:");
        numberr = sc.nextLine();
       
        if (parseintt(numberr))   { 
       int number = Integer.parseInt(numberr);
   

    if (number < 100) {
          System.out.println("Invalid");
    }
    else{ 
        int n = 0;
        while (number != 0) {
               
      
        int zvysok = number  % 10;
        
        if(zvysok > n){
            n = zvysok;
            
          }       
      number = number/10;
       }
        System.out.println(n);
        
    }
    
}
        
        
     
       
    }
    
    
    public static boolean parseintt (String num){ 
        try{ Integer.parseInt(num);
                return true;
        } catch(Exception e) {
            System.out.println(e.toString());
           
        }
        return false;
    }
}
