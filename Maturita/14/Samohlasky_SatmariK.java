import java.util.Scanner;

public class Samohlasky_SatmariK {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Napíšte text : ");
        String s = in.nextLine();

        System.out.print("Počet samohlások, vo vami zadanom texte : " + pocet_Samohlasok(s)+"\n");
    }


    public static int pocet_Samohlasok(String s) {

        int sucet = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (       s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                       || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i)=='ä'   //krátke

                       || s.charAt(i)=='á' || s.charAt(i)=='é' || s.charAt(i)=='í' || s.charAt(i)=='ó'
                       || s.charAt(i)== 'ú' //dlhé'
               )
            {
                sucet++;
            }
        }
        return sucet;
    }
}