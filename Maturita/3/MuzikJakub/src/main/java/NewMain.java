
import java.util.Scanner;


public class NewMain {


    public static void main(String[] args) {
   int[] numbers= new int[10];
   Scanner sc=new Scanner(System.in);
    System.out.println("Zadaj 10 cisel  ");
        for (int i = 0; i < 10; i++) {
            numbers[i]= sc.nextInt();
            
        }
        for (int b : numbers) {
            if(b%2==0 || b%7==0) {
                System.out.println(b);
            }
            
        }
    
}
    }
    
    

