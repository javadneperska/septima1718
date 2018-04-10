public class Student extends Person {
    public String firstName;
    public String lastName;
    private int subjects;
    private int numLang;
    private String language;
    private Gender gender;



    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    public int getNumLang() {
        return numLang;
    }

    public void setNumLang(int numLang) {
        this.numLang = numLang;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subjects=" + subjects +
                ", numLang=" + numLang +
                ", language='" + language + '\'' +
                ", gender=" + gender +
                '}';
    }
}
