package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Input (word without special char or numbers !)");
        String input;
        int l;
        int flag = 0;
        input = sc.nextLine();
        input = input.toLowerCase();
        input = input.replaceAll("\\s", "");
        char[] ch = input.toCharArray();
        l = input.length();
        for (int i = 0; i < l; i++) {
            if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
                continue;
            } else

                flag++;
            break;
        }
        if (flag != 0)
            throw new Exception("Wrong or mismatched input !");

        System.out.println("Your string contains " + countVowels(input) + " vowels.");
    }

    private static int countVowels(String str) {
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
