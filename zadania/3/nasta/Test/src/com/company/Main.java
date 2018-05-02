package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
//--------------------------------------------------------------
        Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\zaytsevaa\\Desktop\\Subor.txt")));
        int multiply[][] = new int[3][3];

        int[][] myArray = new int[3][3];

        while (sc.hasNextLine()) {
            for (int i = 0; i < myArray.length; i++) {
                String[] line = sc.nextLine().trim().split(",");
                for (int j = 0; j < line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                    //  prod = array2d[i][j] * myArray[i][j];
                }
            }
        }
//--------------------------------------------------------------
        int[][] array2d = new int[3][3];
        System.out.print("Vypis elementy prveho 2d pola: ");

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {

                array2d[i][j] = in.nextInt();
                multiply[i][j]=array2d[i][j]*myArray[i][j];

            }

        }
//---------------------------------------------------------------------

//------------------------------------------------------------------------------------


        for(int z =0; z<multiply.length; z++){
            for(int w =0; w<multiply[z].length; w++){
                System.out.println(multiply[z][w]);

            }
        }


        }
   }





