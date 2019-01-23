package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int rand;
        int counter=0;
        ArrayList<Integer> nums = new ArrayList<Integer>(20);
        while(counter < 20){
            counter++;
            rand = rn.nextInt(99+1)+1;
            while(nums.indexOf(rand)!=(-1)){
                rand = rn.nextInt(99+1)+1;
            }
            nums.add(rand);
        }

        System.out.println("Zadaj cislo (od 1 do 100)");
        try {
            int z = sc.nextInt();
            if(nums.indexOf(z)!=(-1)){
                System.out.println("Je zhoda");
            }else{
                System.out.println("Nieje zhoda");
            }
        } catch (Exception e) {
            System.out.println("Zly vstup");
        }

        System.out.println("\nVygenerovane cisla");
        Collections.sort(nums);
        for (Object num : nums) {
            System.out.print(num+" ");
        }





    }

}