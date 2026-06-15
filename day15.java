//'for-each' - called as "enhanced for loop"
//mainly used to iterate over each of the iterable elements one by one.


public class day15 {
    public static void main(String[] args){
        int[] arr = {5, 3, 2 ,4 ,1};
        int key = 20;

        boolean found = false;

        for(int num : arr){
            if(num == key){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Found!");
        }
        else{
            System.out.println("Not found!");
        }
    }
    
}
