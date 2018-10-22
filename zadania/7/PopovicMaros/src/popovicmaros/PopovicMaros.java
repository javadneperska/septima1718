/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popovicmaros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Žiak
 */
public class PopovicMaros {

static Scanner sc = new Scanner(System.in);
static List<String> kosik = new ArrayList<String>();
static List<String> fileNames;
static List<String> productNames;
public static String ANSI_GREEN_BACKGROUND = "\u001B[42m";
public static String ANSI_RED_BACKGROUND = "\u001B[46m";
public static String ANSI_RESET = "\u001B[0m";

        // ********************************************* main() *********************************************
    public static void main(String[] args) {
        menu();
    }
    
    // ********************************************* menu() *********************************************
    private static void menu() {
        File file = new File("src//popovicmaros//");
        String[] fileList = file.list();
        fileNames = new ArrayList<String>();
        productNames = new ArrayList<String>();
        for(String name:fileList){
               if(Pattern.matches(".*.csv", name)) {
                    fileNames.add(name);
                    productNames.add(name.replace("_", " ").replace(".csv", ""));
               }
        }
        /*
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
        
        for (String productName : productNames) {
            System.out.println(productName);
        }
        */
     while(true){
         
        System.out.println("\n\n*** MENU ****");
        System.out.println(ANSI_GREEN_BACKGROUND + "Press number of component you are looking for: \n"+ANSI_RESET);
        int choice = 1;
         for (String productName : productNames) {
             System.out.println("("+choice+") "+productName);
             choice++;
         }
         
         
         
        
        System.out.println("-----------------");
        System.out.println("(-1) Show cart");
        System.out.println("(0) Buy");
        System.out.println("(any) Stop");
        choice = sc.nextInt();
         System.out.println("\n\n\n");
        
        
        if(choice == 0){
            buy(kosik);
            break;
        }else if(choice == -1){
            showCart();
        }else{
            getFromCsv(choice-1);
        }
     }  
    }
       // ******************************************************************************************** 
    

        // ********************************************* getFromCsv() *********************************************
    private static void getFromCsv(int choice) {
        String fileName = fileNames.get(choice);
       // System.out.println("You choose:"+choice);
        System.out.println(ANSI_RED_BACKGROUND +productNames.get(choice)+"s"+ANSI_RESET);
        
        try {

            File f = new File("src//popovicmaros//"+fileName);
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            ArrayList<String> productInfoList = new ArrayList<String>();
            System.out.println("-------------------------------");
            System.out.println("\t   "+b.readLine()+"\n");
            int option = 1;
            while(null != (readLine = b.readLine())){
                System.out.println("Option ("+option+"): "+readLine);
                productInfoList.add(productNames.get(choice)+": "+readLine);
                option++;
            }
            System.out.println("-------------------------------\n");
            
            System.out.println(ANSI_GREEN_BACKGROUND + "Select option or press (0) to get back to menu"+ANSI_RESET);
            option = sc.nextInt();
            if(option != 0){
                System.out.println(productInfoList.get(option-1));
                kosik.add(productInfoList.get(option-1));
            }
            System.out.println("\n\n\n");
                 } catch (IOException e) {
                     e.printStackTrace();
                   }
    }

// ******************************************************************************************

        // ********************************************* buy() *********************************************
    private static void buy(List<String> kosik) {
        List<Double> total = new ArrayList<Double>();
        if(kosik.isEmpty()){
            System.out.println(ANSI_GREEN_BACKGROUND + "\nCart empty."+ANSI_RESET);
            menu();
        }
        System.out.println("\n--------------------------------");
        System.out.println(ANSI_GREEN_BACKGROUND + "Items in cart:\n"+ANSI_RESET);
        for (String product : kosik) {
            System.out.println(product);
            total.add(Double.parseDouble(product.split(",")[product.split(",").length-1].replace("€","")));
        }
        double eur = 0;
        for (Double e : total) {
            eur += e;
        }
        eur = (Math.round((eur*100)));
        eur = eur/100;
        System.out.println(ANSI_GREEN_BACKGROUND + "Total: "+eur+" €"+ANSI_RESET);
        System.out.println("--------------------------------\n");
        System.out.println("Buy? "+ ANSI_GREEN_BACKGROUND + "(1) Yes"+ANSI_RED_BACKGROUND + " (0) No"+ANSI_RESET);
        switch(sc.nextInt()){
            case 1: System.out.println(ANSI_GREEN_BACKGROUND + "Bought"+ANSI_RESET); System.exit(0);break;
            case 0: System.out.println(ANSI_RED_BACKGROUND + "Not bought"+ANSI_RESET);
                    break;
        }
        menu();
        
    }
        // ********************************** showCart() ********************************************************

    private static void showCart() {
        List<Double> total = new ArrayList<Double>();
        if(kosik.isEmpty()){
            System.out.println(ANSI_GREEN_BACKGROUND + "\nCart empty."+ANSI_RESET);
            menu();
        }
        System.out.println("\n--------------------------------");
        System.out.println(ANSI_RED_BACKGROUND +"Items in cart:\n"+ANSI_RESET);
        for (String product : kosik) {
            System.out.println(product);
            total.add(Double.parseDouble(product.split(",")[product.split(",").length-1].replace("€","")));
        }
        double eur = 0;
        for (Double e : total) {
            eur += e;
        }
        eur = (Math.round((eur*100)));
        eur = eur/100;
        System.out.println(ANSI_RED_BACKGROUND +"Total: "+eur+" €" + ANSI_RESET);
        System.out.println("--------------------------------\n");
        System.out.println(ANSI_GREEN_BACKGROUND +"Press (0) to empty cart or press any key to return."+ANSI_RESET);
        if("0".equals(sc.next())){
            kosik.clear();
            System.out.println("Cart empty."+ANSI_RESET);
        }
        menu();
    }
    
    // ******************************************************************************************
    
}
