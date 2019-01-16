package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("zadaj cislo od ktoreho zacat");
            int x=sc.nextInt();
            System.out.println("zadal cislo do ktoreho ma skoncit");
            int limit = sc.nextInt();

            System.out.println("Parne cisla z intervalu " + limit);

            for(int i=x; i <= limit; i++){


                if( i % 2 == 0){
                    System.out.print(i + " ");

        }
    }
}
}


