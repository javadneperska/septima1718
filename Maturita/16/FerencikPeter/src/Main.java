import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            int sum = 0;
            if (num > 0) {
                while (num > 0) {
                    sum = sum + num % 10;
                    num = num / 10;
                }
                System.out.println(sum);
            } else {
                System.out.println("Wrong Input!!");

            }
        }
    }
}
