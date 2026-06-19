//call stack - what a program uses to keep track of method calls
//call stack is made up of stack frames- one for each method call.

public class day23 {
    public static void main(String[] args){
        int x = 0;
        System.out.println("Inside main(), x = " + x);
        first();
    }

    static void first(){
        int x = 10;
        System.out.println("Inside first(), x = " + x);
        second();
    }

    static void second(){
        int x = 20;
        System.out.println("Inside second(), x = " + x);
        third();
    }

    static void third(){
        int x = 25;
        System.out.println("Inside thrid(), x = " + x);
    }
    
}
