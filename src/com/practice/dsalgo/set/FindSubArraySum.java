package com.practice.dsalgo.set;

import java.util.HashSet;
import java.util.Set;

/**
 * We are Going to solve two types of problem
 * Problem 1 --> Given a set of n integer. you have to find if the array of any subset is equal to 0
 * Ex = {1,3,0,-4, 5, -2}
 * o/p =  true
 * Problem 2 --> Given a set of n integer. you have to find if the array of any subset is equal to k
 * Ex = {1, 4, -3, -1, 7, 23, 6, 12, -2}
 * k = 9
 * o/p = true
 */

public class FindSubArraySum {

  public static void main(String[] args) {
    int a[] = {1, 3, 25, -46, 5, -2};
    System.out.println(findSubArrayWithSumZeroWithBruthForce(a));

    int b[] = {3, 4, -1, 4, 3, -6, 7, 2};
    System.out.println(findSumUsingSet(b));
    System.out.println(findSubArraySumK(a, 4));
  }

  /**
   * We can Solve the problem using Brut Force where the Time Complexity will be O(n)
   * We have to traverse the array length and then for each i we will get the sum of j index
   */

  public static boolean findSubArrayWithSumZeroWithBruthForce(int a[]) {
    boolean found = false;
    int n = a.length;

    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += a[j];
        if (sum == 0) {
          found = true;
          break;
        }
        if (found) {
          break;
        }
      }
    }
    return found;
  }

  /**
   * We can solve the sum zero problem using Set with Time Complexity O(n)
   * We have to find if the same sum of any subarray is already present in the Set
   * The logic behind finding the same subset of sum is -->
   * if any subset from any index i to j is zero then the (x = (sum from 0-i)) ==  (y = (sum from 0 to j))
   * Example --> {3, 4, -1, 4, 3, -6, -7, 2}
   * Explanation --> sum of index 2 to 5 is = 0
   * then sum of (0 to 2) --> (7) = sum of (0-5) --> (7)
   */

  public static boolean findSumUsingSet(int a[]) {
    boolean found = false;
    int sum = 0;
    Set<Integer> set = new HashSet<>();
    for (int element : a) {
      set.add(element);
      sum += element;
      if (set.contains(sum)) {
        found = true;
        break;
      }
    }
    return found;
  }

  /**
   * If the sum = k
   * then we have to find if sum y-k = x is already present in the Set
   * where x = sum of any subarray
   * y = sum of any sub array
   * if given k = 10 and we found x = 5, y = 20 then y-k = x that means there is a subset which sum is equal to k
   */

  public static boolean findSubArraySumK(int a[], int k) {
    boolean found = false;
    int sum = 0;
    Set<Integer> set = new HashSet<>();
    for (int element : a) {
      set.add(element);
      sum += element;
      if (set.contains(sum - k)) {
        found = true;
        break;
      }
    }

    return found;
  }
}
