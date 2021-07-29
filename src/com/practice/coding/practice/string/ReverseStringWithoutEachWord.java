package com.practice.coding.practice.string;

public class ReverseStringWithoutEachWord {

  public static void main(String[] args) {
    System.out.println(reverseWords("i.like.this.program.very.much"));
  }

  static String reverseWords(String S) {
    String []s = S.split("\\.");
    StringBuilder sb = new StringBuilder();
    for (int i=s.length-1; i>=0; i--){
      sb.append(s[i]);
      sb.append(".");
    }
    sb.deleteCharAt(sb.length()-1);
    return sb.toString();
  }
}
