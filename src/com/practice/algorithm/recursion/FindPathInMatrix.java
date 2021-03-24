package com.practice.algorithm.recursion;

public class FindPathInMatrix {

  public static void main(String[] args) {

    System.out.println(path(4, 4));

  }

  public static int path(int r, int c){
    if (c == 1 || r == 1){
      return 1;
    }

    return path(r-1, c) + path(r, c-1);
  }

}
