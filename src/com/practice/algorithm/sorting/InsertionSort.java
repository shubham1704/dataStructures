package com.practice.algorithm.sorting;

public class InsertionSort {

  public static void main(String[] args) {
    int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
    for (int i = 1; i < a.length; i++) {
      int e = a[i];
      int j;
      for (j = i; j > 0 && a[j - 1] > e; j--) {
        a[j] = a[j - 1];
      }
      a[j] = e;
    }

    for (int b : a) {
      System.out.print(b + " ");
    }
  }
}
