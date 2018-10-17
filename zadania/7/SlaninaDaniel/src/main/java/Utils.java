
import java.util.Scanner;

public class Utils {

    static final Scanner sc = new Scanner(System.in);
    static String userSelectOLD = "";
    static String userSelectNew = "";
    static String userSelect2 = "";
    static String selectedProcessor ="";
    static String selectedRAM = "";

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
        userSelect2 = (","+sc.next());
        System.out.println("For selected  type of RAM, speed (Mhz) and size of RAM suit these memories :");
        userSelectOLD = "type,speed,size";
        userSelectNew= "name";
        DatabaseOperations.getRamInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.next()+"\"") ;
        DatabaseOperations.getRamInfo(userSelectNew,userSelectOLD,userSelect2);
        selectedRAM = (DatabaseOperations.outLine);
        System.out.println("You have selected : " +selectedRAM+ " memory");

    }

    /*TODO - ADD ARGUMENTS TO SELECT METHODS FROM DB
    *  it's working  this way ->   select * from table where '' like '' and '' like ''
    */



//    static void endingMessage(){
//        System.out.println("----------------------------------------------");
//        System.out.println("Do you want to continue (Y/N) ?");
//        String con = sc.next();
//        continueLoop(con);
//    }
//
//    private static void continueLoop(String con) {
//        if (con.equals("Y") || con.equals("y")){
//        }
//        else{
//            System.out.println("Turning off, Thanks for using !");
//            System.exit(0);
//        }
//    }
}
