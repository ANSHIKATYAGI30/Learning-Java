//stringbuilder class is used to create mutable(modifiable) string.
//.append(" ") - appends any new string into the previous one.

public class day18 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("I like programming");
        sb.append(" and coffee");

        System.out.println(sb);

        //inserts text at index 18
        sb.insert(18, ", gaming");
        System.out.println(sb);

        //replaces characters from index 2 to 5.
        sb.replace(2, 6, "love");
        System.out.println(sb);

        //deletes characters from index 7 to 19.
        sb.delete(7,20);
        System.out.println(sb);

        //converts StringBuilder into a normal string.
        String str = sb.toString();
        System.out.println(str);

        //reversing a string
        sb.reverse();
        System.out.println(sb);

        //changes a character at particular index.
        sb.setCharAt(0, 'H');

    }
}
