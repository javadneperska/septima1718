
import java.util.Scanner;


public class NewMain {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
               int num =sc.nextInt();
        int divisor=0;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                divisor=i;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
         System.out.println(num + " is not a prime number. It's divisor is : "+divisor );
    }
}

