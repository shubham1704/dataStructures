package com.practice.clreat_trail_coding_excersize;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * Write a method to reverse an integer array passed as an input parameter.
 */

public class ReverseIntegerArray {
  static int[] reverseArray(int[] a){
    int[] ar = IntStream.of(a).boxed().sorted(Comparator.reverseOrder()).mapToInt(x->x).toArray();
    return ar;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 7 ,8, 9, 0};
    int[] sorted = reverseArray(a);
    for (int b: sorted) {
      System.out.println(b);
    }
  }
}
