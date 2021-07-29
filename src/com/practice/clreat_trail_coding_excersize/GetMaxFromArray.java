package com.practice.clreat_trail_coding_excersize;

import java.util.Arrays;

/**
 * Write a method to return the maximum value from an integer array passed as an input parameter.
 */

public class GetMaxFromArray {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    System.out.println("Max Element is -> " + getMaxElement(a));
  }

  static int getMaxElement(int[] a) {
    return Arrays.stream(a).max().getAsInt();
  }
}
