package sk.dneperska.objects;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Buffer {
    public String [][] readArray = new String[4][4];
    private String savingPoint;

    public void read() {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(sc.hasNextLine()) {
                for (int i = 0; i< readArray.length; i++) {
                    String[] line = sc.nextLine().trim().split(",");
                    for (int j=0; j<line.length; j++) {
                        readArray[i][j] = line[j];
                    }
                    for(int k = 0; k< readArray.length; k++){
                        for(int l = 0; l< readArray.length; l++){
                            if(readArray[k][l]== null){
                                readArray[k][l]="0";
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.deepToString(readArray));
    }


    public void write(int i ,double circuit, double capacity) throws IOException {
        PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("output.txt",true)));
        savingPoint = readArray[i][0];
        out.println(savingPoint+"," + circuit + "," + capacity);
        out.flush();
    }
}
