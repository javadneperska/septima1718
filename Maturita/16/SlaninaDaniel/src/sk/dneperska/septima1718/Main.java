package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int input;

    public static void main(String[] args) {
        System.out.println("Input positive number !");
        try {
            input = sc.nextInt();
            if (input < 0) throw new Exception();

        } catch (Exception e) {
            System.err.println("Wrong or mismatched input ! ");
            System.exit(-404);
        }
        int output = getResult(input);
        System.out.println("Sum of digits in your number is : " + output);
    }

    private static int getResult(int a) {
        int result = 0;
        while (input > 0) {
            int digit = input % 10;
            input /= 10;
             result +=digit;
        }
        return result ;
    }
}