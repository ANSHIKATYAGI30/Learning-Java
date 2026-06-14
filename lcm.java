import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int a = A, b = B;

        // Euclidean Algorithm for GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (A * B) / gcd;

        System.out.println(lcm);

        sc.close();
    }
}