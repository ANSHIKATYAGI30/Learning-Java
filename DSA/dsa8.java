public class dsa8 {
    
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        insertionSort(arr);

        System.out.println("\nFinal Sorted Array:");

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            // Shift larger elements one position to the right
            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;

            // Print array after each pass
            System.out.print("Pass " + i + ": ");

            for (int val : arr) {
                System.out.print(val + " ");
            }

            System.out.println();
        }
    }
}
