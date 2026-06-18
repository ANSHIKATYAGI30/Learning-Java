//method overloading is the act of having multiple methods having same name but diff. parameters.
//it increases the readibility of the program.

public class day22 {
    //different no. of parameters
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    //different data types
    static int multiply(int a, int b){
        return a*b;
    }
    static double multiply(double a, double b){
        return a*b;
    }

    //different order of parameters
    static void display(String name, int age){
        System.out.println(name + " " + age);
    }
    static void display(int age, String name){
        System.out.println(age + " " + name);
    }

    //if no. of params are same and only return type is diff., it causes a compilation error.
    public static void main(String[] args){
        System.out.println(add(5,3));
        System.out.println(add(5,3,1));
        System.out.println(multiply(2,3));
        System.out.println(multiply(2.5, 3.0));
        display("Aaria", 19);
        display(19, "Aaria");

    }
}
