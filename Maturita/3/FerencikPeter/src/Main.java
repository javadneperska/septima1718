import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

static int [] numbers = new int[9];
 public static void main(String args[]){
     Scanner sc = new Scanner (System.in);
     for (int a = 0; a < numbers.length; a++) {
         System.out.println("Zadajte cislo:");
         numbers[a] = sc.nextInt();
     }
     for (int i = 0; i < numbers.length; i++) {
         if((numbers[i] % 2)== 0 || (numbers[i] % 7)== 0 ){
             System.out.println(numbers[i]);

         }
         else{
             System.out.println("Nie je delitelne 2 ani 7");

         }
     }


 }
}

