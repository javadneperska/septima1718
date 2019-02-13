
package muzikjakub;

import java.util.Scanner;



public class MuzikJakub {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Zadajte číslo");
int n =sc.nextInt();

if (!(n>= 100)) {
    System.out.println("Číslo je menšie ako 100");
    }else{
    int max = Integer.MIN_VALUE;

    while (n > 0) {
        int digit = n % 10;

        max = Math.max(max, digit);

        n /= 10;
    }


    System.out.println("Najväčšia cifra v čísle je : "+max);
}
}
    }
