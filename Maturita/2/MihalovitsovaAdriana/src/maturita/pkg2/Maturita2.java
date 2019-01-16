/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita2 {

   
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter first number");
    int a = sc.nextInt();
     System.out.println("Enter second number");
    int b = sc.nextInt();
     int i;  
    for(i=a; i<b ;i++){
    if(i%2==0)
            System.out.println(i+" ");
    }
        System.out.println( );
       
    }
    
}
