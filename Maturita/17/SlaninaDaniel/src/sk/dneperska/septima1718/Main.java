package sk.dneperska.septima1718;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    private static Scanner sc = new Scanner(in);
    private static int input;

    public static void main(String[] args) {
        out.println("Input temperature in Celsius degrees ");
        try {
            input = sc.nextInt();
        } catch (Exception e) {
            err.println("Wrong or mismatched input ! ");
            exit(-404);

        }

        out.println("Your temperature in Celsius (" + input + ") is converted to "
                + convertToFahrenheit(input) + " Fahrenheit");

    }

    private static double convertToFahrenheit(int a) {
        double celsius = (double) a;
        return (9 / 5) * celsius + 32;
    }
}
