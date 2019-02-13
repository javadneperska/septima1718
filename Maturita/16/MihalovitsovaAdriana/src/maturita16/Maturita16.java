/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita16;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
if ( sc.hasNextInt() )   {
   
        int num = sc.nextInt();
        
       if (num >0){
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum); 
    }
       else  {
    System.out.println("Invalid");
    }
        }
else  {
    System.out.println("Invalid");
    }
}
}
    

