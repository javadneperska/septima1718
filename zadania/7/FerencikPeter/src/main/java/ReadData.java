

import java.io.BufferedReader;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
public static ArrayList<String[]> RAM = new ArrayList<String[]>();
public static  ArrayList<String[]> CPU = new ArrayList<String[]>();
public static ArrayList<String[]> Disc = new ArrayList<String[]>();
public static ArrayList<String[]> GC = new ArrayList<String[]>();
public static void readRAM(){

      try {
          FileReader fr = new FileReader("C:\\Users\\Peter\\Desktop\\Specifikacie\\RAM.txt");
          BufferedReader br = new BufferedReader(fr);
          String line =null;
          int j = 0;
          while ((line=br.readLine()) != null){
              String[] field = line.split(",");

                  RAM.add(field);
                  //System.out.println(RAM[j][i]);

          }
      }
      catch(IOException e){


      }

    }
    public static void readCPU(){
        try {
            FileReader fr = new FileReader("C:\\Users\\Peter\\Desktop\\Specifikacie\\Procesor.txt");
            BufferedReader br = new BufferedReader(fr);
            String line =null;

            while ((line=br.readLine()) != null){
                String[] field = line.split(",");

                    CPU.add(field);
                   // System.out.println(CPU[j][i]);

            }
        }
        catch(IOException e){


        }

    }
    public static void readDisc (){

            try {
                FileReader fr = new FileReader("C:\\Users\\Peter\\Desktop\\Specifikacie\\Disk.txt");
                BufferedReader br = new BufferedReader(fr);
                String line =null;
                while ((line=br.readLine()) != null){
                    String[] field = line.split(",");

                        Disc.add(field);
                        //System.out.println(GC[j][i]);


                }
            }
            catch(IOException e){


            }



    }

    public static void readGC(){
        try {
            FileReader fr = new FileReader("C:\\Users\\Peter\\Desktop\\Specifikacie\\Grafika.txt");
            BufferedReader br = new BufferedReader(fr);
            String line =null;
            int j = 0;
            while ((line=br.readLine()) != null){
                String[] field = line.split(",");

                    GC.add(field);
                   // System.out.println(Disc[j][i]);

            }
        }
        catch(IOException e){


        }



    }

}
