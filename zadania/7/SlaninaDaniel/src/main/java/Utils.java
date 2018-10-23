
import java.util.Scanner;

 class Utils {

    private static Scanner sc = new Scanner(System.in);
    private static String userSelectOLD = "";
    private static String userSelectNew = "";
    private static String userSelect2 = "";
    private static String selectedProcessor ="";
    private static String selectedRAM = "";
    private static String selectedDrive = "";
    private static String selectedGraphicsCard = "";
    private static double finalPrice = 0;

      static void processorSelect() {
        System.out.println("Select, how many threads you want CPU to have from available :");
        DatabaseOperations.getThreads();
        System.out.println("Select which one you want :");
        userSelect2 = sc.nextLine();
        System.out.println("For selected CPU threads suit these speeds (in MHz) : ");
        userSelectOLD = "threads";
        userSelectNew = "speed";
        DatabaseOperations.getProcessorInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.nextLine()+"\"" +" and "+userSelectOLD+" like "+userSelect2);
        System.out.println("For selected CPU threads and speed (Mhz) suit these processors :");
        userSelectOLD = "speed";
        userSelectNew= "name";
        DatabaseOperations.getProcessorInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.nextLine()+"\"") ;
        DatabaseOperations.getProcessorInfo(userSelectNew,userSelectNew,userSelect2);
        selectedProcessor = (DatabaseOperations.outLine);
        showSelected(selectedProcessor,"processor","cpu",userSelect2);
    }

     static void ramSelect() {
        System.out.println("Select, which type of RAM you want to use from available :");
        DatabaseOperations.getDDR();
        System.out.println("Select which one you want :");
        userSelect2 =("\""+sc.nextLine()+"\"");
        System.out.println("For selected type of RAM  suit these speeds (in MHz) : ");
        userSelectOLD = "type";
        userSelectNew = "speed";
        DatabaseOperations.getRamInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.nextLine()+"\"" + " and "+userSelectOLD+" like "+userSelect2);
        System.out.println("For selected type of RAM and speed (Mhz) of RAM suit these sizes of RAM :");
        userSelectOLD = "speed";
        userSelectNew= "size";
        DatabaseOperations.getRamInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.nextLine()+"\"" + " and speed like "+userSelect2);
        System.out.println("For selected  type of RAM, speed (Mhz) and size of RAM suit these memories :");
        userSelectOLD = "size";
        userSelectNew= "name";
        DatabaseOperations.getRamInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.nextLine()+"\"");
        userSelectOLD = "name";
        userSelectNew= "name";
        DatabaseOperations.getRamInfo(userSelectNew,userSelectOLD,userSelect2);
        selectedRAM = (DatabaseOperations.outLine);
         showSelected(selectedRAM,"memory","ram",userSelect2);

    }

     static void driveSelect() {
        System.out.println("Select, which type of disk drive you want to use  from available :");
        DatabaseOperations.getDiskType();
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.nextLine()+"\"");
        System.out.println("For selected disk type suit these sizes : ");
        userSelectOLD = "type";
        userSelectNew = "size";
        DatabaseOperations.getDiskInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.nextLine()+"\"" +" and "+userSelectOLD+" like "+userSelect2);
        System.out.println("For selected disk type and size suit these disk drives:");
        userSelectOLD = "size";
        userSelectNew= "name";
        DatabaseOperations.getDiskInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.nextLine()+"\"") ;
        DatabaseOperations.getDiskInfo(userSelectNew,userSelectNew,userSelect2);
        selectedDrive = (DatabaseOperations.outLine);
         showSelected(selectedDrive,"disk drive","drive",userSelect2);
    }

     static void graphicsCardSelect() {
        System.out.println("Select, which type of graphics card chip you want to use  from available :");
        DatabaseOperations.getGraphicsCardType();
        System.out.println("Select which one you want :");
        userSelect2 = ("\""+sc.next()+"\"");
        System.out.println("Now select the budget class you want to use: ");
        userSelectOLD = "type";
        userSelectNew = "budgetClass";
        DatabaseOperations.getGraphicsCardInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        userSelect2 = ( "\""+sc.next()+"\"" +" and "+userSelectOLD+" like "+userSelect2);
        System.out.println("For selected graphics card chip and budget class suit these graphics cards:");
        userSelectOLD = "budgetClass";
        userSelectNew= "name";
        DatabaseOperations.getGraphicsCardInfo(userSelectNew,userSelectOLD,userSelect2);
        System.out.println("Select which one you want :");
        sc.nextLine();
        userSelect2 = ("\""+sc.nextLine()+"\"") ;
        DatabaseOperations.getGraphicsCardInfo(userSelectNew,userSelectNew,userSelect2);
        selectedGraphicsCard = (DatabaseOperations.outLine);
         showSelected(selectedGraphicsCard,"graphics card","graphicscard",userSelect2);
    }

     static void writeSelected(){
         finalPrice = Math.round(finalPrice*100)/100.0d;
        System.out.println("Processor : " + selectedProcessor +"\n"
                +"RAM : " + selectedRAM +"\n"
                +"Disk : " + selectedDrive +"\n"
                +"Graphics card : " + selectedGraphicsCard);
         System.out.println("The total price of this configuration is : " +finalPrice +"€");
    }

     private static void showSelected(String component,String typeOfComponent, String nameOfComponent, String like ){
         System.out.println("You've selected : "+ component + "with the price of " +getPriceForCustomer(nameOfComponent,like) + "€ as your " +typeOfComponent);
     }

     private static double getPriceForCustomer(String component, String like){
         double priceOfTheComponent = DatabaseOperations.getPrice(component,like);
         double priceForCustomer = priceOfTheComponent * 1.06;
         finalPrice += priceForCustomer;
         priceForCustomer = Math.round(priceForCustomer*100)/100.0d;
         return priceForCustomer ;
     }

}
