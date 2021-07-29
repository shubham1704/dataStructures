package com.practice.coding.practice.string;

/**
 * Given a string, the task is to count all palindromic sub-strings present in it.
 * Input
 * N = 5
 * str = "abaab"
 * Output
 * 3
 * Explanation:
 * All palindrome substring are : "aba" , "aa" , "baab"
 */

public class CountAllPalindrome {

  public static void main(String[] args) {
    String s = "abbaeae";
    System.out.println(CountPS(s, s.length()));
  }

  static public int CountPS(String s, int n) {
    int result = 0;
    boolean b;
    for (int i = 0; i < n - 1; i++) {
      b = false;
      for (int j = i + 1; j < n; j++) {
        b = findPalindrome(s, i, j);
        if (b) {
          result++;
        }
      }
    }
    return result;
  }

  static boolean findPalindrome(String s, int q1, int q2) {
    StringBuilder s2 = new StringBuilder(s.substring(q1, q2 + 1));

    if (s2.toString().equals(s2.reverse().toString())) {
      return true;
    } else {
      return false;
    }
  }
}
