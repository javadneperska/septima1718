package sk.dneperska.septima1718.zaytseva.anastasiia;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Choose option: ");
        int num=sc.nextInt();


        switch (num){
            case 1:
                System.out.println("Input the numbers : ");
                Scanner input = new Scanner(System.in);
                Scanner in = new Scanner(System.in);
                do {
                    number = input.nextInt(); //this reads number from input and store its value in variable number
                    sum+= number; //here you add number to the total sum
                } while(number != 0); //just repeat cycle as long as number is not zero

                System.out.println("Sum is : " + sum);
               
                break;
            case 2:
                File f = new File("input.txt");
                BufferedReader bf = new BufferedReader(new FileReader(f));
                String s = "";
                while ((s=bf.readLine()) !=null){
                    String[] pole = s.split(",");
                    int[] summary = new int[pole.length];
                    for(int i =0; i<pole.length; i++){
                        summary[i]=Integer.parseInt(pole[i]);
                        sum= sum + summary[i];
                    }

                }
                System.out.println(sum);
                break;
                default:
        }
    }
}
