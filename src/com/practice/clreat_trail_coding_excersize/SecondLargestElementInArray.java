package com.practice.clreat_trail_coding_excersize;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a method to return the second largest element in an integer array passed as an input parameter.
 */

public class SecondLargestElementInArray {

  static int secondLargestElement(int[] a){
    int max = Arrays.stream(a).max().getAsInt();
    int secondMax = Arrays.stream(a).boxed().filter(x -> x != max).max(Comparator.naturalOrder()).get();
    return secondMax;
  }

  public static void main(String[] args) {
    int[] a = {23,5,456,456,3,4,2312,32423423,2344,234,23,23,423,423,23423,4,234,324,234,32,32,4,32};
    System.out.println(secondLargestElement(a));
  }

}
