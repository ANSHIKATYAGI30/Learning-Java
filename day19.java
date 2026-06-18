//strings - immutable, sequence of chars represented as single data type. 
//strings are stored in the string pool. 
//string offers several builtin methods.


//character arrays- sequenctial collection of char data type.
//char array - mutable, no builtin methods, stored in heap.

public class day19 {
    public static void main(String[] args){
        String str = "adorable";
        char[] arr = {'a', 'd', 'o', 'r', 'a', 'b', 'l', 'e'};

        System.out.println(str);
        System.out.println(arr);

        char[] arr2 = str.toCharArray();
        System.out.println(arr2);

        String str2 = new String(arr);
        System.out.println(str2);

    }
    
}
