import java.math.BigInteger;

public class day31 {
    public static void main(String[] args){

        double maxval = Math.max(2.2, 8.0);
        double minVal = Math.min(2.2, 8.0);
        System.out.println(maxval);
        System.out.println(minVal);

        //rounding-off
        double x = Math.floor(3.2);
        double y = Math.ceil(3.2);
        double z = Math.round(3.2);
        double a = Math.round(3.8);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

        //logs
        double E = Math.E;
        System.out.println(E);
        double b = Math.log(E);
        double c = Math.log10(100);
        System.out.println(b);
        System.out.println(c);

        //exponent
        double d = Math.pow(2,3);
        System.out.println(d);
        //square root
        double f = Math.sqrt(25);
        System.out.println(f);

        //bigInteger - used to store and work with large integer values.
        //we use string while writing no. in bigInteger because it may be too big for java numeric types.
        BigInteger g = new BigInteger("50000000000000000000000");
        BigInteger h = new BigInteger("180000000000000000000000");
        System.out.println(g);
        System.out.println(h);
        BigInteger i = g.add(h);
        System.out.println(i);
        BigInteger j = new BigInteger("456");
        BigInteger k = new BigInteger("1");
        System.out.println(j.multiply(k));
        System.out.println(j.divide(k));
        BigInteger l = k.pow(56);
        System.out.println(l);
        System.out.println(j.mod(k));

        //biginteger data conversion- earlier java used to allow only manual unboxing.
        //.intValue() - extracts the value of given integer.
         long v = 50;
         BigInteger m = new BigInteger(v + "");
         System.out.println(m);
         Integer n = 10;
         Integer s = 20;
         int sum = n.intValue() + s.intValue();
         System.out.println(sum);

    }
    
}
