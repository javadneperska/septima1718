import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        while (numbers.size() < 20) {

            int random = randomGenerator.nextInt(50);
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }
            Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int number = sc.nextInt();


                if (numbers.contains(number)) {
                    System.out.println("YES");


                } else {
                    System.out.println("NO");


            }
        }
        else{
                System.out.println("This is not a number");

            }

    }

    }

