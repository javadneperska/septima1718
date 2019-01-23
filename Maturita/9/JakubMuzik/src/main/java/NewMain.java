
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NewMain {


    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size");
        int size=Integer.parseInt(reader.readLine());
        for (int i =1; i <=size;i++)
        {
            for (int j =1; j <=size;j++) 
                {
                if(j<=i)
                    
                 System.out.print("*");
            }
            System.out.println();
            
            
        }
    }
    
}
