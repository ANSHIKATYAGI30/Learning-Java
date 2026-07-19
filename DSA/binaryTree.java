import java.util.*;

public class binaryTree {
  
    // Node
    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // INSERT
    static Node insert(Node root, int val) {

        if (root == null)
            return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);

        else
            root.right = insert(root.right, val);

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

    // POSTORDER
    static void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // =====================================================
    // LEVEL ORDER
    // =====================================================

    static void levelOrder(Node root) {

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

    // =====================================================
    // VALID BST
    // =====================================================

    static boolean isBST(Node root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean check(Node root, long min, long max) {

        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return check(root.left, min, root.data) &&
                check(root.right, root.data, max);
    }

    // =====================================================
    // KTH SMALLEST
    // =====================================================

    static int count = 0;

    static int kthSmallest(Node root, int k) {
        if (root == null)
            return -1;

        int left = kthSmallest(root.left, k);

        if (left != -1)
            return left;

        count++;

        if (count == k)
            return root.data;

        return kthSmallest(root.right, k);
    }

    // =====================================================
    // KTH LARGEST
    // =====================================================

    static int kthLargest(Node root, int k) {
        if (root == null)
            return -1;

        int right = kthLargest(root.right, k);

        if (right != -1)
            return right;

        count++;

        if (count == k)
            return root.data;

        return kthLargest(root.left, k);
    }

    // =====================================================
    // LCA
    // =====================================================

    static Node LCA(Node root, int a, int b) {
        while (root != null) {

            if (a < root.data && b < root.data)
                root = root.left;

            else if (a > root.data && b > root.data)
                root = root.right;

            else
                return root;
        }

        return null;
    }

    // =====================================================
    // FLOOR
    // =====================================================

    static Integer floor(Node root, int key) {
        Integer ans = null;

        while (root != null) {
            if (root.data == key)
                return key;

            if (root.data > key)
                root = root.left;

            else {
                ans = root.data;
                root = root.right;
            }
        }
        return ans;
    }

    // =====================================================
    // CEIL
    // =====================================================

    static Integer ceil(Node root, int key) {
        Integer ans = null;
        while (root != null) {
            if (root.data == key)
                return key;

            if (root.data < key)
                root = root.right;

            else {
                ans = root.data;
                root = root.left;
            }
        }
        return ans;
    }

    // =====================================================
    // SUCCESSOR
    // =====================================================

    static Integer successor(Node root, int key) {
        Integer ans = null;
        while (root != null) {
            if (key < root.data) {
                ans = root.data;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return ans;
    }

    // =====================================================
    // PREDECESSOR
    // =====================================================

    static Integer predecessor(Node root, int key) {
        Integer ans = null;
        while (root != null) {
            if (key > root.data) {
                ans = root.data;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return ans;
    }

    // =====================================================
    // MAIN
    // =====================================================

    public static void main(String[] args) {
        Node root = null;

        int[] arr = {50,30,70,20,40,60,80};

        for(int x : arr)
            root = insert(root, x);

        System.out.print("Inorder : ");
        inorder(root);

        System.out.println("\nSearch 60 : " + search(root,60));

        System.out.println("Min : " + minimum(root));

        System.out.println("Max : " + maximum(root));

        System.out.println("BST : " + isBST(root));

        count=0;
        System.out.println("3rd Smallest : " + kthSmallest(root,3));

        count=0;
        System.out.println("2nd Largest : " + kthLargest(root,2));

        System.out.println("LCA(20,40) : " + LCA(root,20,40).data);

        System.out.println("Floor of 65 : " + floor(root,65));

        System.out.println("Ceil of 65 : " + ceil(root,65));

        System.out.println("Successor of 60 : " + successor(root,60));

        System.out.println("Predecessor of 60 : " + predecessor(root,60));

        root = delete(root,70);

        System.out.print("After Delete : ");
        inorder(root);
    }
}
