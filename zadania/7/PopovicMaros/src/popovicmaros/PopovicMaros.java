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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Žiak
 */
public class PopovicMaros {

static Scanner sc = new Scanner(System.in);
static ArrayList kosik=new ArrayList();

    public static void main(String[] args) {
     while(true){
        System.out.println("Write component you are looking for: \n");
        System.out.println("(1) RAM");
        System.out.println("(2) Graphics card");
        System.out.println("(3) Processor");
        System.out.println("(4) Hard disk");
        System.out.println("-----------------");
        System.out.println("(0) Buy");
        System.out.println("(any) Stop");
        switch(sc.nextInt()){
            case 1: getFromCsv("ram"); break;
            case 2: getFromCsv("graphiccard"); break;
            case 3: getFromCsv("processor"); break;
            case 4: getFromCsv("harddisk"); break;
            case 0: buy(kosik);
            default: System.exit(0); break;
        }
     }   
    }

    private static void getFromCsv(String productName) {
        
        
        try {

            File f = new File("src//popovicmaros//"+productName+".csv");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            ArrayList<String> list=new ArrayList<String>();
            System.out.println(b.readLine()+"\n");
            int option = 1;
            while(null != (readLine = b.readLine())){
                System.out.println("Option ("+option+"): "+readLine);
                list.add(readLine);
                option++;
            }
            
            System.out.println("Press option or press (0) to get back to menu");
            option = sc.nextInt();
            if(option != 0){
                System.out.println(list.get(option-1));
                kosik.add(createClass(list.get(option-1),productName));
            }
                 } catch (IOException e) {
                     e.printStackTrace();
                   }
    }

    private static Object createClass(String get, String productName) {
        switch(productName){
            case "ram":
                ram r = new ram(get.split(",")[0],get.split(",")[1],get.split(",")[2],Double.parseDouble(get.split(",")[3]));
                return r;
            case "graphiccard":
                graphiccard g = new graphiccard(get.split(",")[0],get.split(",")[1], Double.parseDouble(get.split(",")[2]));
                return g;
        }
        System.out.println("d,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        return null;
    }

    private static void buy(ArrayList kosik) {
        System.out.println("Items in cart:");
        for (Object object : kosik) {
            System.out.println(object.toString());
        }
    }
    
    
    
}
