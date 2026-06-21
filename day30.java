//autoboxing - automatic conversion that java compiler makes b/w primitive types and their corresponding object wrappper classes.


public class day30 {
    public static void main(String[] args){
        int x = 5;
        float y = 3.44F;
        long z = 6000;

        Integer intobj = x;
        Float floatobj = y;
        Long longobj = z;

        System.out.println(intobj);
        System.out.println(floatobj);
        System.out.println(longobj);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(5,3));

        //unboxing
        Integer a = 10;
        Double b = 2.1587;
        Character c = 'A';

        int e = a;
        double f = b;
        char g = c;

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    
}
