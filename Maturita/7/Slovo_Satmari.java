import java.util.Scanner;
//Satmari K.
class Slovo_Satmari{

    public static String reverse(String str) {
        if ((str.length() <= 1)) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);

    }

    public static void main(String args[]) {

        System.out.println("Napíšte ľubovoľné slovo : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();


        if (input == null) {
            System.out.println("Napíšte slovo(string) : \n");
        } else {
            System.out.println("Slovo odzadu : \n" + reverse(input));

            System.out.println("Počet znakov vo vami napísanom slove : "+input.length());

        }

    }}