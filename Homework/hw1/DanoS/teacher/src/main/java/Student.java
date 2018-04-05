public class Student extends Person {

    private int numberOfSubjects;
    private int birthNumber;
    private int knownLanguages;
    private int[] levelOfLanguage = {1,2,3,4,5};

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public Gender getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(Gender gender) {
        super.setGender(gender);
    }

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

    public int[] getLevelOfLanguage() {
        return levelOfLanguage;
    }

    public void setLevelOfLanguage(int[] levelOfLanguage) {
        this.levelOfLanguage = levelOfLanguage;
    }
}
