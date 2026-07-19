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

    // DELETE NODE
    static Node delete(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data)
            root.left = delete(root.left, key);

        else if (key > root.data)
            root.right = delete(root.right, key);

        else {
            // No child
            if (root.left == null && root.right == null)
                return null;

            // One child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Two children
            int min = minimum(root.right);
            root.data = min;
            root.right = delete(root.right, min);
        }
        return root;
    }

    // INORDER
    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    // PREORDER
    static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
