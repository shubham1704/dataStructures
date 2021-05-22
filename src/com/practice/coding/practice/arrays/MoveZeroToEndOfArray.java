package com.practice.coding.practice.arrays;

import java.util.Arrays;

/**
 * Given an array arr[] of N positive integers.
 * Push all the zero’s of the given array to the right end of the array while maitaining the order of non-zero elements.
 * Input:
 * N = 5
 * Arr[] = {3, 5, 0, 0, 4}
 * Output: 3 5 4 0 0
 */

public class MoveZeroToEndOfArray {

  public static void main(String[] args) {
    int a[] = {0,0,0,0,8,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,5,9,0,0,0,0,0,0};
    pushZerosToEnd(a, a.length);
    pushZerosToEndBetterSolution(a, a.length);

  }

  /**
   * Not A good Solution
   * @param a
   * @param n
   */
  static void pushZerosToEnd(int a[], int n){

    int b[] = new int[n];
    int j = 0;
    for (int i=0; i<n; i++){
      if (a[i] != 0){
        b[j] = a[i];
        j++;
      }
    }
    for (int i=0; i<n; i++){
      a[i] = b[i];
    }
    Arrays.stream(a).forEach(System.out::print);
  }

  /**
   * Best Solution
   * @param arr
   * @param n
   */
  static void pushZerosToEndBetterSolution(int[] arr, int n) {
    int count =0;
    for (int i=0;i<n;i++){
      if(arr[i] !=0){
        int temp = arr[count];
        arr[count] = arr [i];
        arr[i] = temp;
        count++;
      }
    }
  }

}
