package com.practice.dynamicProgramming;

import java.util.Arrays;

/**
 * Select Minimum number of coins to get a particular sum
 * For ex - Given denominations are [7, 5, 1] and find minimum coins whose sum is 18
 * o/p - 4
 * Explanation - We will select coins 7, 5, 5, 1 that means only 4 coins can give the sum 18
 */

public class SelectMinCoinToGetSum {

  public static void main(String[] args) {
    int n = 18;
    int a[] = {7,1,5};
    int dp[] = new int[n+1];
    Arrays.fill(dp, -1);
    dp[0] = 0;

    int result = selectCoin(n, a, dp);
    System.out.println(result);

  }

  /**
   * Dynamic Programming uses an extra space to store the solution of the problem which has already been solved
   * This problem will be solved by below technique
   * 18(7,5,1) --> will be divided into 11(7, 5, 1), 13(7, 5, 1), 17(7, 5, 1)
   * then each solution will again take 1 coin from the array and will be divided into 3 part
   * We will see there will be few sum that will occur multiple time in the tree, for which we might already have found the solution
   * Hence we will store in the Array dp[] and every time will check if the solution has already found for particular sum
   * Without using DP we can solve this problem in O(m^n)
   * Using DP this Problem is solved only in O(m*n) because we will not go to the problem which already has solved
   * @param sum
   * @param a
   * @param dp Using Extra Space here to store the solution of the problem which has already been solved by the recursion
   * @return
   */

  public static int selectCoin(int sum, int a[], int dp[]){
    if (sum == 0){
      return 0;
    }

    int ans = Integer.MAX_VALUE;

    for (int i=0; i<a.length; i++){
      if (sum - a[i] >= 0){
        int subAns = 0;
        if (dp[sum-a[i]] != -1){
          subAns = dp[sum-a[i]];
        }
        else
         subAns = selectCoin(sum - a[i], a, dp);

        if (subAns != Integer.MAX_VALUE && subAns+1 < ans){
          ans = subAns +1;
        }
      }

    }

    return ans;
  }

}
