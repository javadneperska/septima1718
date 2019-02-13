import java.util.Scanner;

public class scitanie_cisiel_SatmariK
{
    public static void main(String[]args){

        int a, b, sucet = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Vložte ľubovolné číslo : ");
        a = s.nextInt();

        while(a > 0){
            b = a % 10;
            sucet = sucet + b;
            a = a / 10;
        }
        System.out.println("Súčet čísiel : "+sucet);
    }
}