/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n, c, fact = 1;
      System.out.println("Enter a number: ");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      if (n < 0)
         System.out.println("Invalid");
      else
      {
         for (c = 1; c <= n; c++)
            fact = fact*c;
         System.out.println("The factorial of "+n+" is = "+fact);
    }
    
}
}