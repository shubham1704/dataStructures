package com.practice.dsalgo.listdatastructure.stack;

/**
 * Check if the paranthesis are balanced in a given string or not
 * For Ex --> {}{{}}}}{{}{}{}}{{(()([]][][]][][]}}
 * O/P --> Not A balanced string
 */

public class CheckForBalancedBracketsInString {

  public static void main(String[] args) throws Exception {

    String s = "{[({}{}))()())((()()[])]}}";
    System.out.println(checkBalancedString(s, s.length()));
  }

  public static String checkBalancedString(String s, int n) throws Exception {
    String ans = "Not Balanced";
    MyStackUsingLinkedList<Character> stack = new MyStackUsingLinkedList<>();
    char openpara = '{';
    char parenthesis = '}';
    char braces = ')';
    char bracket = ']';
    char openbraces = '(';
    char openbracket = '[';
    if (s.charAt(0) == parenthesis || s.charAt(0) == braces || s.charAt(0) == bracket) {
      return ans;
    }
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == openbracket) {
        stack.push(s.charAt(i));
        continue;
      }
      if (s.charAt(i) == openpara){
        stack.push(s.charAt(i));
        continue;
      }
      if (s.charAt(i) == openbraces){
        stack.push(s.charAt(i));
        continue;
      }
      if (s.charAt(i) == parenthesis) {
        if (!stack.isEmpty() && stack.peek() == '{') {
          stack.pop();
        }else {
          stack.push(s.charAt(i));
        }
      }
      if (s.charAt(i) == braces) {
        if (!stack.isEmpty() && stack.peek() == '(') {
          stack.pop();
        }else {
          stack.push(s.charAt(i));
        }
      }
      if (s.charAt(i) == bracket) {
        if (!stack.isEmpty() && stack.peek() == '[') {
          stack.pop();
        }else {
          stack.push(s.charAt(i));
        }
      }
    }
    if (stack.isEmpty()) {
      return "Balanced";
    }
    return ans;
  }
}
