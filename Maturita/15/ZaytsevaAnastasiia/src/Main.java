import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write a word: ");
        String word = in.nextLine();
        while (!word.matches("[a-zA-Z]+")) {
            System.out.println("Please enter a valid word!");
            word = in.nextLine();
        }
        System.out.print("Number of  vowels: " + count_Vowels(word) + "\n");
    }


    public static int count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
