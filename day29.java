//a wrapper class is a class that wraps a primitive data type inside an object.
//for eg. int age = 19; here age is a primitive value, not an object.
//'Integer age = 19;' - here, Integer is an object that contains the int value 19.

//Imagine: 
// Primitive = Letter
// Wrapper Class = Envelope containing the letter
// The letter (primitive value) is useful, but sometimes the postal system (Java Collections, Generics, APIs) only accepts envelopes (objects).
// So Java provides wrapper classes to package primitive values as objects.
//java synchronization works with objects in multithreading.

//byte - Byte, short - Short, int - Integer, long - Long, float - Float
//double - Double, boolean - Boolean, char - Character
import java.util.ArrayList;

public class day29{
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(95);
        marks.add(88);

        System.out.println(marks);
        //output - [95, 88]
        // Without the Integer wrapper class, ArrayList couldn't store int values.
    }
}