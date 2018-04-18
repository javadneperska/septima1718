import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    private static final String FIRST_NAME = "peter";
    private static final String LAST_NAME="ferencik";
    private static final String LANGUAGE="Slovak, English, German";
    private static final int NUM_LANGUAGE=3;
    private static final int SUBJECTS=2;
    private static final Gender GENDER = Gender.man;


    @Test
    public void testStudent(){

        Student s =new Student();
        s.setFirstName(FIRST_NAME);
        Assert.assertEquals(FIRST_NAME, s.getFirstName());
        s.setLastName(LAST_NAME);
        Assert.assertEquals(LAST_NAME, s.getLastName());
        s.setLanguage(LANGUAGE);
        Assert.assertEquals(LANGUAGE, s.getLanguage());
        s.setNumLang(NUM_LANGUAGE);
        Assert.assertEquals(NUM_LANGUAGE, s.getNumLang());
        s.setSubjects(SUBJECTS);
        Assert.assertEquals(SUBJECTS, s.getSubjects());
        s.setGender(GENDER);
        Assert.assertEquals(GENDER, s.getGender());




    }
}
