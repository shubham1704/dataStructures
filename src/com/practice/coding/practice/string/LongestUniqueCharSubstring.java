package com.practice.coding.practice.string;

/**
 * Given a string you need to print the size of the longest possible substring that has exactly K unique characters.
 * If there is no possible substring then print -1.
 * Input:
 * S = "aabacbebebe", K = 3
 * Output: 7
 * Explanation: "cbebebe" is the longest
 * substring with K distinct characters.
 */

public class LongestUniqueCharSubstring {

  public static void main(String[] args) {
    System.out.println(longestkSubstr("aabacbebebe", 3));
  }

  /**
   * Try using a two-pointer approach. The right pointer moves till the number of unique characters are less than or equal to K.
   * As the unique characters exceed K,
   * the right pointer stops. Then, the left-pointer moves to exclude the minimum elements from the current window such that the
   * unique element again become equal to K.
   * @param s
   * @param k
   * @return
   */

  private static int longestkSubstr(String s, int k){

    int[] m = new int[128];
    int uniq = 0, i = 0, j = 0, res = 0, n = s.length();

    while (j < n) {
      // sliding the j-pointer till we have a valid substring
      while (j < n) {
        if (m[s.charAt(j)] == 0) uniq++;
        m[s.charAt(j)]++;
        // if the number of uniq characters increases k, we stop.
        if (uniq > k) break;
        j++;
      }

      // checking if the unique characters are equal to k or k + 1
      if (uniq >= k) res = Math.max(res, j - i);

      if (j == n) break;

      // sliding the i-pointer till we again get k unique characters in
      // the substring
      while (i < n) {
        if (m[s.charAt(i)] == 1) uniq--;
        m[s.charAt(i)]--;

        if (uniq == k) break;
        i++;
      }
      i++;
      j++;
    }
    if (res == 0) return -1;
    return res;
  }

}
