import java.util.Scanner;
//array input output

public class day13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("At index = " + i + " value= " + arr[i]);
        }
        sc.close();
    }
    
}
