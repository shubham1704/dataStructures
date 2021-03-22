package com.practice.dsalgo.listdatastructure.linkedList;

/**
 * Here we are creating our own linked List with few functionality like add and print the element of the list
 */
public class CustomizedLinkedList {

  Node head;

  public void add(int data){
    Node toadd = new Node(data);

    if (isEmpty()){
      head = toadd;
      return;
    }

    Node temp = head;

    while (temp.next != null){
      temp = temp.next;
    }
    temp.next = toadd;
  }

  boolean isEmpty(){
    return head == null;
  }

  public void print(){
    Node temp = head;
    System.out.print("[");
    while (temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.print("]");
  }

  static class Node{
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  /**
   * Calling the functionality of our linked List
   * @param args
   */

  public static void main(String[] args) {
    CustomizedLinkedList linkedList = new CustomizedLinkedList();
    for (int i=0; i<10; i++) {
      linkedList.add(i);
    }

    linkedList.print();

  }
}


