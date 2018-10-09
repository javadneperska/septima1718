package sk.dneperska.septima1718.daniel.slanina;

import java.text.DecimalFormat;

public class Main {
    private static DecimalFormat formatter = new DecimalFormat("#,###");
    public static void main(String args[]){
       System.out.println("--------------------Before int array----------------------------");
       System.out.println(SystemMemory.getCurrentStats());
       int[] field = new int[(int) SystemMemory.getFree()/6];
       field = new int[(int) SystemMemory.getFree()/5];
       int lengthOfField = field.length;
       System.out.println("--------------------After int array----------------------------");
       System.out.println("Array size : " + formatter.format(lengthOfField) +"\n");
       System.out.println(SystemMemory.getCurrentStats());
       System.out.println("---------------------------------------------------------------");
       System.out.println("*Note - this array generation only fullfilled ~95% of maximum JVM memory, leaving ~5% for other objects");
    }
}
