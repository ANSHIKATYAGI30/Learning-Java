//sum of two matrices
import java.util.Scanner;

public class day28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] C = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();


        //print col by col
        int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for(int j = 0; j < arr[0].length; j++) {

    for(int i = 0; i < arr.length; i++) {

        System.out.print(arr[i][j] + " ");

    }

    System.out.println();
}

    }
    
}
