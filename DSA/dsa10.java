//recursion - func. calls itself to solve a smaller version of same problem

public class dsa10 {
    
    public static void main(String[] args) {
        
        System.out.println(sum(5));
        System.out.println(fibonacci(7));
        System.out.println(power(2,5));
        reverse("Flabbergasted", 0);
        printIncreasing(9);
        int[] arr={5,8,2,8,9,11,18};
        System.out.println(firstIndex(arr,0,8));
        System.out.println(factorial(6));
    }

    //sum of first N no.
    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }

    //fibonacci
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //power
    static int power(int a, int b) {
        if (b == 0)
            return 1;
        return a * power(a, b - 1);
    }

    //reversing a string
    static void reverse(String s, int index) {
        if (index == s.length())
            return;
        reverse(s, index + 1);
        System.out.print(s.charAt(index));
    }

    //print-increasing
    static void printIncreasing(int n) {
        if (n == 0)
            return;
        printIncreasing(n - 1);
        System.out.println(n);
    }

    //1st index in array
     static int firstIndex(int[] arr,int index,int x){
        if(index==arr.length)
            return -1;
        if(arr[index]==x)
            return index;
        return firstIndex(arr,index+1,x);
    }

    //factorial
    static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }

}
