import org.junit.Assert;
import org.junit.Test;
import sk.dneperska.teacher.skeleton.Skilllevel;
import sk.dneperska.teacher.skeleton.Student;

public class StudentTest {
    private static final String FIRST_NAME = "mkaa";
    private static final Skilllevel SKILLLEVEL = Skilllevel.Beginner;
    @Test
    public void testFirstName(){
        Student s = new Student();
        s.setFirstName(FIRST_NAME );
        Assert.assertEquals(FIRST_NAME, s.getFirstName());

    }
    @Test
    public void testSkilllevel (){
        Student s = new Student();
        s.setSkilllevel(Skilllevel.Beginner);
        Assert.assertEquals(SKILLLEVEL,s.getSkilllevel());


    }
}
