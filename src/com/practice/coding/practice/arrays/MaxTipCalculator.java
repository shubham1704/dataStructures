package com.practice.coding.practice.arrays;

/**
 * https://practice.geeksforgeeks.org/problems/maximum-tip-calculator2631/1
 */

public class MaxTipCalculator {

  public static void main(String[] args) {

  }

  static long maxTip(int[] a, int[] b, int n, int x, int y) {

    int result = 0;
    for (int i=0; i<n; i++){
      if (a[i]> b[i]){

      }
      result += Math.max(a[i], b[i]);
    }
    return result;
  }
}
