
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class cv5A {
    public static void main(String [] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Ak chces vlastnz vyber, stlac 1\n Ak chces vzbrat cisla so suboru, stlac 2")
               ;
        switch(sc.nextInt()){
            case 1: vlastnyVyber();
            break;
            case 2: suborVyber();
            break;
        }
    }
public static void vlastnyVyber(){
    String line;
    List<Double> cisla=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Keď už nechceš zadávať čísla, stlač x");
    while(!"x".equals(line=sc.nextLine())){
        cisla.add(Double.parseDouble(line));
     
        
    }
    scitaj(cisla);
}

    private static void scitaj(List<Double> cisla) {
        double sum= 0;
        for(Double num: cisla){
            sum+=num;
        }
        
            System.out.println(sum);
        }
    private static void suborVyber() throws FileNotFoundException, IOException{
        System.out.println("Zadajte meno suboru");
        Scanner sc=new Scanner(System.in);
         List<Double> cisla=new ArrayList<>();
        
       File f=new File("src\\main\\java\\"+ sc.nextLine());
        BufferedReader br=new BufferedReader(new FileReader(f));
        
        String readLine="";
        
        List<String> items=Arrays.asList(br.readLine().split("\\s,\\s"));
        
        for(String item: items){
            cisla.add(Double.parseDouble(item));
        }
        scitaj(cisla);
    } 

}
