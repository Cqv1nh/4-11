public class Teacher extends Person {
    private String title;

    public Teacher() {
    }

    public Teacher(String fullname, String email, String title) {
        super(fullname, email);
        this.title = title;
    }


}
