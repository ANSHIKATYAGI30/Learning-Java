//Arrays.sort() - sort arrays in ascending order.
//Collections.reverseOrder() works only with wrapper classes
// (Integer, Double, etc.), not with primitive arrays (int[]).

//Method	                     Purpose
//Arrays.sort(arr)	     -       Sort array
//Arrays.toString(arr)	 -       Print array
//Arrays.equals(a, b)	     -       Compare arrays
//Arrays.fill(arr, value)	 -       Fill array with a value
//Arrays.copyOf(arr, size) -	     Copy array
//Arrays.binarySearch(arr, key) -  Search in a sorted array

//Collections.sort() - used for ArrayList and other list implementations.

import java.util.Arrays;

public class dsa9 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 5);

        System.out.println(index);
    }
}
