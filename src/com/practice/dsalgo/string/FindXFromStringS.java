package com.practice.dsalgo.string;

/**
 * Find the Index of substring from a given string
 */

public class FindXFromStringS {

  public static void main(String[] args) {
    String s = "GeeksForGeeks";
    System.out.println(findStr(s, "For"));
  }

  public static int findStr(String s, String x){
    int ans = -1;

    if (s.contains(x))
    return s.indexOf(x);

    return ans;
  }

}
