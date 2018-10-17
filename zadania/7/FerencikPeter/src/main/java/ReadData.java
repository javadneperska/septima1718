

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadData {
 public static String RAM [][] = new String [3][4];
 public static  String CPU [][] = new String [3][4];
 public static String Disc [][] = new String [3][3];
 public static String GC [][] = new String [3][3];
    public static void readRAM(){

      try {
          FileReader fr = new FileReader("C:\\Users\\Peter\\Desktop\\Specifikacie\\RAM.txt");
          BufferedReader br = new BufferedReader(fr);
          String line =null;
          int j = 0;
          while ((line=br.readLine()) != null){
              String[] field = line.split(",");
              for (int i = 0; i < field.length; i++) {
                  RAM[j][i] = field[i];
                  //System.out.println(RAM[j][i]);
              }
            j++;
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
            int j = 0;
            while ((line=br.readLine()) != null){
                String[] field = line.split(",");
                for (int i = 0; i < field.length; i++) {
                    CPU[j][i] = field[i];
                   // System.out.println(CPU[j][i]);
                }
                j++;
            }
        }
        catch(IOException e){


        }

    }
    public static void ReadDisc (){

            try {
                FileReader fr = new FileReader("C:\\Users\\Peter\\Desktop\\Specifikacie\\Disk.txt");
                BufferedReader br = new BufferedReader(fr);
                String line =null;
                int j = 0;
                while ((line=br.readLine()) != null){
                    String[] field = line.split(",");
                    for (int i = 0; i < field.length; i++) {
                        Disc[j][i] = field[i];
                        //System.out.println(GC[j][i]);
                    }
                    j++;
                }
            }
            catch(IOException e){


            }



    }

    public static void ReadGC(){
        try {
            FileReader fr = new FileReader("C:\\Users\\Peter\\Desktop\\Specifikacie\\Grafika.txt");
            BufferedReader br = new BufferedReader(fr);
            String line =null;
            int j = 0;
            while ((line=br.readLine()) != null){
                String[] field = line.split(",");
                for (int i = 0; i < field.length; i++) {
                    GC[j][i] = field[i];
                   // System.out.println(Disc[j][i]);
                }
                j++;
            }
        }
        catch(IOException e){


        }



    }

}
