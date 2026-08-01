class Person{
    String name;
    Date dob;
    int mobileNo;
    void readData(String s, Date d, int m){
        name = s;
        dob = d;
        mobileNo = m;
    }
    void printData(){
        System.out.println("Name: ", + name);
        dob.printDate();
        System.out.println("Mobile: ", + mobileNo);
    }
}

class Student extends Person{
    String institution;
    int[] qualif = new int[20];
    int rollNo;
    int[] marks = new int[5];

    void printBiodata(){
        printData();
        Sytem.out.println("Institution: " + institution);
        System.out.println("Roll: " + rollNo);
        for(int q = 0; q < qualif.length; q++){
            System.out.println("Marks: " + q + qualif[q]);
        }
        for(int m = 0; m < marks.length; m++){
            System.out.println("Result: " + m + marks[m]);
        }
    }
}

class Employee extends Person{
    int empNo;
    int[] salaryHistory = new int[12];
    String organization;
    String designation;
    Date dob;
    void printSalary(){
        for(int p = 0; p < salaryHistory.length; p++){
            System.out.println("Salary " + p + " : " + salaryHistory[p]);
        }
    }
}

class inheritance{
    public static void main(String args[]){
        Person p = new Person();
        Student s = new Student[100];
        Emplyee e = new Employee[50];
    }
}
