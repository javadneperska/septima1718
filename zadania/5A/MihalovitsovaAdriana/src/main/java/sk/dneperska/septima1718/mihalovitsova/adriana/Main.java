package sk.dneperska.septima1718.mihalovitsova.adriana;
import java.io.*;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);

        System.out.println("1/ Choose your numbers to sum up");
        System.out.println("2/ Find file with numbers to sum up in the directory");

        int userChoice = input.nextInt();


        if(userChoice == 1){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your numbers:");
            String line = sc.nextLine();
            String[] inputNumber =  line.split(",");
            int num []= new int[100];
            for(int i=0; i<inputNumber.length;i++){
                num[i]=Integer.parseInt(inputNumber[i]);
            }
            int sum = 0;
            for(int i : num) {
                sum += i;
            }
            System.out.println("The sum of your numbers is " + sum);
        }

        if(userChoice == 2){
            try {
                String filename = null;
                System.out.println("Enter the filename:");
                Scanner sc = new Scanner(System.in);
                filename = sc.nextLine();
                File f = new File(System.getProperty("user.home")+"//"+filename);
                BufferedReader b = new BufferedReader(new FileReader(System.getProperty("user.home")+"//"+filename));
                int sum1 = 0;
                String line = b.readLine();
                String[] inputNumber =  line.split(",");
                int num []= new int[100];
                for(int i=0; i<inputNumber.length;i++){
                    num[i]=Integer.parseInt(inputNumber[i]);
                }
                for(int i : num) {
                    sum1 += i;
                }
                System.out.println("The sum of the numbers is " + sum1);


        } catch (IOException e) {
                e.printStackTrace();
            }



        }

        if(userChoice >= 3){
            System.out.println("Invalid");

        }
}

}

