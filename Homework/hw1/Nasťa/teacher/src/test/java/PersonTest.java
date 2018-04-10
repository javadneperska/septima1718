import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    private static final String FIRST_NAME = "anastasiia";
    private static final String LAST_NAME="zaytseva";
   // private static final String LANGUAGE="Slovak, English, German, Russian";
   // private static final int NUM_LANGUAGE=4;
   // private static final int SUBJECTS=2;


    @Test
    public void testFirstName(){
        Person p = new Person();
        p.setFirstName(FIRST_NAME);
        Assert.assertEquals(FIRST_NAME, p.getFirstName());
        p.setLastName(LAST_NAME);
        Assert.assertEquals(LAST_NAME, p.getLastName());





    }

}
