
package cvic.pkg16;

import java.util.Scanner;

public class Cvic16 {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
                int x;
                int a=0;
                x = in.nextInt();

                    int sum = 0;
                    while (x != 0) {
                        a=x%10;
                        x=x/10;
                        sum=sum+a;
                    }
System.out.println("cislovy sucet: " + sum);
    } }
    


