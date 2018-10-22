
import java.util.Scanner;

public class Utils {

    static Scanner sc = new Scanner(System.in);
    static String userSelectOLD = "";
    static String userSelectNew = "";
    static String userSelect2 = "";
    static String selectedProcessor ="";
    static String selectedRAM = "";
    static String selectedDrive = "";

    public static void processorSelect() {
        System.out.println("Select, how many threads you want CPU to have from available :");
        DatabaseOperations.getThreads();
        System.out.println("Select which one you want :");
        userSelect2 = sc.next();
        System.out.println("For selected CPU threads suit these speeds (in MHz) : ");
        userSelectOLD = "threads";
        userSelectNew = "speed";
        DatabaseOperations.getProcessorInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = (sc.next()+" and "+userSelectOLD+" like "+userSelect2);
        System.out.println("For selected CPU threads and speed (Mhz) suit these processors :");
        userSelectOLD = "speed";
        userSelectNew= "name";
        DatabaseOperations.getProcessorInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.next()+"\"") ;
        DatabaseOperations.getProcessorInfo(userSelectNew,userSelectNew,userSelect2);
        selectedProcessor = (DatabaseOperations.outLine);
        System.out.println("You have selected : " +selectedProcessor+ " processor");
    }

    public static void ramSelect() {
        System.out.println("Select, which type of RAM you want to use from available :");
        DatabaseOperations.getDDR();
        System.out.println("Select which one you want :");
        userSelect2 =("\""+sc.next()+"\"");
        System.out.println("For selected type of RAM  suit these speeds (in MHz) : ");
        userSelectOLD = "type";
        userSelectNew = "speed";
        DatabaseOperations.getRamInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = (sc.next()+" and "+userSelectOLD+" like "+userSelect2);
        System.out.println("For selected type of RAM and speed (Mhz) of RAM suit these sizes of RAM :");
        userSelectOLD = "speed";
        userSelectNew= "size";
        DatabaseOperations.getRamInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = (sc.next()+" and speed like "+userSelect2);
        System.out.println("For selected  type of RAM, speed (Mhz) and size of RAM suit these memories :");
        userSelectOLD = "size";
        userSelectNew= "name";
        DatabaseOperations.getRamInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        sc.nextLine();
        userSelect2 = ("\""+sc.nextLine()+"\"");
        System.out.println(userSelect2);
        userSelectOLD = "name";
        userSelectNew= "name";
        DatabaseOperations.getRamInfo(userSelectNew,userSelectOLD,userSelect2);
        selectedRAM = (DatabaseOperations.outLine);
        System.out.println("You have selected : " +selectedRAM+ " memory");

    }

    public static void driveSelect() {
    //TODO - drive selection, graphic card selection and price calculator !
    }

}
