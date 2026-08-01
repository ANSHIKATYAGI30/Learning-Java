class Date {

    int day, month, year;

    void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

class Person {

    String name;
    Date dob;
    int mobileNo;

    void readData(String s, Date d, int m) {

        name = s;
        dob = d;
        mobileNo = m;
    }

    void printData() {

        System.out.println("Name : " + name);
        dob.printDate();
        System.out.println("Mobile : " + mobileNo);
    }
}

class Student extends Person {

    String institution;
    int[] qualif = new int[20];
    int rollNo;
    int[] marks = new int[5];

    void printBiodata() {

        printData();

        System.out.println("Institution : " + institution);
        System.out.println("Roll No : " + rollNo);

        for (int i = 0; i < qualif.length; i++) {
            System.out.println("Qualification " + i + " : " + qualif[i]);
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks " + i + " : " + marks[i]);
        }
    }
}

class Employee extends Person {

    int empNo;
    int[] salaryHistory = new int[12];
    String organization;
    String designation;

    void printSalary() {

        for (int i = 0; i < salaryHistory.length; i++) {
            System.out.println("Salary " + i + " : " + salaryHistory[i]);
        }
    }
}

public class inheritance {

    public static void main(String[] args) {

        Person p = new Person();

        Student s = new Student();

        Employee e = new Employee();

        // OR if you want arrays

        Student[] students = new Student[100];

        Employee[] employees = new Employee[50];
    }
}
