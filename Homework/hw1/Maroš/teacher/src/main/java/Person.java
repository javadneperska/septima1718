import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String firstName;
    private int subjectCount;
    private String nationalIdentificationNum;
    private ArrayList<Languages> language;
    private Gender gender;
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public int getSubjectCount() {
        return subjectCount;
    }

    public void setSubjectCount(int subjectCount) {
        this.subjectCount = subjectCount;
    }

    public String getNationalIdentificationNum() {
        return nationalIdentificationNum;
    }

    public void setNationalIdentificationNum(String nationalIdentificationNum) {
        this.nationalIdentificationNum = nationalIdentificationNum;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
     public ArrayList<Languages> getLanguage() {
        return language;
    }

    public void setLanguage(ArrayList<Languages> language) {
        this.language = language;
    }
    
    @Override
    public String toString() {
        String toReturn = "";
        toReturn += "Person{\n"
                + "First Name: \'"+ firstName + "\'\n"
                + "Gender: \'"+gender + "\'\n"
                + "National Identification Number: \'"+nationalIdentificationNum + "\'\n"
                + "Subjects: \'"+ subjectCount + "\'\n"
                + "Languages: \n";
        
        for (Languages l : language) {
            toReturn += l.languageName +", "+l.languageLevel +"\n";
        }
                
        
        toReturn += "}";
        
        return toReturn;
    }
    
}
