package sk.dneperska.septima1718.daniel.slanina;


import java.io.*;
import java.lang.management.ManagementFactory;

public class Main {


    public static void main(String[] args) {

        /* Total number of processors or cores available to the JVM */
        System.out.println("Available processors (cores): " +
                Runtime.getRuntime().availableProcessors());

        /* Total amount of free memory available to the JVM */
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Free memory (MegaBytes): " + freeMemory/1048576);

        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (MegaBytes): " +
                (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory/1048576));

        /* Total memory currently in use by the JVM */
        long memory =  Runtime.getRuntime().totalMemory();
        System.out.println("Total memory (MegaBytes): " +memory/1048576);

        long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
        System.out.println("RAM Size= " + memorySize + " Bytes, what is equiv. of " + memorySize / 1048576 + " MegaBytes");
    }
}
