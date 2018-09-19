package sk.dneperska.septima1718.az.Main;

public class Zakaznici {
    public static int pocet = 0;
    public  String firstName = null;
    public  String lastName = null;
    public Zakaznici(String firstName, String lastName){

        Zakaznici.pocet++;
       this.firstName=firstName;
       this.lastName=lastName;

    }
}
