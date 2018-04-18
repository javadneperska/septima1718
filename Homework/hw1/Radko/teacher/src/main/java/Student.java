public class Student extends Person {

    private int numberOfSubjects;
    private int birthNumber;
    private int knownLanguages;
    private Gender gender;

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public int getBirthNumber() {
        return birthNumber;
    }

    public void setBirthNumber(int birthNumber) {
        this.birthNumber = birthNumber;
    }

    public int getKnownLanguages() {
        return knownLanguages;
    }

    public void setKnownLanguages(int knownLanguages) {
        this.knownLanguages = knownLanguages;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  super.toString() +  "Is Student{" +
                "numberOfSubjects=" + numberOfSubjects +
                ", birthNumber=" + birthNumber +
                ", knownLanguages=" + knownLanguages +
                ", gender=" + gender +
                "} " ;
    }
}
