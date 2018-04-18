import org.junit.Assert;
import java.util.ArrayList;
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
    public void testPredmety(){
        Person p = new Person();
        p.setPredmety(4);
        System.out.println("Poèet navštevovaných predmetov: " + p.getPredmety());

    }
          @Test
    public void testPohlavie(){
        Person p = new Person();
        p.setPohlavie(pohlavie.MUŽ);
        System.out.println("Pohlavie: " + p.getPohlavie());

    }
      
             @Test
    public void testRodneCislo(){
        Person p = new Person();
        p.setRodneCislo("991011/7407");
        System.out.println("Rodne èíslo: " + p.getRodneCislo());

    }
               @Test
    public void testJazyky(){
        Person p = new Person();
        ArrayList<String> al=new ArrayList<String>();
        al.add("Slovenèína-B2");
        al.add("Angliètina-C2");
        al.add("Èeština-A1");
        al.add("Rómština-C1");
        p.setJazyky(al);
        System.out.println("Jazyk: " + p.getJazyky());

    }
      
      
    
}
