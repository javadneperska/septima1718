package sk.dneperska.work;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    int y = load();
        output(y);
    }
    static int load(){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        try {
            x = sc.nextInt();
        }catch(Exception e){
            System.out.println("You can't use that character.");
            System.exit(0);
        }
        return x;
    }
    static void output(int amount){
        int[]love = new int[]{500,200,100,50,20,10,5,2,1};
        int num = amount;
        for (int i : love) {
            while(amount>=i){
                System.out.println(i+" ");
                amount-=i;
            }
        }
    }
}
