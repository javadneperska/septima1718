package sk.dneperska.septima1718;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int inputNumber;
    public static void main(String[] args) {
        ArrayList<Integer> generatedNumbers = getIntegers();
        inputNumber();
        outputCheck(generatedNumbers);

    }

    private static void inputNumber() {
        System.out.println("input (must be INT ! )");
        try {
            inputNumber = sc.nextInt();
        } catch (Exception e) {
            System.err.println("WRONG INPUT !!");
            System.exit(0);
        }
    }

    private static void outputCheck(ArrayList<Integer> generatedNumbers) {
        if (generatedNumbers.contains(inputNumber)) {
            System.out.println("Generated numbers -> " + Arrays.toString(generatedNumbers.toArray()));
            System.out.println("Number "+inputNumber + " is in the generated numbers !");
        } else {
            System.out.println("Generated numbers -> " +Arrays.toString(generatedNumbers.toArray()));
            System.out.println("Number "+inputNumber + " is NOT in the generated numbers !");
        }
    }

    private static ArrayList<Integer> getIntegers() {
        //random numbers are 0,1,2,3
        ArrayList<Integer> generatedNumbers = new ArrayList<>();
        Random randomGenerator = new Random();
        while (generatedNumbers.size() < 20) {

            int random = randomGenerator.nextInt(50);
            if (!generatedNumbers.contains(random)) {
                generatedNumbers.add(random);
            }
        }
        return generatedNumbers;
    }

}