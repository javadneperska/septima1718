import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    private static final String BIRTH_DATE="895512/1233" ;
    private static final SkillLevel SKILL_LEVEL= SkillLevel.expert;

    @Test
    public void testFirstName(){
        Student po=new Student();
        po.setBirthNumber(BIRTH_DATE);
        Assert.assertEquals(BIRTH_DATE,po.getBirthNumber());
        po.setLevelOfKnowledge(SKILL_LEVEL);
        Assert.assertEquals(SKILL_LEVEL,po.getLevelOfKnowledge());

    }
}
