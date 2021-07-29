package com.practice.coding.practice.string;

import java.util.Arrays;

public class RemoveSpaces {

  public static void main(String[] args) {
    String s = "   geeks   for geeks";
    System.out.println(removeSpaces(s));
  }

  static String removeSpaces(String s) {
    s = Arrays.stream(s.strip().split(" ")).filter(x -> !x.equals(" ")).collect(java.util.stream.Collectors.joining());
    return s;
  }
}
