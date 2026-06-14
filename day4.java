import java.util.Scanner;

//if-else condition

public class day4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 0){
            System.out.println("Positive no.");
        }
        else if(x < 0){
            System.out.println("Negative no.");
        }
        else{
            System.out.println("It's a zero!");
        }

        if(x % 2 == 0){
            System.out.println("Even no.");
        }
        else if(x % 2 != 0){
            System.out.println("Odd no.");
        }
        sc.close();


    }
}
