/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg6;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the month: ");
       
        
        if(sc.hasNextInt()) {
        int a = sc.nextInt();

        
        if(a>12 || a<0){
            System.out.println("Invalid");
            
         }   
        else {
            if(a==1 || a==2 || a==12)
                System.out.println("Zimny mesiac");
            if(a==3 || a==4 || a==5)
                System.out.println("Jarny mesiac");
            if(a==6 || a==7 || a==8)
                System.out.println("Letny mesiac");
            if(a==9 || a==10 || a==11)
                System.out.println("Jesenny mesiac");
             }
        
    }
        else {
            System.out.println("Invalid");
            }
        }
    
    
        }
        
    

