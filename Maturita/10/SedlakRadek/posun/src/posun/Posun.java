
package posun;

import java.util.ArrayList;
import java.util.Scanner;


public class Posun {

   
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Zadajte 7 cisel ");

      try {
            for (int i = 0; i < 7; i++) {
                    list.add(in.nextInt());

            } 
            }

        catch (Exception e) {
            System.out.println("zle cislo");
        } 


        System.out.println("vase cislo su zmenšené o 1 ");
      
        for (Integer integer : list) { 
            System.out.print(integer-1+" ");
} 
    }
    
}
