
package muzikjakub;

import java.util.Scanner;


public class MuzikJakub {


    public static void main(String[] args) {
             Scanner scan = new Scanner(System.in); 
Scanner in = new Scanner(System.in);
        
       
        System.out.print("Zadajte teplotu v stupňoch Celzia: ");
        float C = in.nextFloat();
        
      
        float F = C * (9f / 5) + 32;
        
        System.out.println(C + " Stupňov Celzia vo Fahrenheitoch je  : " + F);
       
    }
}
