package sk.dneperska.septima1718;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int[] numberArray = new int[7];
    public static void main(String[] args) {
        inputMethod();
        System.out.println("input numbers -> " + Arrays.toString(numberArray));
        arrayChangeMethod();
        System.out.println("Numbers after change -> " + Arrays.toString(numberArray));

    }

    private static void arrayChangeMethod() {
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (numberArray[i] -1);
        }
    }

    private static void inputMethod() {
        System.out.println("Input -> 7 numbers, put enter after each !");
        for (int i = 0; i < 7; i++) {
            try {
               int  inputNumber = sc.nextInt();
                numberArray[i] = inputNumber;
            } catch (Exception e) {
                System.err.println("WRONG INPUT !!");
                System.err.println("Next time follow the instructions !");
                System.exit(-1);
            }
        }
    }
}
