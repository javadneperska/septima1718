package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int x, y, z;
    private static StringBuilder output = new StringBuilder();
    private static int counter;

    public static void main(String[] args) {

        try {
            System.out.println(" Input number X  : ");
            x = sc.nextInt();

            System.out.println(" Input number Y  : ");
            y = sc.nextInt();

        } catch (Exception e) {
            System.err.println("Wrong input ! ");
            System.exit(1);
        }

        try {
            System.out.println("Input number Z ( POSITIVE INTEGER ! ) ");
            z = sc.nextInt();
        } catch (Exception ex) {
            System.err.println("Wrong input ! ");
            System.exit(2);
        }

        int[] array;
        if (x <= y) {
            for (int i = x; i <= y; i++) {
                if (i % z == 0) {
                    counter++;
                }
            }
            array = new int[counter];
            int a = 0;
            for (int i = x; i <= y; i++) {
                if (i % z == 0) {
                    array[a] = i;
                    a++;
                }
            }
        } else {
            for (int i = y; i <= x; i++) {
                if (i % z == 0) {
                    counter++;
                }
            }
            array = new int[counter];
            int a = 0;
            for (int i = y; i <= x; i++) {
                if (i % z == 0) {
                    array[a] = i;
                    a++;
                }
            }
        }

        for (int number : array) {
            if (number >= 0) {
                int factorial = factorial(number);
                int primeNumber = isPrimeNumber(factorial);
                if (primeNumber > 0) output.append(", ").append(primeNumber);

            }
        }

        output.deleteCharAt(0);
        System.out.println("Numbers giving integer after division ( in factorial value) : " + output);

    }

    private static int isPrimeNumber(int PrimeNumber) {
        int i = 2;
        while (i <= PrimeNumber / 2) {
            // condition for nonprime number
            if (PrimeNumber % i == 0) {
                return 0;
            }

            ++i;
        }
        return PrimeNumber;
    }

    private static int factorial(int number) {
        if (number == 0) return 1;
        else {
            return number * factorial(number - 1);
        }
    }


}
