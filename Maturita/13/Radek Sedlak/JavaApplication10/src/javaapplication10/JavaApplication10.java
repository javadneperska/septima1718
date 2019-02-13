
package javaapplication10;

import java.text.DecimalFormat;
import java.util.Scanner;


public class JavaApplication10 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double dis,a1,s,b1,c1,d1,e1;
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      double d = sc.nextDouble();
      double e = sc.nextDouble();
      DecimalFormat df=new DecimalFormat("#.00");
      
      dis=20;
      s=100+dis;
      
      a1=((s* a)/100)-a;
       String a1Formated = df.format(a1);
        System.out.println("hlavna cena je " + a + "dan z tejto ceny je " + a1Formated);
      b1=((s* b)/100)-b;
      String b1Formated = df.format(b1);
       System.out.println("hlavna cena je " + b + "dan z tejto ceny je " + b1Formated);
      c1=((s* c)/100)-c;
      String c1Formated = df.format(c1);
       System.out.println("hlavna cena je " + b + "dan z tejto ceny je " + c1Formated);
      d1=((s* d)/100)-d;
      String d1Formated = df.format(d1);
       System.out.println("hlavna cena je " + b + "dan z tejto ceny je " + d1Formated);
      e1=((s* e)/100)-e;
      String e1Formated = df.format(e1);
       System.out.println("hlavna cena je " + b + "dan z tejto ceny je " + e1Formated);
    }
    
}
