package sk.dneperska.work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input = 0;
	try{
	    input = sc.nextInt();
	    output(input);
    }catch(Exception e){
	    System.exit(0);
    }
    }
    static void output(int input){
        String check[] = Integer.toString(input).split("");
        if(check.length<3){
            System.out.println("Must be longer than 2");
            System.exit(0);
        }
        int control = 0;
        int control2 = 0;
        for(int x = 0;x<check.length;x++){
            control2 = Integer.parseInt(check[x]);
            if(control2 > control){
                control = control2;
            }
        }
        System.out.println(control);
    }
}
