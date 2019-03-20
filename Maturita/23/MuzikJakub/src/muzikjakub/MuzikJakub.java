
package muzikjakub;

import java.util.Scanner;


public class MuzikJakub {


    public static void main(String[] args) {
     
   String Predcislie = null;     
   String Cislo_uctu = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadajte kód banky:");
        int Kod_banky= sc.nextInt();
        System.out.println("Zadajte predčíslie:");
        Predcislie= sc.next();
        if(Predcislie.length() <= 5){
            Predcislie="000000";
            System.out.println("Neplatné prtečíslie, automaticky zadané: 000000");
        }
        System.out.println("Zadajte kód krajiny:");
        int Kod_krajiny= sc.nextInt();
        System.out.println("Zadajte číslo účtu:");
        Cislo_uctu = sc.next();
       if(Cislo_uctu.length() > 10){
           System.out.println("Chybné číslo účtu");
           System.exit(0);

        }
        if(Cislo_uctu.length() < 10){
            StringBuilder builder = new StringBuilder(Cislo_uctu);
            for (int i = Cislo_uctu.length(); i < 10; i++) {
               Cislo_uctu = "0"+Cislo_uctu;
            }

        }
        System.out.println(Cislo_uctu);
        String Bban = Kod_banky+Predcislie+Cislo_uctu+Kod_krajiny+"00";
        int Kontrolne_cislo = 98-(mod(Bban,97));
        String number = Integer.toString(Kontrolne_cislo);
        if(Kontrolne_cislo<10){
            number = "0"+number;
        }
        System.out.println(number);
        String IBAN = "SK"+number+Kod_banky+Predcislie+Cislo_uctu;
        System.out.println(IBAN);
    }
    static int mod(String num, int a)
    {


        int res = 0;


        for (int i = 0; i < num.length(); i++)
            res = (res * 10 + (int)num.charAt(i)
                    - '0') % a;

        return res;
    }
}
