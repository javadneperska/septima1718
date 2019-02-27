package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input any string ! ");
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        for (String part: parts) {
            System.out.println(part);
        }

    }
}
