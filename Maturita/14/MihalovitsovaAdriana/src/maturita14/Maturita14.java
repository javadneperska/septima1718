/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita14;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
String word;
Scanner sc = new Scanner(System.in);

System.out.println("Enter a word.");

if (sc.hasNextInt()) {
    System.out.println("Invalid");

    
}
else {
    word = sc.next();
char[] wordc = word.toCharArray();

int vowels = 0;

for (char w: wordc) {
    if(w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u' || w == 'y' || w == 'A' || w == 'E' || w == 'I' || w == 'O' || w == 'U' || w == 'Y') {
        vowels++;
    }
}

System.out.println("Number of vowels in " + word + " is: " + vowels);
    
    }
}
    }
    

