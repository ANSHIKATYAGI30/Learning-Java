//scope of variable - class leveland block level

public class day24 {

    static int age = 19;   // class-level variable

    static void display() {
        System.out.println(age);
    }

    static void show() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        int standard = 12; //this is a local or block level var which cannot be accessed by display() and show()

        display();
        show();
        System.out.println(standard);

    }
}
