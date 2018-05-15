/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Maroš
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    private static final String FILENAME_INPUT = "src\\input.txt";
    private static final String FILENAME_OUTPUT = "src\\output.txt";

    public static void main(String[] args) {

        BufferedReader br = null;
        FileReader fr = null;
        String out = "";
        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME_INPUT);
            br = new BufferedReader(fr);

            String sCurrentLine;
            String[] splited;
            double a = 0;
            double b = 0;
            double c = 0;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                splited = sCurrentLine.split(",");
                // System.out.println(splited[0]);

                try {
                    a = Double.parseDouble(splited[1]);
                    b = Double.parseDouble(splited[2]);
                    c = Double.parseDouble(splited[3]);
                } catch (Exception e) {

                }
                System.out.println(a);

                if ("square".equals(splited[0])) {
                    out += ("square Obvod: " + a * 4 + "\n");
                    out += ("square Obsah: " + a * a + "\n");
                }
                if ("rectangle".equals(splited[0])) {
                    out += ("rectangle Obvod: " + (2 * a + 2 * b) + "\n");
                    out += ("rectangle Obsah: " + (a * b) + "\n");
                }
                if ("circle".equals(splited[0])) {
                    out += ("circle Obvod: " + (2 * Math.PI * a) + "\n");
                    out += ("circle Obsah: " + (Math.PI * (a * a)) + "\n");
                }
                if ("triangle".equals(splited[0])) {
                    out += ("triangle Obvod: " + (a + b + c) + "\n");
                    double s = (a + b + c) / 2;
                    out += ("triangle Obsah: " + (Math.sqrt(s * (s - a) * (s - b) * (s - c))) + "\n");
                }

            }

            System.out.println(out);

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            fw = new FileWriter(FILENAME_OUTPUT);
            bw = new BufferedWriter(fw);
            bw.write(out);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

}
