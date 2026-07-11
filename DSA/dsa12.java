public class dsa12{
  public static void main(String[] args){
    Stack<Integer> st = new Stack<>();
    
    //add to stack
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);

    //peek 
    System.out.println(st.peek());

    //remove
    System.out.println(st.pop());

    //size
    System.out.println(st.size());
    
  }
}
