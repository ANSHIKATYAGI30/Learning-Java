public class day17 {
    //reversing a string
    public static void main(String[] args){
        String str = "ambitious";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }

        System.out.println(rev);
    }
    
}
