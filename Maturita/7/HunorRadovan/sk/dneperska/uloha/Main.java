package sk.dneperska.uloha;
import java.util.Scanner;

public class Main {
    public static String word = "";

    public static void main(String[] args) {
        System.out.println(askWord());
        System.out.println(reverseWord(word));
        System.out.println(word.length());
    }
    public static String askWord(){
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        if(word.length() < 5){
            System.out.println("The word must be longer than 4");
            askWord();
        }
        return word;
    }
    public static String reverseWord(String word){
        String reverse = "";
        for(int x = word.length(); x<0;x--){

            reverse = reverse + word.charAt(x);
        }
        return reverse;
    }
}
