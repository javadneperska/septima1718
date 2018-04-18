import org.junit.Assert;
import org.junit.Test;



public class studenttest {
    private static final String FIRST_NAME = "mka";
    private static final Skilllevel SKILLLEVEL = Skilllevel.Beginner;

    @Test
        public void testFirstName() {
        student p = new student();
        p.setFirstName(FIRST_NAME);
        Assert.assertEquals(FIRST_NAME, p.getFirstName());
    }
     @Test
        public void testSkilllevel(){
            student s = new student();
            s.setSkilllevel(Skilllevel.Beginner);
            Assert.assertEquals(SKILLLEVEL, s.getSkilllevel());

    }

}
