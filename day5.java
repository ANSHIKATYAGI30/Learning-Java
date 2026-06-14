import java.util.Scanner;

public class day5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month){
            //can also use 'case 1 : '
            case 1 -> {
                System.out.println("January");
                System.out.println("31 days");
            
            }
            
            case 2 -> {
                System.out.println("February");
                System.out.println("29 days");
            }
            
            case 3 -> {
                System.out.println("March");
                System.out.println("31 days");
            }
            
            case 4 -> {
                System.out.println("April");
                System.out.println("30 days");
        }

            case 5 ->{
                System.out.println("May");
                System.out.println("31 days");
                break;
            }

            default -> System.out.println("No month!");
    }


        sc.close();

    }
}
