import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int length = word.length();
        if(length <= 4){

            System.out.println("The word is not long enough!");
        }
        else{
            System.out.println(word);
            String reverse = new StringBuffer(word).reverse().toString();
            System.out.println(reverse);
            System.out.println("Number of letters is:"+ length);
        }

    }
}
