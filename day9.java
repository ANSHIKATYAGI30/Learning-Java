import java.util.Scanner;

public class day9 {
    //'while' executes a block of code until certain condition is met.
    public static void main(String[] args){
        int i = 1;

        while(i <= 10){
            System.out.println(i);
            System.out.println(i*2);
            i++;
        }

        //count digits of a number
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int digit = 0;

        while(num > 0){
            num /= 10;
        }

        System.out.println(digit);

        sc.close();

    }
}
