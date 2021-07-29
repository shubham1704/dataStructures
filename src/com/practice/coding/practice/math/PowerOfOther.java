package com.practice.coding.practice.math;

public class PowerOfOther {

  public static void main(String[] args) {
    System.out.println(isPowerOfAnother(10L, 101L));
  }

  static int isPowerOfAnother(Long X, Long Y){
    if(X*X == Y){
      return 1;
    }
    if(Y%X != 0 || Y/2<X || X==1){
      return 0;
    }
    return isPowerOfAnother(X, Y/X);
  }

}
