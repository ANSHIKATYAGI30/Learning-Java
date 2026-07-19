import java.util.*;

public class binaryTree{
  
    // Node Structure
    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
}
  
    // INSERT
    static Node insert(Node root, int val) {

        if (root == null){
          return new Node(val);
        }
        if (val < root.data){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

