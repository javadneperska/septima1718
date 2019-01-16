import java.util.Scanner;

public class Obdobie_Satmari {
    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        String season=null;
        System.out.println("Enter the name of a month");
        int month = input.nextInt();
        switch (month) {

            case 12: season = "";
                System.out.println(" December - Zima"); break;

            case 1: season = "";
            System.out.println(" Január - Zima"); break;

            case 2: season = "";
                System.out.println(" Februar - Zima"); break;

            case 3: season = "";
                System.out.println(" Marec - Jar"); break;

            case 4: season = "";
                System.out.println(" April- Jar"); break;

            case 5: season = "";
                System.out.println(" Máj - Jar"); break;

            case 6: season = "";
                System.out.println(" Jún - Leto"); break;

            case 7: season = "";
                System.out.println(" Júl - Leto"); break;

            case 8: season = "";
                System.out.println(" August - Leto"); break;

            case 9: season = "";
                System.out.println(" September - Jeseň"); break;

            case 10: season = "";
                System.out.println(" Október - Jeseň"); break;

            case 11: season = "";
                System.out.println(" November - Jeseň"); break;

            default: System.out.println("Error: chybné číslo");}}}