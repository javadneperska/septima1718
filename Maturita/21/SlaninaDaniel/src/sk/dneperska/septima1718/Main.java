package sk.dneperska.septima1718;

import java.io.*;

public class Main {
    private static String[] words;

    public static void main(String[] args) {
        readFile();
        for (String word : words) {
            System.out.println(word);
            writeToFile(word);
        }

    }

    private static void writeToFile(String input) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt", true));
            bw.newLine();
            bw.write(input);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.err.println("Error ! ");
            System.exit(404);
        }
    }

    private static void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String savingPoint = br.readLine();
            words = savingPoint.split(" ");
            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
            bw.write(savingPoint);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.err.println("Error ! ");
            System.exit(404);
        }
    }


}
