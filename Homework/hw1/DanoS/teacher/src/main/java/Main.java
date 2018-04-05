public class Main {
    public static void main(String args[]){

      Person joseph= new Person();
      joseph.setFirstName("Joseph");
      joseph.setLastName("Seed");
      joseph.setAge(43);
      joseph.setGender(Gender.Male);
      System.out.println(joseph.toString());

      Student may =new Student();
      may.setFirstName("Mary May");
      may.setLastName("Fairgrave");
      may.setAge(18);
      may.setGender(Gender.Female);
      may.setNumberOfSubjects(6);
      may.setBirthNumber("990817/6715");
      may.setKnownLanguages(4);
      may.setLevelOfKnowledge(SkillLevel.advanced);
      System.out.println(may.toString());
    }
}
