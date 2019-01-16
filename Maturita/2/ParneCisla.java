import java.sql.SQLOutput;
import java.util.Scanner;

public class ParneCisla
{

    public static void main(String[] args) {
System.out.println("Výtajte vo vypisovači párnych čísiel");

Scanner sc = new Scanner(System.in);
System.out.println("Prosím zadajte 2 ľubovoľné čísla :");

        System.out.println("Prvé číslo : ");
        int x = sc.nextInt();

        System.out.println("Druhé číslo : ");
        int y = sc.nextInt();

        System.out.println("Párne čísla medzi Vami zvolenými číslami :" + x + " a " + y +" sú : ");
        for (int a = x; a <= y; a++) {

              if(a%2==0){

                System.out.println(a);
            }
        }
    }

}
