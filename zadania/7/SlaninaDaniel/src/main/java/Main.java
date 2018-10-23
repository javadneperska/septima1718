
public class Main {
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args){
        System.out.println("Welcome to computer components configurator !");
        System.out.println("-------------------------------------------------------------");
        Utils.processorSelect();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Now let's proceed to RAM selection");
        Utils.ramSelect();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Ok, now you have to choose from disk drives !");
        Utils.driveSelect();
        System.out.println("-------------------------------------------------------------");
        System.out.println("And, the last component is graphics card");
        Utils.graphicsCardSelect();
        System.out.println("-------------------------------------------------------------");
        System.out.println("You have selected all necessary components!");
        System.out.println("-------------------------------------------------------------");
        System.out.println("SUMMARY !");
        System.out.println("Selected Components :");
        Utils.writeSelected();
        System.out.println("-------------------------------------------------------------");
        System.out.println(ANSI_CYAN +"Thanks for purchasing !"+ANSI_RESET);



    }
}
