
import static java.lang.reflect.Array.get;
import static java.nio.file.Paths.get;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private int birthNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
     
    public int getBirthNumber () {
        return birthNumber;
    }
    
    public void setBirthNumber (int birthNumber) {
        this.birthNumber = birthNumber;
    }
          

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + "\'" +
                ", gender=" + gender + "\'" +
                ", birth number=" + birthNumber + "\'" +
                '}';
    }

    void setBirthNumber(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setKnownLanguages(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setGender(gender Gender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
