package com.practice.coding.practice.list;

public class CheckListIsPalindromeOrNot {

  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.add(1);
    list.add(2);
    list.add(1);
    System.out.println(reverseList(list.head));

  }

  static boolean reverseList(Node head) {

    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    Node temp = head;
    Node prev = null;
    Node next = null;
    while (temp != null){
      sb.append(temp.data);
      next = temp.next;
      temp.next = prev;
      prev = temp;
      temp = next;
    }
    head = prev;
    while(prev.next != null){
      sb2.append(prev.data);
      prev = prev.next;
    }
    sb2.append(prev.data);
    System.out.println(" List1 -> "+sb+" List2 -> "+sb2);
    if (sb.toString().equals(sb2.toString())){
      return true;
    }
    return false;
  }

  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      next = null;
    }
  }


  static class MyLinkedList {

    Node head;

    void add(int data) {
      Node toAdd = new Node(data);

      if (head == null) {
        head = toAdd;
        return;
      }

      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = toAdd;
    }

    public void print() {
      Node temp = head;
      System.out.print("[");
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.print("]");
    }
  }
}
