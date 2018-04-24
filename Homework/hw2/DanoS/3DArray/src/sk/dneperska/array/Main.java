package sk.dneperska.array;

import java.util.Arrays;
import java.util.Random;

public class Main {


    private static int [][][] numberArray = new int[3][3][3];
    protected static int sum = 0 ;
    protected static long multiplication = 1 ;
    private  static Random rn = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length ; j++) {
                for (int k = 0; k < numberArray[i][j].length; k++) {
                    int rnd= rn.nextInt(15) + 1;
                    numberArray[i][j][k]= rnd ;
                    sum += numberArray[i][j][k];
                    multiplication *= numberArray[i][j][k];
                }

            }
        }


        System.out.println("Random numbers generated : " +Arrays.deepToString(numberArray));
        System.out.println("Summary : " +sum);
        System.out.println("Multiplication : " + multiplication);
    }
}
