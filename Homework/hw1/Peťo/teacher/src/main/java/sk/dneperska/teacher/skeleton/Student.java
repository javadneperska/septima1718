package sk.dneperska.teacher.skeleton;

public class Student extends Person {
    private int numberofsubjects = 0;
    private Language language;
    private Skilllevel skilllevel;

    public int getNumberofsubjects() {
        return numberofsubjects;
    }

    public void setNumberofsubjects(int numberofsubjects) {
        this.numberofsubjects = numberofsubjects;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Skilllevel getSkilllevel() {
        return skilllevel;
    }

    public void setSkilllevel(Skilllevel skilllevel) {
        this.skilllevel = skilllevel;
    }
}