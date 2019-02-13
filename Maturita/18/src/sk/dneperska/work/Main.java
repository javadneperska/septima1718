package sk.dneperska.work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int cislo = 0;
	    int count = 0;
	    try{
	    for(int i = 0; i<10;i++){
	        cislo = sc.nextInt();
	        if(cislo >5 || cislo<1){
				System.out.println("Error");
				System.exit(0);
			}else{
	        	if(cislo < 5){
	            	count++;
            	}
	        }
        }}catch(Exception e){
	    	System.exit(0);
		}
		System.out.println(count);
    }
}
