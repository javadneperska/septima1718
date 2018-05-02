package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class main {
    private static String numberArray [][]=new int [3][3];
    private static int arrayRand[][]=new int [3][3];
    private static int finalArray [][]=new int [3] [3];
private static int random;
private static int scit=0;


public static void main(String []args) {

    String fileName = "C:\\Users\\instal\\Desktop\\lineage\\csv.txt";
    String data = "";
    File file = new File(fileName);
    try {
        Scanner inputStream = new Scanner(file);
        while(inputStream.hasNext()){
            for (int i = 0; i < numberArray.length; i++) {
                data = inputStream.next();
                numberArray[i] = (data.split(","));
            }
        }
    } catch(FileNotFoundException e) {
        System.out.println(e);
    }




Random rand=new Random();

    for (int i = 0; i <arrayRand.length ; i++) {
      for (int k = 0; k <arrayRand[i].length ; k++) {
        random=rand.nextInt(15) +1;
        arrayRand[i][k]=random;


        finalArray[i][k]=Integer.parseInt(numberArray [i][k])  *arrayRand[i][k];
      }
  }
    System.out.println("Matica 1:" + Arrays.deepToString(numberArray));
    System.out.println("------------------------------");
    System.out.println("Matica 2:"+ Arrays.deepToString (arrayRand));
    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    System.out.println("Vysledna Matica:" +Arrays.deepToString(finalArray));



}
}
