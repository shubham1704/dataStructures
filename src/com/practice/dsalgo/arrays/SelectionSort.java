package com.practice.dsalgo.arrays;

/**
 * Selection sort we select the minimum element at every iteration of inner loop
 * then once we find that we swap it with the correct location of it
 */

public class SelectionSort {

  public static void main(String[] args) {

    int a[] = {23, 9, -1, 5, 1, 0};
    int min;
    int temp;

    for (int i = 0; i < a.length - 1; i++) {
      min = i;
      for (int j = i; j < a.length; j++) {
        if (a[min] > a[j]) {
          min = j;
        }
      }
      temp = a[i];
      a[i] = a[min];
      a[min] = temp;
    }

    for (int ar : a) {
      System.out.print(ar + ", ");
    }
  }
}
