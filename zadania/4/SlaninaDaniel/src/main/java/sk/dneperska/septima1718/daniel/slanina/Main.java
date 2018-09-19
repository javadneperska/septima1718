package sk.dneperska.septima1718.daniel.slanina;

public class Main {

    public static void main(String[] args){
        Customer dano = new Customer("Daniel","Slanina");
        Customer ferok = new Customer("Peter","Ferok");

        System.out.println("Name: " + dano.getFirstName() +"\n"+"Surname: " + dano.getLastName());
        System.out.println("Name: " + ferok.getFirstName() +"\n"+"Surname: " + ferok.getLastName());
        System.out.println("-----------------------------------------");
        System.out.println("Number of customers : " +Customer.pocet);
    }
}
