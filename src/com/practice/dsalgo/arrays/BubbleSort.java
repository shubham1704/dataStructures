
/**
 * Compare two adjacent element till the end of the length of array in every Iteration
 * Then swap both element if the right element is bigger than left..
 */

package com.practice.dsalgo.arrays;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int a[] = {-3, 0, 1, 2, 5, 544};
    int a2[] = {3, 67, -1, 45, 12, 0, 1};
    int temp;
    int countJ = 0;
    boolean sorted = false;

    for (int i = 0; i < a.length - 1; i++) {
      sorted = true;
      for (int j = 0; j < a.length - 1 - i; j++) {
        countJ++;
        if (a[j] > a[j + 1]) {
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          sorted = false; // in case the array has already been sorted then we don't have to come back to check the elements
        }
      }
      if (sorted) {
        break;
      }
    }

    Arrays.stream(a).forEach(x -> System.out.print(x + " "));
    System.out.println();

    System.out.println("\nCount of J = " + countJ);
  }
}
