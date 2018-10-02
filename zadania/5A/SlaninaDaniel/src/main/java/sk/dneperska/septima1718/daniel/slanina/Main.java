package sk.dneperska.septima1718.daniel.slanina;

import java.util.Scanner;

class Main {
        static final Scanner sc = new Scanner(System.in);
        static double sum;

    public static void main(String[] args){
        System.out.println("Welcome to fileReader Program !");
        menu();
    }

    static void continueLoop() {
        System.out.println("----------------------------------------------");
        System.out.println("Do you want to continue (Y/N) ?");
        String con = sc.next();
        if (con.equals("Y") || con.equals("y")){
            //RESETTING VARIABLE SUM
            sum = 0;
            menu();
        }
        else{
            System.out.println("Turning off, Thanks for using !");
            System.exit(0);
        }
    }

    private static void menu() {
        System.out.println("----------------------------------------------");
        System.out.println("Please, select your option: ");
        System.out.println("----------------------------------------------");
        System.out.println("1. Write numbers and sum them");
        System.out.println("2. Select numbers from file and sum them");
        System.out.println("Everything else. - Turn off the program");
        System.out.println("----------------------------------------------");
        String choice = sc.next();
       try {
           int choiceINT = Integer.parseInt(choice);

           switch (choiceINT) {
               case 1:
                   KeyboardLoader.loadFromKeyboard();
                   continueLoop();

               case 2:
                   FileLoader.loadFromFile();
                  continueLoop();


               default:
                   continueLoop();
           }
       }
       catch (Exception ex){
           continueLoop();

       }
    }

}
