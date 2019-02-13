package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int input;

    public static void main(String[] args) {
        System.out.println("Input at least 3-digit number !");
        try {
            input = sc.nextInt();
            int length = String.valueOf(input).length();
            if (length < 3) throw new Exception();

        } catch (Exception e) {
            System.err.println("Wrong or mismatched input ! ");
            System.exit(-3500);
        }
        int output = getResult(input);
        System.out.println("The biggest digit in your number is : " + output);
    }

    private static int getResult(int a) {
        int max = Integer.MIN_VALUE;
        while (input > 0) {
            int digit = input % 10;
            max = Math.max(max, digit);
            input /= 10;
        }
        return max;
    }
}
