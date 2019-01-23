/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 20;

        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }

        Random rand = new Random();
        while(list.size() > 0) {
            int index = rand.nextInt(list.size());
            System.out.println(list.remove(index));
        }

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt())  {
        int find = sc.nextInt() ;
      
        boolean found = false;

        for (int n : list) {
            if (n == find) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(find + " is found.");
        else
            System.out.println(find + " is not found.");
     }
        else {
            System.out.println("Invalid");
        
        }
    }

   
}
    

