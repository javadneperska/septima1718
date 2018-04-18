public class Main {
    public static void main(String args[]){

      Person Rado = new Person();
      Rado.setFirstName("Radovan");
      Rado.setLastName("Huňor");
      Rado.setAge(18);
      Rado.setBirthNumber("24.3.2000");
      Rado.setKnownLanguages(3);
      Rado.setGender(Gender.Male);
      System.out.println(Rado.toString());

      Person Samo = new Person();
      Samo.setFirstName("Samuel");
      Samo.setLastName("Neexistujuci");
      Samo.setAge(40);
      Samo.setBirthNumber("1.1.1978");
      Samo.setKnownLanguages(50);
      Samo.setGender(Gender.Male);
      System.out.println(Rado.toString());
    }
}
