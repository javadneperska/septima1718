package com.company;

public class Trojuholnik {
    public double countObvod(double a,double b,double c){

        return a+b+c;
    }
    public double countObsah(double a,double b,double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
