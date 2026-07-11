//queue-operations
//"first in first out"

public class dsa13{
  public static void main(String[] args){
    Queue<Integer> queue = new ArrayDeque<>();
    
    //add
    queue.offer(10);
    queue.offer(20);
    queue.offer(80);
    queue.offer(120);
    queue.offer(180);

    //get the front element
    System.out.println(queue.peek());

    //remove element
    System.out.println(queue.remove());
    System.out.println(queue.peek());

    //size
    System.out.println(queue.size());
  }
}
