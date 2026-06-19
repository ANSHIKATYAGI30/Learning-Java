//an argument of a method can accept arbitrary no. of values.
//this argument that can accept variable no. of values is called varargs(variable arguments).

public class day25 {
    public static void main(String[] args){
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }
    
    static int sum(int... nums) {
        //Java internally treats "int... nums" like: int[] nums = {10, 20, 30};
        //it can also accept zero arguments, won't give any errors.
        //only 1 varargs parameter is allowed. you cannot write (int...nums, int...age)
        //varargs must be the last parameter like (int age, String name, int... nums)
        //we use varargs when no. of inputs are nto fixed.

        int total = 0;

        for(int num : nums) {
            total += num;
        }

        return total;
    }
}
