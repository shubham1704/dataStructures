package com.practice.dsalgo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find the subarray from an array whose sum is max
 * Ex --> a = [-3, 2, 4, -1, 2, -5, -2]
 * O/p --> 7
 * Subarray can only contain contiguous element, that means [-3, 2, -5] is not a Subarray of the above array
 */

public class FindLargestSumSubArray {

  public static void main(String[] args) {

    int a[] = {-3, 2, 4, -1, 2, 3, -2};
    System.out.println(findLargestSumSubArray(a)); // Not a Optimised Solution
    System.out.println(findSumWithArrayPreprocessing(a)); //Better than the above but not best
    System.out.println(findSumUsingKadensAlgorithm(a)); //
  }

  /**
   * In This Solution we are trying to find all the subarray which will be (n(n+1))/2
   * After finding each subarray we will iterate from i to j to find the sum of the subarray
   * after finding the sum if that is greater than max then store it and at last we will find the max sum of a subarray
   * This Solution has worst Case Time complexity as O(n^3)
   * And this Solution Can be solved by array Preprocessing
   *
   * @param a
   *
   * @return
   */

  public static int findLargestSumSubArray(int a[]) {
    int n = a.length;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int currentSubArraySum = 0;
        for (int k = i; k < j; k++) {
          currentSubArraySum += a[k];
        }
        if (currentSubArraySum > max) {
          max = currentSubArraySum;
        }
      }
    }

    return max;
  }

  /**
   * In This solution we are creating a preprocessing array which will store the sum of the array
   * the array sum[] will have the sum of --> sum[i-1]+a[i] that means it will add up the array element with it's previous element's sums
   * after getting the sum[] array we can count the current sum of a sub array by using --> sum[j]-sum[i] + a[i]
   * This will give us the current sum and then we will compare if it is greater than max then we will store the current sum in max
   * This solution is still not optimised and have the time Complexity as O(n^2)
   * We can still further optimise it
   *
   * @param a
   *
   * @return
   */

  public static int findSumWithArrayPreprocessing(int a[]) {
    int n = a.length;
    int max = Integer.MIN_VALUE;
    int sum[] = new int[n];
    sum[0] = a[0];

    for (int i = 1; i < n; i++) {
      sum[i] = a[i] + sum[i - 1];
    }
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int currentSubArraySum = sum[j] - sum[i] + a[i];

        if (currentSubArraySum > max) {
          max = currentSubArraySum;
        }
      }
    }
    return max;
  }

  /**
   * This algoithm can solve this question in O(n) times
   *
   * @param a
   *
   * @return
   */

  public static int findSumUsingKadensAlgorithm(int a[]) {
    int n = a.length;
    int max = Integer.MIN_VALUE;
    int currSum = 0;
    for (int i = 0; i < n; i++) {
      currSum += a[i];

      if (currSum > max) {
        max = currSum;
      }

      if (currSum < 0) {
        currSum = 0;
      }
    }
    return max;
  }
}

class findMaxSum {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35);
    ArrayList<Integer> a = new ArrayList<>();
    a.addAll(list);
    System.out.println(findSum(a, 10));
  }

  static int findSum(ArrayList<Integer> a, int b) {
    int n = a.size();
    int maxSum = Integer.MIN_VALUE;
    int currentsum = 0;
    if (n == 0) {
      return 0;
    }
    for (int i = 0; i < n; i++) {
      int j = 0;
      currentsum = 0;
      while (j <= b - i-1) {
        currentsum += a.get(j);
        j++;
      }
      int count = b-j;
      while (count > 0) {
        currentsum += a.get(n-count);
        count--;
      }
      if (maxSum < currentsum) {
        maxSum = currentsum;
      }
    }
    return maxSum;
  }
}
