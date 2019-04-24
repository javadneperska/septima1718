/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg23;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Lenovo
 */
public class Maturita23 {

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        
        
        System.out.println("Prefix");
        String p = sc.next();
        if(Pattern.matches("[a-zA-Z]+", p) == false && p.length() < 7) {
         
         }
         
         else {
             System.out.println("Invalid");
             System.exit(1);
         }
      
        
        
        
        System.out.println("Kod uctu");
       
        String k = sc.next();
         if(Pattern.matches("[a-zA-Z]+", k) == false && k.length() < 11 ) { 
            
         }
         
         else {
             System.out.println("Invalid");
             
            System.exit(1);
         }
         
         
         
         
         
        System.out.println("Kod banky");
        
        String b = sc.next();
         if( Pattern.matches("[a-zA-Z]+", b) == false && b.length() < 5  ) { 
             
         }
          else {
             System.out.println("Invalid");
             System.exit(1);
         }
         
         
       
        String num = k + "28200"; 
        String num1 = b + p + num;  
     
       System.out.println("SK" + (98 - mod(num1, 97) ) + b + p + k); 
                
       
       
     
        }
    
     static int mod(String num, int a) 
    { 
          
        int res = 0; 
 
        for (int i = 0; i < num.length(); i++) 
            res = (res * 10 + (int)num.charAt(i) 
                                     - '0') % a; 
  
        return res; 
       
    } 
    
    
    
    
        
    
    
}
