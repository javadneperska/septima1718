import java.util.Scanner;

public class Obdobie_Satmari {
    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
int month = 0;
        String obdobie=null;
        System.out.println("Číslo mesiaca : ");
        //int month = input.nextInt();
        try{
            month = input.nextInt();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }

        switch (month) {

            case 12:obdobie = "";
                System.out.println(" December - Zima"); break;

            case 1: obdobie = "";
                System.out.println(" Január - Zima"); break;

            case 2: obdobie = "";
                System.out.println(" Februar - Zima"); break;

            case 3: obdobie = "";
                System.out.println(" Marec - Jar"); break;

            case 4: obdobie = "";
                System.out.println(" April- Jar"); break;

            case 5: obdobie = "";
                System.out.println(" Máj - Jar"); break;

            case 6: obdobie = "";
                System.out.println(" Jún - Leto"); break;

            case 7: obdobie = "";
                System.out.println(" Júl - Leto"); break;

            case 8: obdobie = "";
                System.out.println(" August - Leto"); break;

            case 9: obdobie = "";
                System.out.println(" September - Jeseň"); break;

            case 10: obdobie = "";
                System.out.println(" Október - Jeseň"); break;

            case 11: obdobie = "";
                System.out.println(" November - Jeseň"); break;


            default: System.out.println("Error: chybné číslo");}}}