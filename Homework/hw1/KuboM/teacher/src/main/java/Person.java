
import java.util.ArrayList;

public class Person {
    private String firstName;
    
    private int predmety;
    private pohlavie pohlavie;
    private String rodneCislo;
    private ArrayList<String> jazyky;

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

    public int getPredmety() {
        return predmety;
    }

    public void setPredmety(int predmety) {
        this.predmety = predmety;
    }

    public pohlavie getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(pohlavie pohlavie) {
        this.pohlavie = pohlavie;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        this.rodneCislo = rodneCislo;
    }

    public ArrayList<String> getJazyky() {
        return jazyky;
    }

    public void setJazyky(ArrayList<String> jazyky) {
        this.jazyky = jazyky;
    }

   
}
