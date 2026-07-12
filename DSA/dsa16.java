// Circular Linked List
public class dsa16 {
    // Node Structure
    static class CNode {
        int data;
        CNode next;
        CNode(int data) {
            this.data = data;
        }}
    // Circular Linked List
    static class CLL {
        CNode head;
        // Add First
        void addFirst(int val) {
            CNode node = new CNode(val);
            if (head == null) {
                head = node;
                node.next = head;
                return;
            }
            CNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            node.next = head;
            temp.next = node;
            head = node;
        }
      
        // Add Last
        void addLast(int val) {
            CNode node = new CNode(val);
            if (head == null) {
                head = node;
                node.next = head;
                return;
            }
            CNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }

        // Delete First
        void deleteFirst() {
            if (head == null)
                return;

            // Only one node
            if (head.next == head) {
                head = null;
                return;
            }

            CNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }

        // Delete Last
        void deleteLast() {
            if (head == null)
                return;
            // Only one node
            if (head.next == head) {
                head = null;
                return;
            }
            CNode temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head;
        }
      
        // Print
        void print() {
            if (head == null) {
                System.out.println("List Empty");
                return;
            }
            CNode temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("(head)");
        }

        // Print Alternate Nodes
        void printAlternate() {
            if (head == null)
                return;
            CNode temp = head;
            do {
                System.out.print(temp.data + " ");
                if (temp.next.next == head)
                    break;
                temp = temp.next.next;
            } while (temp != head);
            System.out.println();
        }
      
        // Search
        boolean search(int key) {
            if (head == null)
                return false;
            CNode temp = head;
            do {
                if (temp.data == key)
                    return true;
                temp = temp.next;
            } while (temp != head);
            return false;
        }

        // ==========================
        // Length
        // ==========================

        int length() {
            if (head == null)
                return 0;
            int count = 0;
            CNode temp = head;
            do {
                count++;
                temp = temp.next;
            } while (temp != head);
            return count;
        }

        // Reverse
        void reverse() {
            if (head == null || head.next == head)
                return;

            CNode prev = null;
            CNode curr = head;
            CNode next;

            CNode last = head;

            while (last.next != head)
                last = last.next;

            do {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            } while (curr != head);
            head.next = prev;
            last.next = prev;
            head = prev;
        }
    }

    // Main
    public static void main(String[] args) {
        CLL list = new CLL();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        list.addLast(40);
        list.addLast(50);

        System.out.println("Original CLL:");
        list.print();

        list.deleteFirst();

        System.out.println("\nAfter deleteFirst():");
        list.print();

        list.deleteLast();

        System.out.println("\nAfter deleteLast():");
        list.print();

        System.out.println("\nAlternate Nodes:");
        list.printAlternate();

        System.out.println("\nLength = " + list.length());

        System.out.println("Search 30 = " + list.search(30));
        System.out.println("Search 100 = " + list.search(100));

        list.reverse();

        System.out.println("\nAfter Reverse:");
        list.print();
    }
}
