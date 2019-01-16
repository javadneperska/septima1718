
package javaapplication18;

import java.util.Scanner;


public class JavaApplication18 {

    
    public static void main(String[] args) {
      int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("zadaj cislo ");

        a =s.nextInt();

        b=1;

        c=0;

        while(b<= a)

        {

            if((a%b)==0)

                c=c+1;

            b++;

        }

        if(c==2)

            System.out.println(a +" toto cislo je prvocislo");

        else

            System.out.println(a +" toto cislo nie je prvocislo");
    }
    
}
