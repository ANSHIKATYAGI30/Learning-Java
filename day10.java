import java.util.Scanner;

public class day10 {

    // 'do-while' - body of do-while is executed once before the condition is checked.
    public static void main(String[] args){
        //sum of numbers
        int i = 1;
        int sum = 0;

        do{
            sum += 1;
            i++;
        }while(i <= 5);

        System.out.println(sum);


        //password retry
        Scanner sc = new Scanner(System.in);
        String pwd;

        do{
            System.out.println("Enter password: ");
            pwd = sc.nextLine();
        } while(!pwd.equals("spotify123"));

        System.out.println("Access Granted");

        sc.close();


        //sum of pos no.
        Scanner s = new Scanner(System.in);
        int sums = 0;
        
        int num;

        do{
            num = s.nextInt();
            sums += num;
        }while(num >= 0);

        System.out.println("Sum = " + sums);

        s.close();
    }
    
}
