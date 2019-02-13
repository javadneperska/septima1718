package sk.dneperska.work;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input = 0;
	try {
        input = sc.nextInt();
        output(input);
    }catch(Exception e){System.exit(0); }
    }
    static void output(int input){
        if(input <0){ System.exit(0); }
        int control = 0;
        String check[] = Integer.toString(input).split("");
        for(int x = 0;x<check.length;x++){
            control = control + Integer.parseInt(check[x]); }
        System.out.println(control);
    }
}
