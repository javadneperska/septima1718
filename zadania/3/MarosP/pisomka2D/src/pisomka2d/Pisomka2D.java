/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pisomka2d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author client
 */
public class Pisomka2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[][] matica1 = new int[3][3];
      int[][] maticaUserInput = new int[3][3];
      int[][] maticaVysledok = new int[3][3];
      
        Scanner input = new Scanner(System.in);
        
        // vytvaranie matice zadanej uzivatelom
        for (int i = 0; i < matica1.length; i++) {
            for (int j = 0; j < matica1[i].length; j++) {
                System.out.print("maticaUserInput["+i+"]["+j+"] = ");
                maticaUserInput[i][j] = input.nextInt();
            }
        }
        
        // vytvaranie matice zadanej z csv suboru
        String fileName = "src/nums.csv";
        String data = "";
        File file = new File(fileName);
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext()){
                for (int i = 0; i < matica1.length; i++) {
                    data = inputStream.next();
                    matica1[i] = StringArrToIntArr(data.split(","));
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
        
        // nasobenie matic
        for (int i = 0; i < maticaVysledok.length; i++) {
            for (int j = 0; j < maticaVysledok[i].length; j++) {
                maticaVysledok[i][j] = maticaUserInput[i][j] * matica1[i][j];
            }
        }
        
        // vypis
        System.out.println("matica1");
        print2DArray(matica1);
        
        System.out.println("maticaUserInput");
        print2DArray(maticaUserInput);
        
        System.out.println("maticaVysledok");
        print2DArray(maticaVysledok);
        
        
    }
    
    // parse from String[] to int[]
    public static int[] StringArrToIntArr(String[] s) {
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = Integer.parseInt(s[i]);
        }
        return result;
    }
    
    // prints 2D array
    public static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+",");
            }
            System.out.println("");
        }
    }
    
}
