package sk.dneperska.work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int [] x = new int [7];
	    for(int i=0;i<x.length;i++){
	        x[i] = safeInput();
	    }
	    for(int z=0;z<x.length;z++){
            System.out.print(x[z]);
        }
        System.out.println();
	    for(int j = 0; j<x.length;j++){
	        x[j] = x[j]-1;
            System.out.print(x[j]);
        }

    }
    public static int safeInput(){
        int output = 0;
        try {
            Scanner sc = new Scanner(System.in);
            output = sc.nextInt();
        }catch(Exception e){
            System.exit(0);
        }
        return output;
    }
}
