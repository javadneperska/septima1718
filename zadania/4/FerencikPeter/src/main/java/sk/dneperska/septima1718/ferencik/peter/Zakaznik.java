package sk.dneperska.septima1718.ferencik.peter;

public class Zakaznik {
    private String firstname = null;
    private String lastname = null;
    static int number_customers = 0;
    public Zakaznik(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;


        Zakaznik.number_customers++;
    }
}
