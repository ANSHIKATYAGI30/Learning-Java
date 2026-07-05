public class dsa6 {

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 4, 2};

        SelectionSort(arr);
    }

    public static void SelectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minVal = arr[i];
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < minVal) {
                    minVal = arr[j];
                    minIdx = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            // Print after every pass
            System.out.print("Pass " + (i + 1) + ": ");

            for (int val : arr) {
                System.out.print(val + " ");
            }

            System.out.println();
        }
    }
}
