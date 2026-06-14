public class day8{
    //'FOR' - used to execute a block a code a certain no. of times
    //for(initialisation; condition; update)
    public static void main(String[] args){

        //print no. 1 till 10
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //print no. from 10 to 1 (reverse order)
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //print multiplication table
        int n = 5;
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        //printing patterns
        //pattern 1
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //pattern 2
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        //pattern 3
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //pattern 4 - hollow square
        int p = 5;

        for(int i = 1; i <= p; i++) {
            for(int j = 1; j <= p; j++) {

                if(i == 1 || i == p || j == 1 || j == p) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}