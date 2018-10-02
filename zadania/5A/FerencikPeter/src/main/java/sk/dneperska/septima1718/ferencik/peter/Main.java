package sk.dneperska.septima1718.ferencik.peter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static double []numberArray;
    static double sum = 0;
   static boolean cont = true;
    public static void main(String [] args){
        while (cont = true) {
            decide();

            System.out.println("Do you want to continue?(y/n)");
            Scanner sc = new Scanner(System.in);
            String d = sc.next();
            if (d.equals("y")) {

            } else {
                System.out.println("Thanks for using our program!");
                System.exit(1);
            }
        }

    }

    public static void decide(){


            System.out.println("1-sum numbers from user ");
            System.out.println("2-sum numbers from file ");
            System.out.println("Anything else - exit program ");
            int decision = 0;
            Scanner s = new Scanner(System.in);
            decision = s.nextInt();
            switch (decision) {
                case 1:
                    keyboardLoader();

                    break;
                case 2:
                    fileLoader();
                    break;
                default:
                    System.out.printf("Thanks for using");
                    System.exit(0);

                    break;
            }

    }

    private static void fileLoader() {
        System.out.println("Please write name of file(example input.csv)");
        Scanner sc=new Scanner(System.in);
        String filename= sc.next();
        try {
            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home")+"//"+filename));
            String savingPoint= null;
            int j =0;
            try{
            while((savingPoint=br.readLine()) !=null) {
                String[] field = savingPoint.split(",");
                for (int i = 0; i < field.length; i++) {
                    try {
                        sum += Double.parseDouble(field[i]);
                    }
                    catch(Exception e){
                        System.out.println("Write only numbers!");
                        System.exit(1);

                    }
                }
                System.out.println("Sum of these numbers is:"+sum);
                sum = 0;
            }

            }
            catch(IOException e){
                System.out.println("PROBLEM!");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!!");
        }
    }

    private static void keyboardLoader() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write numbers which you want to sum (example:5,6.8,7...):");
        String input = sc.next();
        String field[]= input.trim().split(",");
        for (int i = 0; i < field.length; i++) {
            try {
                sum += Double.parseDouble(field[i]);
            }
            catch(Exception e){
                System.out.println("Write only numbers!");
                System.exit(1);

            }
        }
        System.out.println("Sum of numbers is: "+sum);
        sum = 0;
    }
}
