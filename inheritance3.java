class Box {

    double length;
    double width;
    double height;

    // Default Constructor
    Box() {
        length = width = height = 1;
    }

    // Cube
    Box(double side) {
        length = width = height = side;
    }

    // Rectangle Box
    Box(double length, double width) {
        this.length = length;
        this.width = width;
        this.height = 1;
    }

    // Cuboid
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }

    double surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    void display() {

        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Height : " + height);

        System.out.println("Volume : " + volume());

        System.out.println("Surface Area : " + surfaceArea());

        System.out.println("----------------------");
    }
}

public class inheritance3 {

    public static void main(String[] args) {

        Box b1 = new Box();

        Box b2 = new Box(5);

        Box b3 = new Box(5,4);

        Box b4 = new Box(5,4,3);

        b1.display();

        b2.display();

        b3.display();

        b4.display();
    }
}
