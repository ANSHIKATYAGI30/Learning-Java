public class randomeGame {
    public static void main(String[] args){
        while(true){
            int num = (int) (Math.random() * 100 + 1);
            if(num == 5 || num == 50){break;}
            System.out.println(num + " ");
        }
    }
    
}
