public class Person {
    private String firstName;
    
    
    private int pocetPredmetov;
    private String RodneCislo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                '}';
    }

    public int getPocetPredmetov() {
        return pocetPredmetov;
    }

    public void setPocetPredmetov(int pocetPredmetov) {
        this.pocetPredmetov = pocetPredmetov;
    }

    public String getRodneCislo() {
        return RodneCislo;
    }

    public void setRodneCislo(String RodneCislo) {
        this.RodneCislo = RodneCislo;
    }
}
