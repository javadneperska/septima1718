/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg20;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money");
        double sum = sc.nextDouble();
         System.out.println("Enter rate");
        double rate = sc.nextDouble();
         System.out.println("Enter years");
        int years = sc.nextInt();
        double finsum = 0;
        for (int i = 0; i < years; i++) {
           
          sum += sum*(rate/100);
         finsum = sum;
            
        }
        System.out.println(finsum);
    }
    
}
