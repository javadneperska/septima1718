package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    private static int [][] numberArray = new int[3][3];
    private static int [][] numberArray2= new int [3][3];
    private static int [][] resultMatrix= new int [3][3];
//    private static int sum = 0 ;
//    private static long multip = 1 ;
    private  static Random rn = new Random();
    private  static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        arrayFill();
        arrayFill2();
//        sum();
        multiplication();
        printData();
    }

    private static void printData() {
        System.out.println("Matrix 1 : " + Arrays.deepToString(numberArray));
        System.out.println("Matrix 2 : " + Arrays.deepToString(numberArray2));
        System.out.println("Result Matrix : " + Arrays.deepToString(resultMatrix));
//        System.out.println("Summary : " +sum);
//        System.out.println("Multiplication : " + multip);
    }

    private static void multiplication() {
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length ; j++) {
                resultMatrix[i][j] = numberArray[i][j] * numberArray2[i][j];
            }
        }
    }

  /*  private static int sum() {
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length ; j++) {
                    sum += numberArray[i][j]; }
        }
        return sum;
    } */

    private static void arrayFill2(){
        arrayFill();

        for (int i = 0; i < numberArray2.length; i++) {
            for (int j = 0; j < numberArray2[i].length ; j++) {
                System.out.println("Type next number : ");
                int printedNumber= sc.nextInt();
                numberArray2[i][j]= printedNumber ;


            }
        }

    }

    private static void arrayFill() {
        try {
            BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\instal\\Desktop\\numbers.txt"));
            String savingPoint= null;
            int j =0;
            while((savingPoint=br.readLine()) !=null) {
             String[] field = savingPoint.split(",");
                for (int i = 0; i < field.length; i++) {
                    numberArray[j][i] = Integer.parseInt(field[i]);
                }
                j++;
            }
        }
     catch (FileNotFoundException e) {
            e.toString();
        } catch (IOException e) {
           e.toString();
        }
    }
}