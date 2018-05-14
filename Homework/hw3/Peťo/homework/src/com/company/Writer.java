package com.company;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void writeFile(){
        Reader r = new Reader();
        Main m = new Main();
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new FileWriter("output.csv"));
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            for (String element : m.stvorec) {
                sb.append(element);
                sb.append(",");
            }
            br.write(sb.toString());
            br.newLine();
            for (String element2 : m.obdlznik) {
                sb2.append(element2);
                sb2.append(",");
            }
            br.write(sb2.toString());
            br.newLine();
            for (String element3 : m.trojuholnik) {
                sb3.append(element3);
                sb3.append(",");
            }
            br.write(sb3.toString());
            br.newLine();
            for (String element4 : m.kruznica) {
                sb4.append(element4);
                sb4.append(",");
            }
            br.write(sb4.toString());
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
