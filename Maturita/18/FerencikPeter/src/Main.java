import java.util.Scanner;

public class Main {
    static int sum;
    static int numbers [] = new int[10];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = sc.nextInt();
            if (1<=numbers[i] && numbers[i]<=5){
                System.out.println("ok");
            }
            else{
                System.exit(2);
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            if(numbers[j]< 5){

                sum += 1;
            }
        }
        System.out.println("Number :" + sum);
    }
}
