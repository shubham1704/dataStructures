package com.practice.coding.practice.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of elements
 * in the intersection (or common elements) of the two arrays.
 *
 * For this question, the intersection of two arrays can be defined as the set containing distinct common
 * elements between the two arrays.
 *
 * Input:
 * n = 5, m = 3
 * a[] = {89, 24, 75, 11, 23}
 * b[] = {89, 2, 4}
 *
 * Output: 1
 *
 * Explanation:
 * 89 is the only element
 * in the intersection of two arrays.
 */

public class IntersectionOfArrays {

  public static void main(String[] args) {
    int a[] = {9, 1, 9, 1, 9, 1, 0};
    int b[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    NumberofElementsInIntersection(a, b, a.length, b.length);
  }

  public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
    Set<Integer> set = new HashSet<>();
    Set<Integer> set1 = new HashSet<>();
    for (int x : a) {
      set.add(x);
    }
    for (int x : b) {
      set1.add(x);
    }
    int in = set.stream().mapToInt(x -> { if (set1.contains(x)) { x = 1;return x; } return 0; }).sum();
    return in;
  }
}
