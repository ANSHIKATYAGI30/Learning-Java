//object inside object
class Address {

    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {

    String name;
    Address address;

    Student(String name, Address address) {

        this.name = name;
        this.address = address;
    }
}

public class oops5 {

    public static void main(String[] args) {

        Address a = new Address("Ghaziabad");

        Student s =
            new Student("Anshika", a);

        System.out.println(s.address.city);
    }
}