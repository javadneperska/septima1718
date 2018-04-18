public class Main {
    public static void main(String args[]){

      Person alexandra = new Person();
      alexandra.setFirstName("Alexandra");
      alexandra.setLastName("Baumova");
      alexandra.setAge(18);
      alexandra.setGender(Gender.Female);
      alexandra.setBirthNumber("123456/1234");
      alexandra.setKnownLanguages(4);
      alexandra.setLevelOfKnowledge(SkillLevel.advanced);
      System.out.println(alexandra.toString());

      Student adam =new Student();
      adam.setFirstName("Adam");
      adam.setLastName("Adamovsky");
      adam.setAge(19);
      adam.setGender(Gender.Male);
      adam.setNumberOfSubjects(6);
      adam.setBirthNumber("123456/1244");
      adam.setKnownLanguages(4);
      adam.setLevelOfKnowledge(SkillLevel.advanced);
      System.out.println(adam.toString());
    }
}
