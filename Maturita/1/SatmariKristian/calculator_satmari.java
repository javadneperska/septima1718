import java.util.Scanner;
public class calculator_satmari {


    public static void main(String[] args) {


        System.out.println(" Vítajte v kalkulačke :) \n");
        Scanner Scan = new Scanner(System.in);


        System.out.println("\n Prosím zadajte 2 ľubovolné čísla!");
        int x;
        int y;

        System.out.print("\n Prvé číslo: ");
        x = Scan.nextInt();

        System.out.print("\n Druhé číslo: ");
        y = Scan.nextInt();


        System.out.println("(Sčítanie) :  Výsledok = " + (x + y));
        System.out.println("(Odčítanie) : Výsledok = " + (x - y));
        System.out.println("(Súčin) :     Výsledok = " + (x * y));
        System.out.println("(Podiel) :    Výsledok = " + (x / y));
    }}
