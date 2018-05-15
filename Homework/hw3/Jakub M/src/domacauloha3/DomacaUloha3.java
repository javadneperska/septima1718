package domacauloha3;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.IOException;


public class DomacaUloha3 {

   private static final String FILENAME_OUTPUT = "src\\output.txt";
   private static final String FILENAME_INPUT = "src\\input.txt";
 

    public static void main(String[] args) {

        BufferedReader buffRead = null;
        FileReader fileRead = null;
        String zápis = "";
        try {


            fileRead = new FileReader(FILENAME_INPUT);
            buffRead = new BufferedReader(fileRead);

            String sCurrentLine;
            String[] splited;
            double a = 0;
            double b = 0;
            double c = 0;

            while ((sCurrentLine = buffRead.readLine()) != null) {
                System.out.println(sCurrentLine);
                splited = sCurrentLine.split(",");

                try {
                    a = Double.parseDouble(splited[1]);
                    b = Double.parseDouble(splited[2]);
                    c = Double.parseDouble(splited[3]);
                } catch (Exception e) {

                }
                System.out.println(a);

                if ("stvorec".equals(splited[0])) {
                    zápis += ("Obvod štvorca " + a * 4 + "\n");
                    zápis += ("Obsah štvorca: " + a * a + "\n");
                }
                if ("obdlznik".equals(splited[0])) {
                    zápis += ("Obvod obdĺžnika: " + (2 * a + 2 * b) + "\n");
                    zápis += ("Obsah obdĺžnika: " + (a * b) + "\n");
                }
                if ("kruh".equals(splited[0])) {
                    zápis += ("Obvod kruhu: " + (2 * Math.PI * a) + "\n");
                    zápis += ("Obsah kruhu: " + (Math.PI * (a * a)) + "\n");
                }
                if ("trojuholnik".equals(splited[0])) {
                    zápis += ("Obvod trojuholníka: " + (a + b + c) + "\n");
                    double s = (a + b + c) / 2;
                    zápis += ("Obsah trojuholníka: " + (Math.sqrt(s * (s - a) * (s - b) * (s - c))) + "\n");
                }

            }

            System.out.println(zápis);

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (buffRead != null) {
                    buffRead.close();
                }

                if (fileRead != null) {
                    fileRead.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

        BufferedWriter buffWriter = null;
        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(FILENAME_OUTPUT);
            buffWriter = new BufferedWriter(fileWriter);
            buffWriter.write(zápis);

            System.out.println("Wau, ono to ide? O_O");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (buffWriter != null) {
                    buffWriter.close();
                }

                if (fileWriter != null) {
                    fileWriter.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

}