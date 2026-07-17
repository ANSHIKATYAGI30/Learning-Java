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
  
}
