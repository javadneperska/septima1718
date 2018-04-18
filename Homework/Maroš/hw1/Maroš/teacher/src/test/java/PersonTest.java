import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    private static final String FIRST_NAME = "Anna";

    @Test
    public void testFirstName(){
        // Creating new instances of class Languages
        Languages slovak = new Languages("Slovak", "C1");
        Languages english = new Languages("English", "B2");
        Languages german = new Languages("German", "A2");
        Languages french = new Languages("French", "B1");
        
        // Creating arrayList of classes "Languages"
        ArrayList<Languages> langArray= new ArrayList<Languages>();
        // adding classes into arrayList
        langArray.add(slovak);
        langArray.add(english);
        langArray.add(german);
        langArray.add(french);
        
        // Creating an instance of class Person
        Person p = new Person();
        
        // setting information
        p.setFirstName(FIRST_NAME);
   //   Assert.assertEquals(FIRST_NAME, p.getFirstName());
        p.setSubjectCount(9);
        p.setGender(Gender.FEMALE);
        p.setNationalIdentificationNum("920406/1218");
        p.setLanguage(langArray);
        
        System.out.println("************************************************************");
        // printing an array
        System.out.println(p.toString());
        
   /*                     
        ArrayList<Languages> langTest = p.getLanguage();
        
        for (Languages l : langTest) {
            System.out.println("Languages");
            System.out.println(l.languageName +" "+l.languageLevel);
        }
   */
    }
}
