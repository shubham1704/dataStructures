package com.practice.java9Features;

interface A {

  private void somePrivateMethod(){
    System.out.println("printing inside private method");

  }

  default void getPrivateMethod(){
    somePrivateMethod();
  }

}

public class PrivateMethodsInInterfaces implements A {

  public static void main(String[] args) {
    new PrivateMethodsInInterfaces().getPrivateMethod();
  }
}