package sk.dneperska.work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double suma = sc.nextInt();
	    double urok = sc.nextInt();
	    int rocne = sc.nextInt();
	    for(int i = 0;i<rocne;i++){
	        suma = suma*((urok/100)+1);
	    }
		System.out.println(suma);
    }
}
