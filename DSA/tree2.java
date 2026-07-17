import java.util.*;

public class tree2{
  //Node class
  static class Node{
    int data;
    Node left, right;
    Node(int data){
      this.data = data;
    }
  }

  //count leaf nodes
  static int countLeaves(Node root){
    if(root == null){
      return 0;
    }
    if(root.left == null && root.right == null){
      return 1;
    }
    return countLeaves(root.left) + countLeaves(root.right);
  }

  //count internal nodes
  static int countInternal(Node root){
    if(root == null){
      return 0;
    }
    if(root.left == null && root.right == null){
      return 0;
    }
    return 1 + countInternal(root.left) + countInternal(root.right);
  }

  //mirror tree
  static void mirror(Node root){
    if(root == null){
      return;
    }
    Node temp = root.left;
    root.left = root.right;
    root.right = temp;

    mirror(root.left);
    mirror(root.right);
  }

  //identical trees
  static boolean identical(Node a, Node b){
    if(a == null && b == null){
      return true;
    }
    if (a == null || b == null){
      return false;
    }
    return a.data == b.data && identical(a.left, b.left) && identical(a.right, b.right);
  }

  //diameter
  static int diameter = 0;

  static int height(Node root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }

   static int diameter(Node root) {
        diameter = 0;
        height(root);
        return diameter;
    }
}
