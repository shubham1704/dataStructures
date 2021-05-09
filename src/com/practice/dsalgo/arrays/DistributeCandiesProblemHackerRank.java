package com.practice.dsalgo.arrays;

/**
 * Video 36 of Apni Kaksha youtube
 */

import java.util.Arrays;

public class DistributeCandiesProblemHackerRank {

  public static void main(String[] args) {

    int a[] = {1,2,4,3,5,1};
    System.out.println(candies(6, a));

  }

  public static long candies(int n, int a[]) {
    int c[] = new int[n];
    Arrays.fill(c, 1);
    long sum = 0;

    for (int i = 1; i < n; i++) {
      if (a[i] > a[i - 1]) {
        c[i] = c[i - 1] + 1;
      }
    }

    for (int i = n - 2; i >= 0; i--) {
      if (a[i] > a[i + 1]) {
        c[i] = Math.max(c[i], c[i + 1] + 1);
      }
    }

    sum = Arrays.stream(c).sum();
//    for (int i = 0; i > n; i++) {
//      sum = sum + (long)c[i];
//    }

    return sum;
  }
}
