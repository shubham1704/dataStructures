package com.practice.algorithm.recursion.advanceRecursion;

/**
 * We have a given array of Coin
 * You have one partner playing with you
 * You can pick either left or right most element
 * Pick the coins that gives the maximum sum
 */

public class GameTheory {

  public static void main(String[] args) {

    int a[] = {1,5,7,3,2,4};
    System.out.println(maxCoinSelector(a, 0, a.length-1));
  }

  public static int maxCoinSelector(int a[], int l, int r){

    if (l+1 == r){
      return Math.max(a[l], a[r]);
    }

    return Math.max(a[l] + Math.min(maxCoinSelector(a, l+2, r), maxCoinSelector(a, l+1, r-1)),
                    a[r] + Math.min(maxCoinSelector(a, l+1, r-1), maxCoinSelector(a, l, r-2)));

  }

}
