import java.util.Scanner;

public class Main
{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number:");
        int a = sc.nextInt();
        int t1 = fib(a);
        int t2 = fib(a)+fib(a-1);
        int n = 10;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
