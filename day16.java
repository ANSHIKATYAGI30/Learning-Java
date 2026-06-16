//string class represents character strings.
//all string literals in java programs such as "abc" are implemented as instances of this class.
//strings in java are immutable.
//string pool - area in the heap memory where string literals are stored.


public class day16{
    public static void main(String[] args){
        String a = "hello";
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(4));

        System.out.println("Hellow world!".length());

        String s1 = "abc";
        String s2 = "cde";
        String s3 = new String("abc");

        if(s1 == s2){
            System.out.println("Equal");//can write s1.equals(s2)
        }
        else{
            System.out.println("Not equal");
        }

        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.contains("a"));
        System.out.println(a.replace("hello", "hi there!"));
        
        String s4 = a.substring(4);
        System.out.println(s4);

        //string concatenation is done using '+'
        //when string is concatenated with primitive types, they're automatically typecasted to strings.
        //when a string is concatenated with non-primitive types, the toString() on that object is called automatically.

        String a1 = "look";
        String a2 = "alike";
        String a3 = a1 + "-" + a2;
        System.out.println(a3);

        int x = 6;
        String a4 = a1 + x;
        System.out.println(a4);

        int[] arr = {5,4,11,45,63};
        System.out.println(arr + "");

    }
}