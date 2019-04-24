
package muzikjakub;

import java.util.Scanner;


public class MuzikJakub {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Zadaj slovo");
        String slovo=sc.nextLine();
        char[] ch  = slovo.toCharArray();
        int sucet= 0;
        int sucin= 1;
        
for(char c : ch)
{
int temp = (int)c;
int temp_integer = 96;
if(temp<=122 & temp>=97)
System.out.print(temp-temp_integer + " , ");



sucet+= temp-temp_integer;
sucin*= temp-temp_integer;
    

    }
System.out.println("\nsucet cisel je: "+ sucet);
    System.out.println("sucin cisel je: "+sucin);
    }
}
