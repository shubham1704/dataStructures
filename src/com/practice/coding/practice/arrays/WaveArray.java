package com.practice.coding.practice.arrays;

/**
 * Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it.
 * In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
 * (considering the increasing lexicographical order).
 * Input:
 * n = 5
 * arr[] = {1,2,3,4,5}
 * Output: 2 1 4 3 5
 */

public class WaveArray {

  public static void main(String[] args) {
    int a[] = {1,2,3,4,5};
    convertToWave(a, a.length);
  }

  public static void convertToWave(int a[], int n){

    int out[] = new int[n];
    for (int i=0;i<n-1;i+=2){
      int temp = a[i];
      a[i] = a[i+1];
      a[i+1] = temp;
    }
//    if (n%2 != 0){
//      a[n-1] = a[n-1];
//    }
    for (int x : a){
      System.out.print(x);
    }

  }

}
