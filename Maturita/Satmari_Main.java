package com.company;


import java.util.HashMap;

public class Satmari_Main {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> znamka = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        znamka.put("Adolf", 4);
        znamka.put("Muhammad", 3);
        znamka.put("Alfonz", 2);
        znamka.put("Angie", 3);
        znamka.put("Khalib", 2);
        znamka.put("Jah", 1);
        znamka.put("Abdul", 5);
        for (String i : znamka.keySet()) {
            if(znamka.get(i) < 5){
            System.out.println("Žiak : " + i + " Známka : " + znamka.get(i));
            }}
    }
}