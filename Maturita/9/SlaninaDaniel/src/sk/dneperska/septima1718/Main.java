package sk.dneperska.septima1718;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String[][] array;

    public static void main(String[] args) {
        System.out.println("Input of your base");
        try {
            int inputNumber = sc.nextInt();
            array = new String[inputNumber][inputNumber];
        } catch (Exception e) {
            System.err.println("WRONG INPUT !!");
            System.exit(-1);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ( j==0){
                    array[i][j] = "*";
                }
                else if (i ==(array.length -1)){
                    array[i][j] =  "*";
                }

                else if (i== j){
                    array[i][j] = "*";
                }

                else{
                    array[i][j] = " ";
                }
            }
        }

        for (String[] anArray : array) {
            String output = Arrays.toString(anArray);
            output = output.replace(","," ");
            output = output.replace("["," ");
            output = output.replace("]"," ");
            System.out.println(output);
        }
    }
}
