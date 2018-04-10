import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    private static final String BIRTH_DATE="24.3.2000" ;
    private static final gender GENDER= gender.Male;

    @Test
    public void testFirstName(){
        Student po=new Student();
        po.setBirthNumber(BIRTH_DATE);
        Assert.assertEquals(BIRTH_DATE,po.getBirthNumber());
        po.setGender(GENDER);
        Assert.assertEquals(GENDER,po.getGender());

    }
}
