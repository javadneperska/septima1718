package com.company;


import java.util.Scanner;

public class Main {
    private static final String DELIMITER = " ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        String[] arr = sent.split(DELIMITER);


        for (String s : arr) {

            System.out.println(s);

        }
    }
}

