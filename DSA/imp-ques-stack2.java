import java.util.*;

public class Stack_Level2 {
  
    // 1. NEXT GREATER ELEMENT
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            if (st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    
    // 2. PREVIOUS GREATER ELEMENT
    public static int[] previousGreater(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            if (st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    // 3. NEXT SMALLER ELEMENT
    public static int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i])
                st.pop();
            if (st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
  

    // 4. PREVIOUS SMALLER ELEMENT
    public static int[] previousSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i])
                st.pop();
            if (st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

   
    // 5. STOCK SPAN
    public static int[] stockSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();
            if (st.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - st.peek();
            st.push(i);
        }
        return span;
    }

    // 6. DAILY TEMPERATURES
    public static int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temp[st.peek()] <= temp[i])
                st.pop();
            if (st.isEmpty())
                ans[i] = 0;
            else
                ans[i] = st.peek() - i;
            st.push(i);
        }
        return ans;
    }

    // PRINT ARRAY
  public static void print(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
  
    // MAIN
    public static void main(String[] args) {

        int arr[] = {4, 5, 2, 25};

        System.out.println("Array:");
        print(arr);

        System.out.println("\nNext Greater:");
        print(nextGreater(arr));

        System.out.println("\nPrevious Greater:");
        print(previousGreater(arr));

        System.out.println("\nNext Smaller:");
        print(nextSmaller(arr));

        System.out.println("\nPrevious Smaller:");
        print(previousSmaller(arr));

        int stock[] = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("\nStock Span:");
        print(stockSpan(stock));

        int temperature[] = {73, 74, 75, 71, 69, 72, 76, 73};

        System.out.println("\nDaily Temperatures:");
        print(dailyTemperatures(temperature));

    }
}
