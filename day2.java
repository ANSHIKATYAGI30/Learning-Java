//Scanner - a tool to read input
//run scanner in terminal in order to type input
import java.util.Scanner;

//common scanner methods-:
//next() - reads one word
//nextLine() - reads full line
//nextInt() - reads integer
//nextDouble() - reads decimal
//nextFloat() - float input
//nextBoolean() - true/false
//nextLong() - long intege

//if we don't use nextLine() after nextInt(), it leaves the key ENTER key (/n) in buffer and variable name here becomes empty.
//so, we add nextLine() which immediately consumes it.
//int age = sc.nextInt();
//sc.nextLine(); // consume leftover newline
//String name = sc.nextLine();

//we use s.close() - closes the scanner and frees the resources
public class day2 {
    public static void main(String[] args){
        //s - object name
        //new Scanner - creates object
        //System.in - takes keyboard input
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first name:");
        String first = s.nextLine();

        System.out.println("Enter last name:");
        String last = s.nextLine();

        System.out.println("Full Name: " + first + " " + last);

        s.close();

        String s1 = "I like java.";
        System.out.println(s1);
        
        //finding characters at specific index in our string
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(7));

        String s2 = """
                Harry Potter and the Philosopher's Stone
                Harry Potter and the Chanber of Secrets
                Harry Potter and the PRizoner of Azkaban
                Harry Potter and the Goblet of Fire
                """;
        System.out.println(s2);
    }
}