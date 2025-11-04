public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van A",  "a@vnu.edu.vn", "2302001");
        Student s2 = new Student("Tran Thi B", "b@vnu.edu.vn", "2302002");
        Student s3 = new Student("Le Van C",  "c@vnu.edu.vn", "2302003");


        Teacher t1 = new Teacher("Dr. Pham Van D", "d@vnu.edu.vn", "PGS.TS");
        Advisor a1 = new Advisor("Pham Tien E", "e@vnu.edu.vn");


        KLTN<Student, Person> k1 = new KLTN<>(s1, t1, "AI");
        KLTN<Student, Person> k2 = new KLTN<>(s2, a1, "Computer Vision");
        KLTN<Student, Person> k3 = new KLTN<>(s3, t1, "Integrated Circuit");


        ListSortable <KLTN<Student, Person>> list = new ListSortable<>();
        list.add(k1);
        list.add(k2);
        list.add(k3);

        list.print();
    }
}
