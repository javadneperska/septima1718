
package muzikjakub;

import java.util.Scanner;


public class MuzikJakub {


    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte slovo");
        String str = sc.nextLine();

        System.out.print("Počet samohlások v slove: " + count_Vowels(str)+"\n");
    }
 public static int count_Vowels(String str)
    {
        int pocet = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'ä' 
                    || str.charAt(i) == 'y')
            {
                pocet++;
            }
        }
        return pocet;
    }
}

