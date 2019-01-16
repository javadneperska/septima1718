import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
        int a = sc.nextInt();

        if (1>a || a>12){
            System.out.println("You are not within range");
            System.exit(1);
        }
        else{
            if(6<=a && a<=8){
                System.out.println("This is summer month");

            }
            if(9<=a && a<=11){
                System.out.println("This is autumn month");

            }
            if(a==12){
                System.out.println("This is winter month");

            }
            else if(a<= 2){
                System.out.println("This is winter month");
            }

            if(3<=a && a<=5){
                System.out.println("This is spring month");

            }

        }
    }
    else{
            System.out.println("This is not valid data type");

        }
    }

}
