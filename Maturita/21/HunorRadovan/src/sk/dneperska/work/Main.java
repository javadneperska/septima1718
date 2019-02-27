package sk.dneperska.work;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home")+ "\\file.txt"));
            String veta = br.readLine();
            System.out.println(veta);
	    String [] slova = veta.split(" ");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(System.getProperty("user.home")+ "\\file.txt", true)));
        out.println("\n");
	    for(int i = 0;i<slova.length;i++){
            out.println(slova[i]+"\n");
        }
        out.close();
    }
}
