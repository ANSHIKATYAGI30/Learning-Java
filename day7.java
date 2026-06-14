public class day7 {
    //AND - returns true if both expressions are true otherwise false.
    //OR - returns true if either one of the expressions is true, else false.
    //NOT - returns negation of the boolean value.
    public static void main(String[] args){
        //Logical AND
        int age = 25;
        String citizenship = "Indian";
        if(age >= 18 && citizenship == "Indian"){
            System.out.println("Person may vote");
        }
        else {
            System.out.println("Person cannot vote");
        }

        //Logical OR
        String organization = "Interviewbit";
        if(organization == "Scaler" || organization == "Interviewbit"){
            System.out.println("User is permitted");
        }
        else{
            System.out.println("USer blocked!");
        }

        //Logical NOT
        boolean flag = false;
        if(!flag){
            System.out.println("Hello world!");
        }
    }
    
}
