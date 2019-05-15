package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and grade. If finished press 0");
        for (; ; ) {

            System.out.print("Enter name: ");
            String input = sc.next();
            if (input.equalsIgnoreCase("0"))
                break;
            System.out.print("Grade: ");
            int grade = sc.nextInt();
            hashMap.put(input, grade);
        }


        printResult(hashMap);
    }

    private static void printResult(HashMap<String, Integer> hashMap) {
        for (String i : hashMap.keySet()) {
            if (hashMap.get(i) == 5) {
                System.out.println(i + " " + hashMap.get(i) + " " + " failed");
            } else {
                System.out.println(i + " " + hashMap.get(i) + " passed");
            }
        }
    }
}
