package sk.dneperska.work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        if(!sc.hasNext("^[A-Za-z]+$")) {
            System.out.println("Chyba!");
            System.exit(0);
        }
        String input = sc.nextLine();
        String []check = input.split("(?!^)");
        String []spol = {"a","e","i","o","u","ä","ô"};
        int count = 0;
        for(int i = 0;i<check.length;i++){
            for(int j=0;j<spol.length;j++){
                if(check[i] == spol[j]){
                    count++;
                }
            }
        }
        System.out.println("Našlo sa :" + count + " Spoluhlások");
        }
    }

