
package muzikjakub;

import java.util.Scanner;


public class MuzikJakub {


    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String[] words = s.split(" ");
        
        for(String string : words ){
            System.out.println(string);
        }
        
    }
    
}
