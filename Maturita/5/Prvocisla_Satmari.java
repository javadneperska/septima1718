import java.sql.SQLOutput;
import java.util.Scanner;

public class Prvocisla_Satmari
{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        boolean flag = false;
        for(int i = 2; i <= x/2; ++i)
        {

            if(x % i == 0)
            {
                flag = true;
                break;
            }
        }


        if (!flag)
            System.out.println(x + "je prvočíslo.");
        else
            System.out.println(x + "je zložeé číslo.");
    }
}
    