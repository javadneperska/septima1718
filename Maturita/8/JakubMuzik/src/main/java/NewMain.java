import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;




public class NewMain {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int ran;
        int vsetko=0;
        ArrayList<Integer> nums = new ArrayList<Integer>(20);
        while(vsetko< 20){
            vsetko++;
            ran = r.nextInt(1000)+1;
                while(nums.indexOf(ran)!=(-1)){
                    ran = r.nextInt(1000)+1;
                }
            nums.add(ran);
        }

        System.out.println("Pick a number");
        try {
            int a = sc.nextInt();
            if(nums.indexOf(a)!=(-1)){
                System.out.println("A number is in Array, good job");
            }else{
                System.out.println("The number is not in Array :( ");
            }
        } catch (Exception e) {
            System.out.println("You didn't pick a number");
        }
        
        System.out.println("Generated numbers are: ");
        Collections.sort(nums);
        for (Object num : nums) {
            System.out.print(num+" ");
        }
        
        
        
        
        
    }
    
}
