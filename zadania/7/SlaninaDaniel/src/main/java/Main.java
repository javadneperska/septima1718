
public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to computer components configurator !");
        System.out.println("-------------------------------------------------------------");
        Utils.processorSelect();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Now let's proceed to RAM selection");
        Utils.ramSelect();
        System.out.println("Ok, now you have to choose from disk drives !");
        Utils.driveSelect();


    }
}
