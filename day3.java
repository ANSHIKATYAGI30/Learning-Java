public class day3 {
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        //arithmetic operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a + (float)b);

        //unary operator
        System.out.println(a++);
        System.out.println(b--);

        //relational operators
        int c = 11, d = 21;
        System.out.println(c==d);
        System.out.println(c>d);
        System.out.println(c<d);
        System.out.println(c>=d);
        System.out.println(c<=d);
        System.out.println(c!=d);

        //'=' - assignment operator 
        //'==' - equality operator (returns true or false)
    }
}
