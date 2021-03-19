package com.practice.dsalgo.string;

/**
 * Ex -> "The Sky is blue"
 * O/P -> "blue is sky The"
 */

public class ReverseStringWordByWord {

  public static void main(String[] args) {
    String input = "    The   Sky   is     blue    ";
    String out = reverseStringPerfectSolution(input);
    System.out.println(out);
    System.out.println(reverseStringWordByWord(input));
  }

  public static String reverseStringPerfectSolution(String string) {
    String ans = "";

    int i = string.length() - 1;
    while (i >= 0) {

      while (i >= 0 && string.charAt(i) == ' ') {
        i--;
      }

      int j = i;

      if (i < 0) {
        break;
      }

      while (i >= 0 && string.charAt(i) != ' ') {
        i--;
      }

      if (ans.isEmpty()) {
        ans = ans + (string.substring(i + 1, j + 1));
      } else {
        ans = ans + (" " + string.substring(i + 1, j + 1));
      }
    }

    return ans;
  }

  /**
   * This solution is printing the correct output but has problem with the spaces
   *
   * @param str
   *
   * @return
   */
  public static String reverseStringWordByWord(String str) {
    String out = "";
    boolean concat;
    int flag;
    for (int i = str.length() - 1; i >= 0; i--) {
      flag = 0;
      concat = false;
      for (int j = i; j >= 0; j--) {
        if (str.charAt(j) == ' ') {
          break;
        } else {
          concat = true;
          flag++;
        }
      }

      if (concat == true) {
        out = out + str.substring((i - flag - 1) > 0 ? (i - flag) : 0, i + 1);
        i = i - flag;
      }
    }
    return out;
  }
}
