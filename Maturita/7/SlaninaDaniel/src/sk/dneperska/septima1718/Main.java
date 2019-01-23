package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Input (String with at least 5 chars)");
        String input = sc.nextLine();
        int count = input.length();
        if (count < 5) throw new Exception("Wrong input !");
        System.out.println("Your string is : " +input);
        System.out.println("Your string backward is : " +new StringBuilder(input).reverse().toString());
        System.out.println("Chars in your string : " +count);

    }
}
