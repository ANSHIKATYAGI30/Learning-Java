class Student {

    String name;
    int age;

    //calling another constructor
    Student() {
        this("Unknown", 0);
    }

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class oops4 {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}