package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int addition = 0;
    private static long multiplication = 1;

    public static void main(String[] args) {
        System.out.println("Input string");
        String input = sc.nextLine();
        input = input.toLowerCase().replaceAll("\\s+","");
        char[] ch = input.toCharArray();
        int[] intValuesOfChar = new int[ch.length];
        int i = 0;
        System.out.println("Integer value of chars in your string :");
        for (char c : ch) {
            int temp = (int) c;
            int temp_integer = 96; //for lower case
            if (temp <= 122 & temp >= 97) {
                System.out.print(" " + (temp - temp_integer));
                intValuesOfChar[i] = temp - temp_integer;
                i++;
            }
        }
        for (int number : intValuesOfChar) {
            addition += number;
            multiplication *= number;
        }

        System.out.println("\nValue of addition : " +addition);
        System.out.println("Value of multiplication : " +multiplication);

    }
}
