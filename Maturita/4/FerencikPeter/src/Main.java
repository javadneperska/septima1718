import java.util.Scanner;

public class Main {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

        System.out.println(factorial(a));
    }
    public static int factorial(int a ){
       if (a <= 1){
           return 1;
       }
    else{
           return a*factorial(a-1);

       }
    }

}
