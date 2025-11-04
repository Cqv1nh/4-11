public class Student extends Person {
    private String ID;

    public Student() {
    }

    public Student(String fullname, String email, String ID) {
        super(fullname, email);
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
