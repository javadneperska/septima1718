package sk.dneperska.septima1718.daniel.slanina;

import java.util.Arrays;

class KeyboardLoader {

    static void loadFromKeyboard() {
        System.out.println("---------------------------------------------");
        System.out.println("You have selected 1. option -> Write numbers");
        System.out.println("Please, write some numbers you want to sum (example : 5,6.5,9...)");
        String inputNumbers = Main.sc.next();
        String[] numbersField = inputNumbers.split(",");
        for (String aNumbersField : numbersField) {
            try {
                Main.sum += Double.parseDouble(aNumbersField);
            } catch (Exception e) {
                System.out.println("Please, write only numbers !");
                Main.continueLoop();
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Numbers you've entered: " + Arrays.toString(numbersField));
        System.out.println("Sum of your inputted numbers is: " + Main.sum);
    }
}
