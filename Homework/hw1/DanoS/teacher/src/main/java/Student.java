public class Student extends Person {

    private int numberOfSubjects;
    private String birthNumber;
    private int knownLanguages;
    private SkillLevel levelOfKnowledge;

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public String getBirthNumber() {
        return birthNumber;
    }

    public void setBirthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
    }

    public int getKnownLanguages() {
        return knownLanguages;
    }

    public void setKnownLanguages(int knownLanguages) {
        this.knownLanguages = knownLanguages;
    }

    public SkillLevel getLevelOfKnowledge() {
        return levelOfKnowledge;
    }

    public void setLevelOfKnowledge(SkillLevel levelOfKnowledge) {
        this.levelOfKnowledge = levelOfKnowledge;
    }

    @Override
    public String toString() {
        return  super.toString() +  "Is Student{" +
                "numberOfSubjects=" + numberOfSubjects +
                ", birthNumber=" + birthNumber +
                ", knownLanguages=" + knownLanguages +
                ", levelOfKnowledge=" + levelOfKnowledge +
                "} " ;
    }
}
