class Student {
    String name;
}

public class oops3 {

    static void change(Student s) {
        s.name = "Sam";
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Lincy";

        change(s1);

        System.out.println(s1.name);
    }
}