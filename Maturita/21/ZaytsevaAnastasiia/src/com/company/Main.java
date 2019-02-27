package com.company;

import java.io.*;

public class Main {
    private static final String DELIMITER = " ";

    public static void main(String[] args) throws IOException {


            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("input.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            String line;
            line = br.readLine();

            String []arr = line.split(" ");
        for (String s : arr) {
            bw.write(s);
            bw.newLine();

        }
        bw.close();

    }
}
