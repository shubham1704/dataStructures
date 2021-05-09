package com.practice.algorithm.searching;

/**
 * We search the element by visiting every element in the array
 */

public class LinearSearch {

  public static void main(String[] args) {
    int[] arr = {10, 23, 15, 8, 4, 3, 25, 30, 34, 2, 19};
    int item = 3, flag = 0;
    for (int i = 0; i < 10; i++) {
      if (arr[i] == item) {
        flag = i + 1;
        break;
      } else {
        flag = 0;
      }
    }
    if (flag != 0) {
      System.out.println("Item found at location" + flag);
    } else {
      System.out.println("Item not found");
    }
  }
}
