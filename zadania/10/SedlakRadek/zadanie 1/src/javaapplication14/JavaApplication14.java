
package javaapplication14;

import java.util.Scanner;


public class JavaApplication14 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Prosim, zadajte cisla A a B");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c;
         int d;
         int e;
         int f;
         
         c=a+b;
         d=a-b;
         e=a/b;
         f=a*b;
         
         System.out.println("scitanie"+"       "+c );
        System.out.println("odcitanie"+"       "+d );
        System.out.println("delenie"+"       "+e );
        System.out.println("nasobenie"+"       "+f );
        
        
        
    }
    
}
