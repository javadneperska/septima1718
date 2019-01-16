/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita3 {

   
    public static void main(String[] args) {
      int arr[] = new int[10];	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers\n");
		for(int i = 0; i<10; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 1; i<10; i++){
                        if(i%2==0 || i%7==0)
            System.out.println("The numbers: " + i);
		}
    }
    }
    

