package sk.dneperska.objects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Buffer {
    public String [][] myArray = new String[4][4];
    public void read() {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(System.getProperty("user.home") +"\\Documents\\GitHub\\septima1718\\Homework\\hw3\\Dano S & Nasťa\\Objects\\input.txt")));
            while(sc.hasNextLine()) {
                for (int i=0; i<myArray.length; i++) {
                    String[] line = sc.nextLine().trim().split(",");
                    for (int j=0; j<line.length; j++) {
                        myArray[i][j] = line[j];
                    }
                    for(int k=0; k<myArray.length; k++){
                        for(int l=0; l<myArray.length; l++){
                            if(myArray[k][l]== null){

                                myArray[k][l]="0";
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
        System.out.println(Arrays.deepToString(myArray));
    }
}
