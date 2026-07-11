public class dsa11 {
    
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        Node head;
        int size = 0;
        
        //Add beginning
        public void addBeg(int val){
            Node newNode = new Node(val);

            newNode.next = head;
            head = newNode;

            size++;
        }

        //Add last
        public void addLast(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                size++;
                return;
            }

            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            size++;
        }

        //Add at index
        public void addAt(int index, int val){
            if(index < 0 || index > size){
                System.out.println("Invalid Index");
                return;
            }
            if(index == 0){
                addBeg(val);
                return;
            }
            if(index == size){
                addLast(val);
                return;
            }

            Node newNode = new Node(val);
            Node temp = head;

            for(int i = 0; i < index - 1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

            size++;
        }

        //Remove Beg.
        public void removeFirst() {
            if (head == null) {
                return;
            }
            head = head.next;
            size--;
        }

        // Remove Last
        public void removeLast() {
            if (head == null)
                return;

            if (head.next == null) {
                head = null;
                size--;
                return;
            }

            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
            size--;
        }

        // Remove At Index
        public void removeAt(int index) {
            if (index < 0 || index >= size) {
                return;
            }

            if (index == 0) {
                removeFirst();
                return;
            }

            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

   
        // Print Linked List
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

  
        // Length
        public int length() {
            return size;
        }

        // Search
        public boolean search(int val) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == val)
                    return true;
                temp = temp.next;
            }
            return false;
        }

        // Middle Node
        public int mid() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addBeg(20);
        list.addBeg(10);
        list.addLast(30);
        list.addLast(40);
        list.print();
        list.addAt(2, 25);
        list.print();
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
        list.removeAt(1);
        list.print();
        System.out.println("Length = " + list.length());
        System.out.println("Search 30 : " + list.search(30));
        System.out.println("Middle = " + list.mid());
    }
    
}
