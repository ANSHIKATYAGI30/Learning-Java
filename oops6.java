class Car{
    String model;
    String color;
    int price;
    boolean isLocked = false;

    Car(){
        System.out.println("In the default constructor- ");
        model = "Hatchback";
        color = "Black";
        price = 1000000;
    }
    Car(String modelName, String colorName, int priceValue){
        System.out.println("In the parametrized constructor- ");
        model = modelName;
        color = colorName;
        setPrice(priceValue);
    }

    void drive(){System.out.println("zoommm!");}

    void lock(){
        isLocked = true;
        System.out.println("Car locked!");
    }

    void unlock(){
        isLocked = false;
        System.out.println("Car unlocked!");
    }
    void setPrice(int priceValue){
        if(priceValue < 0){
            priceValue = 0;
        }
        price = priceValue;
    }
}

public class oops6 {
    public static void main(String[] args){
        Car c1 = new Car("Hatchback", "Red", 45600000);
        Car c2 = new Car();

        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.price);

        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.price);

    }
    
}
