//java methods can also optionally return some values back to the caller using return statement.
//data type of value being returned must be specified in the method.
//in case no value is to be returned, specify the return type as void.

public class day21 {
    public static void main(String[] args){
        square(5);
        greet();

        String[] arr = heroes();
        for(String hero: arr){
            System.out.println(hero);
        }
    }

    static int square(int num){
        return num * num;
    }

    static String[] heroes(){
        String[] hero = {"IronMan", "Hulk", "Thor", "SpiderMan"};
        return hero;
    }

    static void greet(){
        System.out.println("Welcome!");
    }
    
}
