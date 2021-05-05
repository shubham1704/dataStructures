package com.practice.dsalgo.arrays;

public class FindDistanceBetweenTwoElementOfArray {

  public static void main(String[] args) {

    int a[] = {1, 6, 31, 9, 4, 3, 2, 7, 8};
    System.out.println(minDistanceBetweenTwoElementsInArray(a, a.length, 6, 8));
  }

  public static int minDistanceBetweenTwoElementsInArray(int a[], int n, int x, int y) {
    int ans = -1;
    int indexOfX = 0;
    int indexOfY = 0;

    for (int i = 0; i < n; i++) {
      if (a[i] == x) {
        indexOfX = i + 1;
      }
      if (indexOfX > 0 && a[i] == y) {
        indexOfY = i;
        break;
      }
    }

    if (indexOfX - 1 < indexOfY) {
      ans = (indexOfY - indexOfX - 1 - 1) > 0 ? (indexOfY - indexOfX - 1 - 1) : 1;
    }
    return ans;
  }
}
