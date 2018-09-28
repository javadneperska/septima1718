package sk.dneperska.septima1718.radovan.hunor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        beginProgram();
    }
    static void loadFromKeyboard(){
        int numOfNums = 0;
        int nums = 0;
        int input = 0;
        System.out.println("Type number of numbers to input:");
        numOfNums = chooser();
        System.out.println("You can input your numbers:");
        for(int x = 1; x<=numOfNums;x++){
            input = chooser();
            nums = nums + input;
        }
        System.out.println("Sum of these numbers is: " + nums);
        System.exit(0);
    }
    static void loadFromFile(){
        File file = new File(System.getProperty("user.home") + "//input.txt");
        try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String nums[] = br.readLine().split(",");
        int sum = 0;
        int plus = 0;
        for(int x = 0;x<nums.length;x++){
            plus = Integer.parseInt(nums[x]);
            sum = sum + plus;
        }
        System.out.println("Sum of these numbers is: " + sum);
        System.exit(0);
        }catch(Exception e){System.out.println(e);}
    }
    static int chooser(){
        Scanner sc = new Scanner(System.in);
        int output = 0;
        if(sc.hasNextInt()){
            output = sc.nextInt();
        }else{
            System.out.println("Only numbers can be typed! RESTARTING PROGRAM!");
            beginProgram();
        }
        return output;
    }
    static void beginProgram(){
        System.out.println("1= Keyboard, 2= File");
        int chosen = chooser();
        while(chosen < 1 || chosen > 2){
            System.out.println("You can only chose 1 or 2");
            chosen = chooser();
        }
        switch(chosen){
            case 1:
                loadFromKeyboard();
                break;
            case 2:
                loadFromFile();
                break;
        }
    }
}
