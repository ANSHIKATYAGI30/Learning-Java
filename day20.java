//methods can accept values while being called.
//these values are stored in local variables known as 'parameters' or 'arguments'.

//a method can have multiples or none arguments.
//the data type of each argument must be defined in the function signature.

public class day20 {

    static void introduce(String name, int age, String[] hobbies){
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old.");
        System.out.println("My hobbies are : ");
        for(String hobby : hobbies){
            System.out.println("- " + hobby);
        }
    }

    static void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        greet();

        String name = "Peter Parker";
        int age = 20;
        String[] hobbies = {"Photography", "Baking"};
        introduce(name, age, hobbies);
    }
}