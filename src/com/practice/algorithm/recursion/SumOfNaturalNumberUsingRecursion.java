package com.practice.algorithm.recursion;

/**
 * Find Sum of N natural number
 */

public class SumOfNaturalNumberUsingRecursion {

  public static void main(String[] args) {
    System.out.println(findSum(5));
  }

  public static int findSum(int n) {

    if (n == 1) {
      return 1;
    }
    return n + findSum(n - 1);
  }
}
