import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());

        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());

        long maxMemory = Runtime.getRuntime().maxMemory();

        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());

        File[] roots = File.listRoots();
        
        for (File root : roots) { System.out.println("File system root: " + root.getAbsolutePath());
            System.out.println("Total space (bytes): " + root.getTotalSpace());
            System.out.println("Free space (bytes): " + root.getFreeSpace());
            System.out.println("Usable space (bytes): " + root.getUsableSpace()); } } }