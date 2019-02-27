import java.io.*;
import java.util.Scanner;

public class Main {

public static void main(String args []){
    String path = "C:\\Users\\Peter\\Desktop\\file.txt";
    try{
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(line);
        bw.newLine();
        String arr[] = line.split(" ");
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]);
            bw.newLine();
        }
      bw.close();
    }
    catch(FileNotFoundException fn){

        System.out.println("FILE NOT FOUND");
    }
    catch (IOException io){
        System.out.println("IO");
    }
}
}
