
package javaapplication26;


public class JavaApplication26 {

   
    public static void main(String[] args) {
    String s = "Toto je veta";
String[] words = s.split("\\s+");
for (int i = 0; i < words.length; i++) {
   
    words[i] = words[i].replaceAll("[^\\w]", "");
    System.out.println(words[i]);
    }

    


}
}