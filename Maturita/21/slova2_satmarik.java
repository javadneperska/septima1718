import java.io.*;

public class slova2_satmarik {

    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\Žiak\\Documents\\JavaTxt\\program_text.txt");
            FileReader freader = new FileReader(file);
            BufferedReader breader = new BufferedReader(freader);

            String text = breader.readLine();
            System.out.println(text);

            //String[] split = text.split(" ");

            FileWriter fwriter = new FileWriter(file);
            BufferedWriter bwriter = new BufferedWriter(fwriter);

            String[] split = text.split(" ");
            bwriter.write(text+"\n");

            for (String string : split) {
                bwriter.write(string+"\n");
                bwriter.newLine();
            }
                bwriter.close();
                System.out.println("Ďakujem za použitie tohto programu:) #ZipBomb");
            }
        catch (Exception e) {
        }
    }
}
