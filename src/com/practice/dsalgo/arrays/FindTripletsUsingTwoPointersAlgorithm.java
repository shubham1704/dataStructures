package com.practice.dsalgo.arrays;

import java.util.Arrays;

/**
 * Find Triplets in the array whose some is 0
 * Ex --> [-1, 1, 0, -4, 4]
 * here the triplets are [-1, 1, 0] and [0, -4, 4]
 * write a function that returns true if triplets found in the array and then prin '1' else print '0'
 * The complexity of the below code is O(n2) --> n square
 */
public class FindTripletsUsingTwoPointersAlgorithm {

  public static void main(String[] args) {
    int a[] = {8, -1, -4, 90, 1, 6, 2};
    if (findTriplets(a, a.length)) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  public static boolean findTriplets(int a[], int n) {

    Arrays.sort(a);
    for (int i = 0; i < n - 2; i++) {
      if (findTwoSumUsingTwoPointers(a, i + 1, -a[i])) {
        System.out.println(a[i]);
        return true;
      }
    }
    return false;
  }

  /**
   * This algorithm will take the sored array and will find the two element whose sum is equal to x and to find it it just uses complexity O(n)
   * @param a will take the remaining array from which we need to find the element whose sum is equal to x
   * @param i index of the array from where we have to start searching
   * @param x the sum which two element of the array is equal to
   * @return
   */

  public static boolean findTwoSumUsingTwoPointers(int a[], int i, int x) {
    int j = a.length - 1;

    while (i < j) {
      if (a[i] + a[j] > x) {
        j--;
      } else if (a[i] + a[j] < x) {
        i++;
      } else {
        System.out.println(a[i] + " " + a[j]);
        return true;
      }
    }

    return false;
  }
}
