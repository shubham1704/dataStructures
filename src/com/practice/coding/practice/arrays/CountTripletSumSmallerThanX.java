package com.practice.coding.practice.arrays;

import java.util.Arrays;

/**
 * Given an array arr[] of distinct integers of size N and a sum value X,
 * the task is to find count of triplets with the sum smaller than the given sum value X.
 * Input: N = 4, X = 2
 * arr[] = {-2, 0, 1, 3}
 * Output:  2
 * Explanation: Below are triplets with
 * sum less than 2 (-2, 0, 1) and (-2, 0, 3).
 */

public class CountTripletSumSmallerThanX {

  public static void main(String[] args) {
    long a[] = {30, 8, 23 ,6 ,10 ,9 ,31 ,7 ,19 ,20 ,1 ,33, 21, 27, 28, 3, 25, 26};//{1 3 6 7 8 9 10 19 20 21 23 25 26 27 28 30 31 33}
    System.out.println(countTriplets(a, a.length, 86));
  }

  static long countTriplets(long a[], int n, int sum) {
    long result = 0;
    Arrays.sort(a);
    for (int i=0; i<n-2; i++){
      int j= i+1;
      int k = n-1;
      while (j<k){
        if (a[i] + a[j] + a[k] >= sum)
          k--;
        else
        {
          result += (k - j);
          j++;
        }
      }
    }
    return result;
  }
}
