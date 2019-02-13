package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int[] marks = new int[10];
    private static int counter = 0;

    public static void main(String[] args) {
        System.out.println("Input 10 marks from range 1 to 5 (put enter after each one) !");
        try {
            for (int i = 0; i < marks.length; i++) {
                int mark = sc.nextInt();
                if (mark > 5 || mark < 1) throw new Exception();
                marks[i] = mark;
            }
        } catch (Exception e) {
            System.err.println("Wrong or mismatched input !!");
            System.exit(-9);
        }

        for (int mark : marks) {
            if (mark < 5) counter++;
        }

        System.out.println("Number of marks better than worst one is :  " + counter);

    }
}
