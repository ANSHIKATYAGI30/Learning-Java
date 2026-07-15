import java.util.Stack;

public class Stack_Level1 {
    
    // 1. Reverse String
    public static String reverseString(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            st.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.toString();
    }

    // 2. Reverse Words
    public static String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String[] words = s.split(" ");
        for(String word : words) {
            st.push(word);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) {
            ans.append(st.pop());
            if(!st.isEmpty())
                ans.append(" ");
        }
        return ans.toString();
    }

    // 3. Valid Parentheses
    public static boolean validParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if(st.isEmpty()){return false;}
                char top = st.pop();
                if(ch == ')' && top != '(')
                    return false;
                if(ch == ']' && top != '[')
                    return false;
                if(ch == '}' && top != '{')
                    return false;
            }
        }
        return st.isEmpty();
    }

    // 4. Remove Adjacent Duplicates
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
    
    // 5. Stack Using Linked List
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static class StackLL {
        Node top;
        void push(int val) {
            Node node = new Node(val);
            node.next = top;
            top = node;
        }
        int pop() {
            if(top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }
        int peek() {
            if(top == null)
                return -1;
            return top.data;
        }
        boolean isEmpty() {
            return top == null;
        }
        void display() {
            Node temp = top;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
   
    // MAIN
    public static void main(String[] args) {

        System.out.println("Reverse String:");
        System.out.println(reverseString("Scaler"));

        System.out.println();

        System.out.println("Reverse Words:");
        System.out.println(reverseWords("I Love Java"));

        System.out.println();

        System.out.println("Valid Parentheses:");
        System.out.println(validParentheses("({[]})"));

        System.out.println();

        System.out.println("Remove Adjacent Duplicates:");
        System.out.println(removeDuplicates("abbaca"));

        System.out.println();

        System.out.println("Stack Using Linked List:");

        StackLL st = new StackLL();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Pop = " + st.pop());

        st.display();

        System.out.println("Peek = " + st.peek());
    }
}
