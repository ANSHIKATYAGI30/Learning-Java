//2d arrays - used to store matrices or grids.

public class day26 {
    public static void main(String[] args){
        int[][] a = {
            {6, 2, 7},
            {0, -2, 1}
        };
        System.out.println(a[0][1]);

        int rows = 3;
        int cols = 4;
        int[][] b = new int[rows][cols];
        b[1][2] = 20;
        System.out.println(b[0][3]);

        //chessboard pattern
        int n = 8;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i+j) % 2 == 0){
                    System.out.print("W ");
                }
                else{System.out.print("B ");}
            }
            System.out.println();
        }

        //finding lucky no.
        int[][] arr = {
            {10, 25, 17},
            {99, 12, 44},
            {32, 78, 56}
        };

        int max = arr[0][0];
        int row = 0;
        int col = 0;

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] > max) {

                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Lucky Number = " + max);
        System.out.println("Position = (" + row + "," + col + ")");

        


    }
    
}
