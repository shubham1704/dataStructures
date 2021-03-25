package com.practice.algorithm.recursion.advanceRecursion;

public class FloodFillInMatrix {

  public static void main(String[] args) {

  }

  public static void floodFill(int a[][], int r, int c, int toFill, int prevfill){

    int rows = a.length;
    int column = a[0].length;

    if (r<0 || r>= rows || c<0 || c>= column){
      return;
    }

    if (a[r][c] != prevfill){
      return;
    }
    a[r][c] = toFill;

    // Now fill the integer to right left, top, bottom with recursive call

  }

}
