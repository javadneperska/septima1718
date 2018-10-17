package sk.dneperska.septima1718.daniel.slanina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


class FileLoader {
    static void loadFromFile() {
        System.out.println("----------------------------------------------");
        System.out.println("Please write name of file (example: input.csv)");
        System.out.println("----------------------------------------------");
        String fileName = Main.sc.next();
        try {
            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\" + fileName));
            String savingPoint;
            String[] field = null;
            while ((savingPoint = br.readLine()) != null) {
                 field = savingPoint.split(",");
                for (String aField : field) {
                    Double numbersFromFile = Double.parseDouble(aField);
                    Main.sum += numbersFromFile;
                }
            }
            System.out.println("----------------------------------------------");
            System.out.println("Numbers in file: " +Arrays.toString(field));
            System.out.println("Sum of numbers from file is: " + Main.sum);
        } catch (Exception ex) {
            System.out.println("----------------------------------------------");
            System.out.println("File you entered does not exists !");
            Main.continueLoop();

        }
    }
}
