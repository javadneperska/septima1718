package sk.dneperska.septima1718.daniel.slanina;

public class Customer {

    private String firstName;
    private String lastName;
    public static int pocet = 0;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        Customer.pocet++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
