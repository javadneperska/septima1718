import java.util.Scanner;
public class Factorial_Satmari {


    public static void main(String[] args) {
        int num;
        int faktorial=1;

        Scanner input = new Scanner(System.in);
        System.out.println("Zadajte číslo pre faktorial : ");

        num = input.nextInt();

        for (int i=2;i<=num; i++){
            faktorial=faktorial*i;
        }

        System.out.println("Faktorial čísla " +num+ " = " +faktorial);
    }}