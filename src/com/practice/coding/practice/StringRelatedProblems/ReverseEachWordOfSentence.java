package com.practice.coding.practice.StringRelatedProblems;

import java.util.Arrays;

/**
 * Reverse the below
 * Hi I am from SAP
 * iH I ma mrof PAS
 */

public class ReverseEachWordOfSentence {

  public static void main(String[] args) {

    String s = "Hi I am from SAP";

    //Using Map
    Arrays.stream(s.split(" ")).map(i -> {
      StringBuilder sb = new StringBuilder(i);
      sb.reverse();
      return sb.append(" ");
    }).forEach(System.out::print);

    //Without Mapping
    Arrays.stream(s.split(" ")).forEach(i -> {
      StringBuilder sb = new StringBuilder(i);
      sb.reverse();
      System.out.print(sb + " ");
    });
  }
}
