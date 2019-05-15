import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    try {
            HashMap<String, Integer> studentGrades = new HashMap<String, Integer>();
            HashMap<String, Integer> studentPassed = new HashMap<String, Integer>();
            Scanner sc = new Scanner(System.in);
            boolean iffer = true;
            int grade = 0;
            String student = "";
            System.out.println("For exit input number 0");
            while (iffer == true) {
                student = sc.next();
                if(student.equals("0")){
                    iffer = false;
                }else {
                    try {
                        grade = sc.nextInt();
                    } catch (Exception e){
                        System.err.println("Can't input string to integer");
                        System.exit(1980);
                    }
                    if (grade < 0 || grade > 5) {
                        System.out.println("Grade can be only number from 1 to 5 (or number 0)");
                        System.exit(1980);
                    }
                    studentGrades.put(student, grade);
                    if (grade < 5) {
                        studentPassed.put(student, grade);
                    }
                }
            }
            System.out.println("Students who passed: " + studentPassed);
        }catch (Exception e){
            System.err.println(e);
        }

    }
}
/*
Error code 1980 = you f-ed up
 */
