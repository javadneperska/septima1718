package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String season;
        System.out.println("Enter any month(1 to 12)");
        Scanner s = new Scanner(System.in);
       try{
        int entry = s.nextInt();
        switch (entry)
        {
            case 12:
            case 1:
            case 2:
                season = "Zima";
                break;
            case 3:
            case 4:
            case 5:
                season = "Jar";
                break;
            case 6:
            case 7:
            case 8:
                season = "Leto";
                break;
            case 9:
            case 10:
            case 11:
                season = "Jesen";
                break;
            default:
                season = "Neexistuje";
        }
        System.out.println("Mesiac je  " + season + ".");
       }catch(Exception ex){
           System.out.println(ex);




       }
}
}
