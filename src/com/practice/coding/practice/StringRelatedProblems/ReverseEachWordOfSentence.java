package com.practice.coding.practice.StringRelatedProblems;

import java.util.Arrays;

/**
 * Reverse the below
 * Hi I am from SAP
 * iH I ma mrof PAS
 */

public class ReverseEachWordOfSentence {

  public static void main(String[] args) {

    String s = "           ";

    //Using Map
    //This won't work with empty String having spaces
    System.out.println("***********Using Map******************");
    Arrays.stream(s.strip().split(" ")).map(i -> {
      if (!i.isBlank()){
      StringBuilder sb = new StringBuilder(i);
      sb.reverse();
      return sb.append(" ");}
      else
        return "";
    }).forEach(System.out::print);
    System.out.println();

    //Without Mapping
    //This is working in every condition
    System.out.println("***************Without Using Map********************");
    Arrays.stream(s.strip().split(" ")).forEach(i -> {
      if (!i.isBlank()){
      StringBuilder sb = new StringBuilder(i);
      sb.reverse();
      System.out.print(sb.length() + " ");}
    });
  }
}
