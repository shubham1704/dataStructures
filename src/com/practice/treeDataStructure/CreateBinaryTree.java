package com.practice.treeDataStructure;

import java.util.Scanner;

public class CreateBinaryTree {

  public static void main(String[] args) {
    Node root = createBinaryTree();

    inOrderTraversal(root);
    System.out.println();
    preOrderTraversal(root);
    System.out.println();
    postOrderTraversal(root);
  }

  static Scanner sc = new Scanner(System.in);

  public static Node createBinaryTree() {

    Node root;

    System.out.println("Enter data ");
    int data = sc.nextInt();

    if (data == -1) {
      return null;
    }

    root = new Node(data);

    System.out.println("Enter Left child of the node " + data);
    root.left = createBinaryTree();

    System.out.println("Enter Right child of the node " + data);
    root.right = createBinaryTree();

    return root;
  }

  /**
   * Follows LNR principle where L = Left, N = Node, R = Right
   * Here first we have to go to left (inorder(root.left)
   * Then Print (root.data)
   * Then Go to right node (inOrder(root.right))
   *
   * @param root
   */

  public static void inOrderTraversal(Node root) {
    if (root == null) {
      return;
    }

    inOrderTraversal(root.left);// Traverse Left
    System.out.print(root.data + " ");// Print Node
    inOrderTraversal(root.right);//Travers Right
  }

  /**
   * Follows NLR principle where L = Left, N = Node, R = Right
   * First Print (root.data)
   * Then we have to go to left (preorder(root.left)
   * Then Go to right node (preOrder(root.right))
   *
   * @param root
   */

  public static void preOrderTraversal(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");// Print Node
    preOrderTraversal(root.left);// Traverse Left
    preOrderTraversal(root.right);//Travers Right
  }

  /**
   * Follows LRN principle where L = Left, N = Node, R = Right
   * Here first we have to go to left (inorder(root.left)
   * Then Go to right node (inOrder(root.right))
   * Then Print (root.data)
   *
   * @param root
   */

  public static void postOrderTraversal(Node root) {
    if (root == null) {
      return;
    }

    postOrderTraversal(root.left); // Traverse Left
    postOrderTraversal(root.right); //Travers Right
    System.out.print(root.data + " "); // Print Node
  }

  public static class Node {

    Node left, right;
    int data;

    public Node(int data) {
      this.data = data;
    }
  }
}


