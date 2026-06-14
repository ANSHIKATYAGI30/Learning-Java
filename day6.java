import java.util.Scanner;

public class day6 {
    //ternary operator - condition ? value-if-true : value-if-false
    public static void main(String[] args){

        //finding pos/neg no.
        int num = -5;

        String result = (num >= 0) ? "Positive" : "Negative";

        System.out.println(result);


        //checking voting eligibilty
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        String status = (age >= 18)
                ? "Eligible"
                : "Not Eligible";

        System.out.println(status);

        sc.close();
        
    }
}
