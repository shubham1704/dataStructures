package com.practice.coding.practice;

import com.sun.jdi.IntegerValue;

public class ConstructorOverloadingExample {

  public static void main(String[] args) {

//    A a1 = new A(.1);
    String s1 = "Something";
    String s3 = new String("Something");
    String s2 = "Something";
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s3));
    System.out.println((9+2)/2);
  }

}

class A{

  static int count = 0;

  A(float a){
    System.out.println("Float Constructor");
    System.out.println(++count);
  }
  A(double a){
    System.out.println("Double Constructor");
  }
  A(long a){
    System.out.println("Long Constructor");
    System.out.println(++count);
  }

  A(int a){
    System.out.println("Byte Constructor");
    System.out.println(++count);
  }


}
