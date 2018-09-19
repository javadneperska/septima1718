package sk.dneperska.septima1718.mihalovitsova.adriana;

public class Customer {
    public String firstName = null;
    public String lastName = null;
    public static int numberofCustomers = 0;

    public Customer(String firstName, String lastName) {
        Customer.numberofCustomers++;
        this.firstName= firstName;
        this.lastName= lastName;
    }

}
