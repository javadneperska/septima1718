/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita1;

import static java.lang.System.in;
import java.util.Scanner;



public class Maturita1 {

    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number");
       double a = sc.nextDouble();
       System.out.println("Enter the second number");
       double b = sc.nextDouble();
       
        System.out.println("Results:");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
    
    
   
}
