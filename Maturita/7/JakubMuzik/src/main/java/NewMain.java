
import java.util.Scanner;


public class NewMain {
    static void count(String str) 
    { 
        
        char[] ch = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) { 
  
           
            String s = ""; 
  
          
            while (i < ch.length && ch[i] != ' ') { 
  
         
                s = s + ch[i]; 
                i++; 
            } 
  
            if (s.length() > 0)  
                System.out.println(s + "->" + s.length());             
        } 
    } 


    public static void main(String[] args) {
        String word="";
    int j;
    char[] chr;
    System.out.println("Zadajte to isté slovo 2x na vypísanie počtu písmen a napísanie slova odzadu:");
    Scanner keyboard = new Scanner(System.in);
     String str = keyboard.nextLine(); 
         
        if (str.length()<=4){
            System.out.println("The word is too short!");
           } else{
                    
                    
        
      count(str);          
    word= keyboard.nextLine();
    chr= word.toCharArray();
    for (j=word.length()-1; j>=0; j--)
    System.out.println("The word in reverse is " + (chr[j]) + ".");
    
    }
    }}
    

