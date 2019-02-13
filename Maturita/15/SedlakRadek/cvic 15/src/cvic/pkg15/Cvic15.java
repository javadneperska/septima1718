
package cvic.pkg15;

import java.util.Scanner;

public class Cvic15 {

   
    public static void main(String[] args) {
   

   Scanner sc=new Scanner (System.in);
            System.out.println("zadajte cislo");
            
            int n =sc.nextInt();
             if (!(n>= 100)) {
       
            }else{
                int max = Integer.MIN_VALUE;
                while (n > 0) {
                    int digit = n % 10;

                    max = Math.max(max, digit);
                    n/= 10;
                }
System.out.println("max : "+max);
}
    }}
    
