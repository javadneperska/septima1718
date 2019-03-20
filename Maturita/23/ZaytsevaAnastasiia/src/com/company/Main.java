package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String kodKrajny = "2820";

       Scanner sc = new Scanner(System.in);

        System.out.println("Bank (4 digit number): ");
        String kodBanky = sc.nextLine();
        if(!(kodBanky.length()==4))
        {
            System.out.println("Sorry, you entered the wrong ammount of digits");
            System.exit(404);
        }
        System.out.println("Account (10 digit number): ");
        String kodUctu = sc.nextLine();
        if(!(kodUctu.length()==10))
        {
            System.out.println("Sorry, you entered the wrong ammount of digits");
            System.exit(404);
        }

        String bban=kodBanky+"000000"+kodUctu+kodKrajny+"00";
        System.out.println(bban);
        int cislo = 98-(mod(bban,97));
        String number = Integer.toString(cislo);
        if(cislo<10){
            number = "0"+number;
        }
        String iban = "SK"+cislo+kodBanky+"000000"+kodUctu;
        System.out.println(iban);



    }
    static int mod(String num, int a)
    {


        int res = 0;

        // One by one process all digits of 'num'
        for (int i = 0; i < num.length(); i++)
            res = (res * 10 + (int)num.charAt(i)
                    - '0') % a;

        return res;
    }
}
