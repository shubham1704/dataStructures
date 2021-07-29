package com.practice.dsalgo.listdatastructure.stack;

import java.util.Stack;

/**
 * Check if the paranthesis are balanced in a given string or not
 * For Ex --> {}{{}}}}{{}{}{}}{{(()([]][][]][][]}}
 * O/P --> Not A balanced string
 */

public class CheckForBalancedBracketsInString {

  public static void main(String[] args) throws Exception {

    String s = "{}}";
    System.out.println(checkBalancedString(s));
  }

  public static boolean checkBalancedString(String x) throws Exception {
    boolean ans = true;
    int n = x.length();
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      if (x.charAt(i) == '{' || x.charAt(i) == '(' || x.charAt(i) == '[') {
        stack.push(x.charAt(i));
        continue;
      }
      if (stack.isEmpty()) {
        ans = false;
        break;
      }
      if (x.charAt(i) == '}') {
        if (stack.peek() == '{') {
          stack.pop();
        } else {
          ans = false;
          break;
        }
      }
      if (x.charAt(i) == ')') {
        if (stack.peek() == '(') {
          stack.pop();
        } else {
          ans = false;
          break;
        }
      }

      if (x.charAt(i) == ']') {
        if (stack.peek() == '[') {
          stack.pop();
        } else {
          ans = false;
          break;
        }
      }
    }
    if (!stack.isEmpty()) {
      return false;
    }
    return ans;
  }
}
