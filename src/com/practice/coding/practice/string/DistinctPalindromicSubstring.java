package com.practice.coding.practice.string;

import java.util.HashSet;
import java.util.Set;

public class DistinctPalindromicSubstring {


  public static void main(String[] args) {
    String s = "zhzdgakldebkunuybglyryxtflrsqjfkohhienbuswlyxokfzigqxtcwaehsbiamepjjbmcrombnjnnumvktnzuwgdvsnoejwsqe";
    System.out.println(palindromeSubStrs(s));

  }

  static int palindromeSubStrs(String s)
  {
    Set<String> set = new HashSet<>();
    int n = s.length();
    for (int i=0; i<n; i++){
      for (int j=i; j<n; j++){
        StringBuilder s2 = new StringBuilder(s.substring(i, j+1));

        if (s2.toString().equals(s2.reverse().toString())) {
          // System.out.println("String --> "+s2.toString()+" Reverse is --> "+s2.reverse().toString());
          set.add(s2.reverse().toString());
        }
      }
    }
    return set.size();
  }

   void findPalindrome(String s, int q1, int q2, Set<String> set){
    StringBuilder s2 = new StringBuilder(s.substring(q1, q2+1));

    if (s2.toString().equals(s2.reverse().toString())) {
     // System.out.println("String --> "+s2.toString()+" Reverse is --> "+s2.reverse().toString());
      set.add(s2.reverse().toString());
    }
  }

}
