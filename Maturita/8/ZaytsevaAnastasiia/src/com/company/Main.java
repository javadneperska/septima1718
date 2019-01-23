package com.company;

import java.util.*;

public class Main {
    public static final Random gen = new Random();
    static int [] result = new int[20];
    static Set<Integer> used;
    public static void  printRandomNumbers(int n, int maxRange) {

         used= new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {

            int newRandom;
            do {
                newRandom = gen.nextInt(maxRange+1);
            } while (used.contains(newRandom));
            result[i] = newRandom;
            used.add(newRandom);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        printRandomNumbers(10,21);
        int number = sc.nextInt();

            if(used.contains(number)){
                System.out.println("Yes "+number);

            }else{
                System.out.println("fukk");
            }



    }
}
