package com.practice;

public class RoughCopy {

}

/**
 * Linked List practice
 */
class Node<T>{
  T data;
  Node next;

  Node(T data){
    this.data = data;
    next = null;
  }
}

class MyLinkedList<T>{
  Node<T> head;

   void add(T data){
    Node<T> toAdd = new Node<>(data);
    if (isEmpty()){
      head = toAdd;
      return;
    }
    Node<T> temp = head;
    while (temp.next != null){
      temp = temp.next;
    }
    temp.next = toAdd;

  }

   T removeLastElement() throws Exception{
    if (isEmpty()){
      throw new Exception("Can't Remove from Empty List");
    }
    Node<T> temp = head;
    Node<T> toremove = null;

    if (temp.next == null){
      toremove = head;
      head = null;
      return toremove.data;
    }

    while (temp.next.next != null){
      temp = temp.next;
    }

    toremove = temp.next;

    temp.next = null;
    return toremove.data;

  }

  T getLastElement(){
     Node<T> temp = head;
     if (temp == null){
       return null;
     }

     while (temp.next != null){
       temp = temp.next;
     }

     return temp.data;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node<T> temp = head;
    if (temp == null){
      return "[]";
    }
    while (temp.next !=null){
      sb.append(temp.data);
      temp = temp.next;
      if (temp.next != null){
        sb.append(" ");
      }
    }
    return "["+sb.toString()+"]";
  }

  public boolean isEmpty() {
    return head == null;
  }

  public static void main(String[] args) throws Exception {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
    myLinkedList.add(12);
//    myLinkedList.add(14);
//    myLinkedList.add(345);
    System.out.println(myLinkedList);
    System.out.println("Get Last Element --> "+myLinkedList.getLastElement());
    System.out.println("Remove Last Element --> "+myLinkedList.removeLastElement());
  }

}