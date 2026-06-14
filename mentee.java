//typecasting - changing one data type to another
//2 types-: widening typecasting(automatic) & explicit typecasting(manual)
//widening - smaller to larger datatype
//explicit - larger to smaller datatype

public class mentee {
    public static void main(String[] args){
        //explicit typecasting
        long x = 1500000;
        byte y = (byte)x;
        System.out.println(y);
        System.out.println(x);

        final double pi;
        pi = 3.14159265359;
        System.out.println(pi);
    }
}
