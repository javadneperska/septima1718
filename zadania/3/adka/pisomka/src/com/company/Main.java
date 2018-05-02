package com.company;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String line;
    public static int myArray[][] = new int[3][3];
    public static int secArray[][] = new int[3][3];
    public static int multiply[][] = new int[3][3];
    public static int sum[][] = new int[3][3];
    public static String path = "C:\\Users\\tarabaf\\Desktop\\k.txt";
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        int row = 0;

        while ((line = br.readLine()) != null){
            String[] nums = line.split(",");

            for (int col = 0; col < nums.length; col++){

                int n = Integer.parseInt(nums[col]);

                myArray[row][col] = n;
            }
            row++;
        }
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < secArray.length; i++){
                for (int k = 0; k < secArray[i].length; k++){
                    System.out.println("Enter number:");
                secArray[i][k] = sc.nextInt();
                    sum[i][k] = myArray[i][k] + secArray[i][k];
                    multiply[i][k] = myArray[i][k] + secArray[i][k];


            }


            }
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply[i].length; j++) {
                System.out.print("\t" + multiply[i][j] + "(i:" + i + ";j:" + j + ")");
            }
            System.out.println();
        }


}


    }
