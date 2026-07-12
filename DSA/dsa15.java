// Doubly Linked List

public class dsa15 {

    // Node Structure
    static class DNode {
        int data;
        DNode prev;
        DNode next;

        DNode(int data) {
            this.data = data;
        }
    }

    // Doubly Linked List
    static class DLL {

        DNode head;

        // ==========================
        // Add First
        // ==========================

        void addFirst(int val) {

            DNode node = new DNode(val);

            if (head != null) {
                head.prev = node;
                node.next = head;
            }

            head = node;
        }

        // ==========================
        // Add Last
        // ==========================

        void addLast(int val) {

            DNode node = new DNode(val);

            if (head == null) {
                head = node;
                return;
            }

            DNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
            node.prev = temp;
        }

        // ==========================
        // Delete First
        // ==========================

        void deleteFirst() {

            if (head == null)
                return;

            if (head.next == null) {
                head = null;
                return;
            }

            head = head.next;
            head.prev = null;
        }

        // ==========================
        // Delete Last
        // ==========================

        void deleteLast() {

            if (head == null)
                return;

            if (head.next == null) {
                head = null;
                return;
            }

            DNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.prev.next = null;
        }

        // ==========================
        // Reverse DLL
        // ==========================

        void reverse() {

            DNode curr = head;
            DNode temp = null;

            while (curr != null) {

                // Swap next and prev
                temp = curr.prev;
                curr.prev = curr.next;
                curr.next = temp;

                curr = curr.prev;
            }

            if (temp != null) {
                head = temp.prev;
            }
        }

        // ==========================
        // Print Forward
        // ==========================

        void printForward() {

            DNode temp = head;

            while (temp != null) {

                System.out.print(temp.data + " <-> ");

                temp = temp.next;
            }

            System.out.println("null");
        }

        // ==========================
        // Print Backward
        // ==========================

        void printBackward() {

            if (head == null)
                return;

            DNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            while (temp != null) {

                System.out.print(temp.data + " <-> ");

                temp = temp.prev;
            }

            System.out.println("null");
        }

        // ==========================
        // Print Alternate Nodes
        // ==========================

        void printAlternate() {

            DNode temp = head;

            while (temp != null) {

                System.out.print(temp.data + " ");

                if (temp.next != null)
                    temp = temp.next.next;
                else
                    break;
            }

            System.out.println();
        }

        // ==========================
        // Search
        // ==========================

        boolean search(int key) {

            DNode temp = head;

            while (temp != null) {

                if (temp.data == key)
                    return true;

                temp = temp.next;
            }

            return false;
        }

        // ==========================
        // Length
        // ==========================

        int length() {

            int count = 0;

            DNode temp = head;

            while (temp != null) {
                count++;
                temp = temp.next;
            }

            return count;
        }
    }

    // ==========================
    // Main Method
    // ==========================

    public static void main(String[] args) {

        DLL list = new DLL();

        // Add Elements
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        list.addLast(40);
        list.addLast(50);

        System.out.println("Original DLL:");
        list.printForward();

        System.out.println("\nPrint Backward:");
        list.printBackward();

        list.deleteFirst();

        System.out.println("\nAfter deleteFirst():");
        list.printForward();

        list.deleteLast();

        System.out.println("\nAfter deleteLast():");
        list.printForward();

        list.reverse();

        System.out.println("\nAfter Reverse:");
        list.printForward();

        System.out.println("\nAlternate Nodes:");
        list.printAlternate();

        System.out.println("\nLength = " + list.length());

        System.out.println("Search 30 = " + list.search(30));

        System.out.println("Search 100 = " + list.search(100));
    }
}
