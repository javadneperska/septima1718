package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Reader
{

    private String path = "C:\\Users\\Peter\\Desktop\\File.txt";
    FileReader fr;
    private final int rows = 4;
    private final int columns = 4;
   public String [][] myArray = new String[rows][columns];

    {

    }

    public void readFile() {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(path)));
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
