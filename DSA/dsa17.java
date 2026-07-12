//stack using LL
public class dsa17 {

    // Node
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    // Stack
    static class StackLL {
        Node top;
        // Push
        void push(int val) {
            Node node = new Node(val);
            node.next = top;
            top = node;
        }
        // Pop
        int pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        // Peek
        int peek() {
            if (top == null) {
                System.out.println("Stack Empty");
                return -1;
            }
            return top.data;
        }

        // isEmpty
        boolean isEmpty() {
            return top == null;
        }

        // Size
        int size() {
            int count = 0;
            Node temp = top;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // Display
        void display() {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }}}

    public static void main(String[] args) {
        StackLL st = new StackLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Stack:");
        st.display();
        System.out.println();
        System.out.println("Peek = " + st.peek());
        System.out.println("Pop = " + st.pop());
        System.out.println();
        st.display();
        System.out.println("Size = " + st.size());
        System.out.println("Empty = " + st.isEmpty());
    }
}
