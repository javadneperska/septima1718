import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int po = sc.nextInt();
        int od = sc.nextInt() - 1;
        sequence(po, od);
    }
    static void sequence(int po, int od){
        int a = 1;
        int b = 1;
        int c = 0;
        for(int i = 1; i<=po;i++) {
            c = a + b;
            if(od <= i){
                System.out.println(c);
            }
            a = b;
            b = c;
        }
    }
}
