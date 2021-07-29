package com.practice.coding.practice.arrays;

/**
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 * Input:
 * N = 5
 * arr[]= {0 2 1 2 0}
 * Output:
 * 0 0 1 2 2
 */

public class Sort01And2 {

  public static void main(String[] args) {

    int a[] = {0, 0, 0, 0, 0};
    sort012(a, a.length);
  }

  public static void sort012(int a[], int n) {
    int count[] = new int[3];

    for (int i = 0; i < n; i++) {
      if (a[i] == 0) {
        count[0] += 1;
      }
      if (a[i] == 1) {
        count[1] += 1;
      }
      if (a[i] == 2) {
        count[2] += 1;
      }
    }

    int i = 0, j = 0;
    while (j < n) {
      if (count[0] > 0) {
        a[j] = 0;
        count[0] -= 1;
        j++;
        continue;
      }
      if (count[1] > 0) {
        a[j] = 1;
        count[1] -= 1;
        j++;
        continue;
      }
      if (count[2] > 0) {
        a[j] = 2;
        count[2] -= 1;
        j++;
      }
    }
    for (int b : a) {
      System.out.print(b);
    }
  }
}
