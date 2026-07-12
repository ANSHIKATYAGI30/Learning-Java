//singly linked list
public class dsa14{
  
  //node structure
  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
    }
  }

  static class SinglyLinkedList{
    Node head;
    //add first
    void addFirst(int val){
      Node node = new Node(val);
      node.next = head;
      head = node;
    }

    //add last
    void addLast(int val){
      Node node = new Node(val);
      if(head == null){
        head = node;
        return;
      }
      Node temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = node;
    }

    //delete first
    void deleteFirst(){
      if(head == null){
        return;
      }
      head = head.next;
    }

    //delete last
    void deleteLast(){
      if(head == null){
        return;
      }
      if(head.next == null){
        head = null;
        return;
      }

      Node temp = head;
      while(temp.next.next != null){
        temp = temp.next;        
      }
      temp.next = null;
    }

    //reverse LL
    void reverse(){
      Node prev = null;
      Node curr = head;

      while(curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;        
      }
      head = prev;
    }

    //print-alternate-node
    void printAlternate(){
      Node temp = head;
      while(temp != null){
        System.out.print(temp.data + " ");

        if(temp.next != null){
          temp = temp.next.next;
        }
        else{break;}
      }
      System.out.println();
    }

    //print list
    void print(){
      Node temp = head;
      while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
      }
      System.out.println("null");
    }
  }
  public static void main(String[] args){
    SinglyLinkedList list = new SinglyLinkedList();

        // Add Elements
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        list.addLast(40);
        list.addLast(50);

        System.out.println("Original Linked List:");
        list.print();

        // Delete First
        list.deleteFirst();

        System.out.println("After Deleting First:");
        list.print();

        // Delete Last
        list.deleteLast();

        System.out.println("After Deleting Last:");
        list.print();

        // Reverse
        list.reverse();

        System.out.println("After Reversing:");
        list.print();

        // Alternate Elements
        System.out.println("Alternate Elements:");
        list.printAlternate();    
  }
}
