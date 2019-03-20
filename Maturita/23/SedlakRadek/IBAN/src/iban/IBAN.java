
package iban;

import java.math.BigInteger;
import java.util.Scanner;


public class IBAN {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x; 
        
        System.out.println("Zadajte prosim kod banky");
        String kod=sc.nextLine();
        
        
        System.out.println("Zadajte predcislie uctu,");
        String pred=sc.nextLine();
   
       
        
        System.out.println("Zadajte prosim cislo uctu");
       long čislo=sc.nextLong();
        
       
       String Bban = kod+pred+čislo+2820+"00";
        BigInteger bi1=new BigInteger (Bban);
       BigInteger bi2=new BigInteger ("97");
       BigInteger bi3;
       
       bi3=bi1.mod(bi2);
       
       
       int c;
       int a =98;
      c=a-bi3.intValue();
        
        System.out.println("SK"+ c + kod + pred + čislo);
    }
    
}
