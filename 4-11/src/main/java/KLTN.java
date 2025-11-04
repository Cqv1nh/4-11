public class KLTN <T extends Student, V extends Person> implements Comparable<KLTN<T, V>> {
    private T Student;
    private V supervisor;
    private String name;

    public KLTN(T student, V supervisor, String name) {
        Student = student;
        this.supervisor = supervisor;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(KLTN<T, V> other) {
        return this.name.compareToIgnoreCase(other.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
