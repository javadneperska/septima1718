package sk.dneperska.septima1718.ferencik.peter;

import java.lang.management.ManagementFactory;

public class Main {
    //public static final int array[] = new int[Integer.MAX_VALUE - 8];
    public static void main (String[] args) throws Exception{
        /* Total amount of free memory available to the JVM */
        System.out.println("Free memory (Megabytes): " +
                (Runtime.getRuntime().freeMemory())/1048576);

        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (Megabytes): " +
                (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory/1048576));

        /* Total memory currently in use by the JVM */
        System.out.println("Total memory (Megabytes): " +
                (Runtime.getRuntime().totalMemory()/1048576));

        

}}
