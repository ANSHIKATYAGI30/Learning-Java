import java.util.*;

public class dsa16 {
    // Node Class
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    // Traversals
//------------------------------------------------------------------
    // Preorder
    static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder
    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder
    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    
    // Level Order Traversal
    static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null)
                q.offer(curr.left);

            if (curr.right != null)
                q.offer(curr.right);
        }
    }

    // Count Nodes
    static int countNodes(Node root) {
        if (root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

  
    // Sum of Nodes
    static int sum(Node root) {
        if (root == null)
            return 0;

        return root.data + sum(root.left) + sum(root.right);
    }

  
    // Height
    static int height(Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Maximum Element
    static int maximum(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    // Minimum Element
    static int minimum(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;

        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    // Search
    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return search(root.left, key) ||
                search(root.right, key);
    }
  
    // Main
    public static void main(String[] args) {

        /*
                    10
                   /  \
                  20   30
                 / \   / \
                40 50 60 70
        */

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println("Preorder:");
        preorder(root);

        System.out.println("\n");

        System.out.println("Inorder:");
        inorder(root);

        System.out.println("\n");

        System.out.println("Postorder:");
        postorder(root);

        System.out.println("\n");

        System.out.println("Level Order:");
        levelOrder(root);

        System.out.println("\n");

        System.out.println("Count Nodes: " + countNodes(root));

        System.out.println("Sum: " + sum(root));

        System.out.println("Height: " + height(root));

        System.out.println("Maximum: " + maximum(root));

        System.out.println("Minimum: " + minimum(root));

        System.out.println("Search 60: " + search(root, 60));

        System.out.println("Search 100: " + search(root, 100));
    }
}
