import java.util.Scanner;

public class Main {
   static int [] numbers = new int[7];
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                numbers[i] = a;

            }
            else{

                System.out.println("Invalid choice");
                System.exit(1);

            }
        }
        System.out.println("Numbers");
        for (int a = 0; a < numbers.length; a++) {
            System.out.println(numbers[a]);
            numbers[a] -= 1;
        }
        System.out.println("Numbers minus 1");
        for (int b = 0; b < numbers.length; b++) {
            System.out.println(numbers[b]);
        }
    }
}
