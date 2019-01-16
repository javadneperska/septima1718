import java.util.Scanner;
public class Delenie_Satmari {

    public static void main(String[] args) {

        System.out.println("Zadajte ľubovoľných 10 čísiel : ");
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10]; //Scanner na 10 čísiel

        System.out.println("Čísla delitelné 2 alebo 7 :");

        for (int i = 0; i < 10; i++) {
//cyklus pre scanner (načítaj 10 čísiel)
            x[i] = sc.nextInt();
        }

        for (int n : x) {
            if(n % 7 == 0 || n % 2 == 0){
                System.out.println(n);
                //podmienky
            }
        }
    }

}