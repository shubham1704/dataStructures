package com.practice.dsalgo.listdatastructure.stack;

import com.practice.dsalgo.listdatastructure.linkedList.CustomizedLinkedList;

import java.util.Stack;

public class MyStackUsingLinkedList<E> {

  protected int elementCount;

  private CustomizedLinkedList<E> myLl = new CustomizedLinkedList<>();

  Stack<Integer> stack = new Stack<>();

  public void push(E element) {
    myLl.add(element);
    elementCount++;
  }

  public E pop() throws Exception {
    if (myLl.isEmpty()) {
      throw new Exception("Can not pop element from empty Stack");
    }
    E e = myLl.removeLastElement();
    elementCount--;
    return e;
  }

  public E peek() throws Exception {
    if (myLl.isEmpty()) {
      throw new Exception("Can not peek element from empty Stack");
    }
    return myLl.getLastElement();
  }

  public boolean isEmpty(){
    return elementCount == 0;
  }

//  public static void main(String[] args) throws Exception {
//    MyStackUsingLinkedList<Integer> stack = new MyStackUsingLinkedList<>();
//
//
//
//      System.out.println(stack.pop());
//      System.out.println(stack.peek());
//
//
//  }
}
