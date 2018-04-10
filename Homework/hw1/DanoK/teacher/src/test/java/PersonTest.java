import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    private static final String FIRST_NAME = "mka";

    @Test
    public void testFirstName(){
        Person p = new Person();
        p.setFirstName(FIRST_NAME);
        Assert.assertEquals(FIRST_NAME, p.getFirstName());
        

    }
    @Test
     public void testRodneCislo(){
        Person p = new Person();
        p.setRodneCislo("980122/4502");
         System.out.println(p.getRodneCislo());

}
     @Test
         public void testPocetPredmetov(){
        Person p = new Person();
        p.setPocetPredmetov(6);
         System.out.println(p.getPocetPredmetov());

}
     }