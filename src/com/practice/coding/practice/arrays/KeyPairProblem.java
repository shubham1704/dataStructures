package com.practice.coding.practice.arrays;

import java.util.Arrays;

/**
 * Given an array Arr of N positive integers and another number X.
 * Determine whether or not there exist two elements in Arr whose sum is exactly X.
 * Input:
 * N = 6, X = 16
 * Arr[] = {1, 4, 45, 6, 10, 8}
 * Output: Yes
 */

public class KeyPairProblem {

  public static void main(String[] args) {
    int a[] = {1, 4, 45, 6, 10, 8};
    System.out.println(hasArrayTwoCandidates(a, a.length, 16));
  }

  static boolean hasArrayTwoCandidates(int a[], int n, int x) {
    int i=0;
    int j = n-1;
    Arrays.sort(a);
    while(i<j) {
      if (a[i] + a[j] > x) {
        j--;
      } else if (a[i] + a[j] < x) {
        i++;
      } else
        return true;
    }

      return false;
    }
  }
