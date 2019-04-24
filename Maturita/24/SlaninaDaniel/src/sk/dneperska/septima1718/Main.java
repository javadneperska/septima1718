package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int x, y, z;
    private static StringBuilder output = new StringBuilder();

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
        if (x <= y) {
            for (int i = x; i <= y; i++) {
                if (i % z == 0) {
                    output.append(",").append(i);
                }
            }
        }
        else {
            for (int i = y; i <= x; i++) {
                if (i % z == 0) {
                    output.append(",").append(i);
                }
            }
        }

        output.deleteCharAt(0);
        System.out.println("Numbers giving integer after division: " +output);

    }


}
