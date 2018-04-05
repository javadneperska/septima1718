public class Main {
    public static void main(String args[]){
      Student ferko=new Student();
      ferko.setFirstName("Ferko");
      ferko.setLastName("Mrkvicka");
      ferko.setAge(18);
      ferko.setGender(Gender.Male);
      ferko.setNumberOfSubjects(6);
      ferko.setBirthNumber(990817/6715);
      ferko.setKnownLanguages(4);
      ferko.setLevelOfLanguage(SkillLevel.advanced);
      System.out.println(ferko.toString());


    }
}
