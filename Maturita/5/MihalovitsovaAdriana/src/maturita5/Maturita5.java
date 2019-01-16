/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita5;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp;
	boolean isPrime=true;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number:");
	int num=sc.nextInt();
        sc.close();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   System.out.println(num + " is a prime Number");
	else
	   System.out.println(num + " is not a prime Number");
    }
    
}
