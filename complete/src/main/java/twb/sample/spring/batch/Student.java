package twb.sample.spring.batch;

public class Student {

    private String matricule;
    private String fullName;

    public Student() {
    }

    public Student(String matricule, String fullName) {
        this.matricule = matricule;
        this.fullName = fullName;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "matricule: " + matricule + ", fullName: " + fullName;
    }

}
