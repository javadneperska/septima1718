/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg7;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        System.out.println("Enter a word");
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int l = str.length();
        if(l > 4) {
        
        String reverse = "";
        
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("The word backwards is:");
        System.out.println(reverse);
        
      }
        else {
            System.out.println("Invalid");
    }
            System.out.println("The number of letters is: "+ l);
    }
    }
    

