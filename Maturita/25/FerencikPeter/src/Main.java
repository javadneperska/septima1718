import java.util.Scanner;

public class Main {
    final static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static int sum = 0;
    static double multiply = 1;

    public static void main(String[] args) {
        String word = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Napis slovo");

        if (sc.hasNextInt()) {
            System.out.println("Zly format");
        }
        else {
            word = sc.next();
            word = word.toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                System.out.println(word.charAt(i) + " - " + (alphabet.indexOf(word.charAt(i)) + 1));
                sum += (alphabet.indexOf(word.charAt(i)) + 1);
                multiply = multiply * (alphabet.indexOf(word.charAt(i)) + 1);
            }
            System.out.println("Sucet indexov je:" + sum);
            System.out.println("Sucin indexov je:" + multiply);
        }
    }
    }
