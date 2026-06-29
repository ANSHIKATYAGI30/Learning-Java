public class dsa2 {

    public static void main(String[] args) {

        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        transpose(arr);   // Call the method
    }

    public static void transpose(int[][] arr){

        // Swap across the main diagonal
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < i; j++){

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Print the transposed matrix
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[0].length; j++){

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
