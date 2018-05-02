package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static String path = "C:\\Users\\ferencikp\\Desktop\\Text.txt";
public static int myArray [][] = new int [3][3];
public static int my2Array[][] = new int [3][3];
   static int [][] result = new int[myArray.length][my2Array[0].length];
    public static void main(String[] args) {
        loadField();

        Scanner sc = new Scanner(System.in);
        create2ndField(sc);
        multiplication();
        printResult();
    }

    private static void printResult() {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print("\t" + result[i][j] + "(i:" + i + ";j:" + j + ")");
            }
            System.out.println();
        }
    }

    private static void create2ndField(Scanner sc) {
        for (int i = 0;i<my2Array.length;i++) {
            for (int j = 0; j < my2Array[i].length; j++) {
                System.out.println("Zadaj" + " " + (i + 1) + "." + (j + 1)+" " + "cislo:");
                my2Array[i][j] = sc.nextInt();
                System.out.println(my2Array[i][j]);
            }
        }
    }


    private static void multiplication() {
        for (int c =0;c<result.length;c++){
            for (int d = 0; d <result[c].length ; d++) {
                result[c][d]=myArray[c][d]*my2Array[c][d];
            }}
    }

    private static void loadField() {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            int row = 0;
            String line = null;
            while ((line = br.readLine()) != null){
                String[] nums = line.split(",");

                for (int col = 0; col < nums.length; col++){

                    int n = Integer.parseInt(nums[col]);

                    myArray[row][col] = n;
                   // System.out.println(myArray[row][col]);
                }
                row++;

            }
        }
        catch(IOException io){
            System.out.println("Exception");


        }
    }
}
