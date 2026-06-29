import java.util.Scanner;

public class dsa1{
    //array stores data of same data type
    //array takes contiguous section of memory.
    public static void main(String[] args){
        int[] arr1 = {4,8,9,10,0};
        int[] arr2 = new int[5];
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        //sum of array
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        

        //max of array
        int m = sc.nextInt();
        int[] arr3 = new int[m];
        for(int j = 0; j < m ; j++){
            arr3[j] = sc.nextInt();
        }
        int max = arr3[0];
        for(int k = 0; k < arr.length; k++){
            if(arr3[k] > max){
                max = arr3[k];
            }
        }
        System.out.println(max);

        //reversing an array
        int p = sc.nextInt();
        int[] arr4 = new int[n];

        for(int i = 0; i < n; i++){
            arr4[i] = sc.nextInt();
        }
        int i = 0; 
        int j = p-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i--;
            j--;
        }
        for(int h = 0; h < n; h++){
            System.out.print(arr[h] + " ");
        }
        sc.close();

        //subarray
        int[] a = {1, 2, 3};
        for (int start = 0; start < arr.length; start++) {

            for (int end = start; end < arr.length; end++) {
                for (int g = start; g <= end; g++) {
                    System.out.print(a[g] + " ");
                }
                System.out.println();
            }
        }
    }
}