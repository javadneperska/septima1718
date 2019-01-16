
import java.util.Scanner;


public class NewMain {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,fact=1;
        int a =sc.nextInt();
         for(i=1;i<=a;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+i+" is: "+fact);   
    }
    
}
