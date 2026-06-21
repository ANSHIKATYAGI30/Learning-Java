class Car{
    String model = "Hatchbeack";
    String color = "Black";
    int price = 10000000;
    boolean isLocked = false;

    void drive(){
        System.out.println("Zoom zoom zoom!");
    }

    void lock(){
        isLocked = true;
        System.out.println("Car is now locked!");
    }

    void unlock(){
        isLocked = false;
        System.out.println("Unlocked!");
    }

    int getPrice(){
        return price;
    }
}

public class oops1 {
    public static void main(String[] args){
        Car c1 = new Car();
        
        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c1.price);
        System.out.println(c1.getPrice());
        c1.lock();
        c1.unlock();
        System.out.println(c1.isLocked);
    }

    
}
