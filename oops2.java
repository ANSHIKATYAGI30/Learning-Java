class Student {

    // Instance variables (properties)
    String name;
    int age;
    String branch;

    // Constructor
    Student(String name, int age, String branch) {

        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    // Method
    void display() {

        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Branch : " + branch);
    }

    // Method with parameter
    void greet(String teacher) {

        System.out.println(name + " says Hello to " + teacher);
    }
}

public class oops2 {

    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student("Anshika", 19, "CSE");
        Student s2 = new Student("Sara", 18, "AI");

        // Calling methods
        s1.display();

        System.out.println();

        s2.display();

        System.out.println();

        s1.greet("Physics Ma'am");
        s2.greet("Math Sir");
    }
}