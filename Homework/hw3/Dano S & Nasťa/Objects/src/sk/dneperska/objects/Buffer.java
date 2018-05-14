package sk.dneperska.objects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Buffer {
    public String [][] readArray = new String[4][4];
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.deepToString(readArray));
    }
}
