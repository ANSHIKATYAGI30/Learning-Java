//toString() = defines how an object should look when converted to text.
//Overriding = replacing a parent class method with your own version.
//@Override = compiler check that ensures you're actually overriding correctly.
//System.out.println(object) automatically calls object.toString()

class ComplexNumber {

    int real;
    int imaginary;

    ComplexNumber(int real, int imaginary) {

        this.real = real;
        this.imaginary = imaginary;
    }

    //Method Overriding occurs when a child class
    //provides its own implementation of a method already defined in its parent class
    //@Override is an annotation that asks the compiler to verify that a method is actually overriding a parent class method.
    @Override
    public String toString() {

        return real + " + " + imaginary + "i";
    }

    ComplexNumber add(ComplexNumber y) {

        int sumReal = this.real + y.real;
        int sumImag = this.imaginary + y.imaginary;

        return new ComplexNumber(sumReal, sumImag);
    }
}

public class oops7 {

    public static void main(String[] args) {

        ComplexNumber x = new ComplexNumber(2, 3);
        ComplexNumber y = new ComplexNumber(5, 9);

        ComplexNumber z = x.add(y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}