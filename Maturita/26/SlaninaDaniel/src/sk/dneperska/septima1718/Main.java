package sk.dneperska.septima1718;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, Integer> marks = new HashMap<>();

    public static void main(String[] args) {

        menu();
    }
    private static void menu() {
        System.out.println("------------------------------------------------");
        System.out.println("Choose your action : ");
        System.out.println("1.) Add student and mark");
        System.out.println("0.) Print students");
        try {
            int menu = sc.nextInt();
            if (menu == 1) {
                inputData(marks);
            } else if (menu == 0) {
                printData(marks);
            } else {
                System.err.println("Option does not exist !");
                System.exit(301);
            }
        } catch (Exception ex) {
            System.err.println("Wrong input !!");
            System.exit(300);
        }
    }

    private static void inputData(HashMap<String, Integer> marks) {
        System.out.println("Write Name of the student !");
        String name = sc.next();
        System.out.println("Write Mark of the student ! ( from range 1-5 !)");
        int mark = sc.nextInt();
        if (mark < 1 || mark > 5) {
            System.err.println("Mark is not from range 1-5 !");
            System.exit(250);
        }
        marks.put(name, mark);
        menu();
    }

    private static void printData(HashMap<String, Integer> marks) {
        for (String i : marks.keySet()) {
            boolean passed = marks.get(i) < 5;
            System.out.println(" Name : " + i + " Mark: " + marks.get(i) + " Passed: " + passed);
        }
    }
}
