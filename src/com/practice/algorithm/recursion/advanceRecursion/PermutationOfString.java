package com.practice.algorithm.recursion.advanceRecursion;

import java.util.HashSet;
import java.util.Set;

/**
 * We have to find the permutation of one string
 * Ex --> "abc"
 * O/p --> [abc, acb, bac, bca, cba, cab]
 * We will hold the 1st index and then will keep interchanging the rest of the string
 * then we will move the 1st index to right and then again do the same
 * after the recursion call we have to send the original string back hence again we have to interchange the string after the recursion method call
 * this will be a kind of backtracking algo as well
 */

public class PermutationOfString {

  private static Set<String> set = new HashSet<>();

  public static void main(String[] args) {

    findPermutation("abcc", 0, 3);

  }

  public static void findPermutation(String s, int l, int r){
    if (l == r){
      if (set.contains(s)){
        return;
      }
      set.add(s);
      System.out.println(s);
      return;
    }

    for (int i=l; i<=r; i++){
      s = interChangeString(s, l, i);
      findPermutation(s, l+1, r);
      s = interChangeString(s, l, i);
    }

  }

  public static String interChangeString(String s, int a, int b){

    char array[] = s.toCharArray();
    char temp = array[a];
    array[a] = array[b];
    array[b] = temp;

    return String.valueOf(array);
  }
}
