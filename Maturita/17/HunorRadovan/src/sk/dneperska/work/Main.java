package sk.dneperska.work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input = 0;
	try{
	    input=sc.nextInt();
    }catch(Exception e){
	    System.exit(0);
    }
	double output = (input*1.8)+32;
        System.out.println("F: "+output);
    }
}
