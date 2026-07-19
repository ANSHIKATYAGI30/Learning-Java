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

    // SEARCH
    static boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);

        return search(root.right, key);
    }
  
    // FIND MIN
    static int minimum(Node root) {

        while (root.left != null)
            root = root.left;

        return root.data;
    }
  
    // FIND MAX
    static int maximum(Node root) {

        while (root.right != null)
            root = root.right;

        return root.data;
    }
