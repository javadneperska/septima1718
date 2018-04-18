public class student extends Person {
int subjects = 0;
String languages;
private Skilllevel Skilllevel;

    public Skilllevel getSkilllevel() {
        return Skilllevel;
    }

    public void setSkilllevel(Skilllevel skilllevel) {
        this.Skilllevel = skilllevel;
    }

    public String getLanguages() {

        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getSubjects() {

        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }
}
