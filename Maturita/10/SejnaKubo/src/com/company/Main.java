package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Zadaj 7 cisel");
        try {
            for (int j = 0; j < 7; j++) {

                list.add(sc.nextInt());

            }
        } catch (Exception e) {
            System.out.println("ZLy vstup");
        }
        for (Integer integer : list) {
            System.out.print(integer-1+" ");
        }
    }
}
