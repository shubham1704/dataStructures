package com.practice.coding.practice;

/**
 * Write A Program for Below Pattern

        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9

 */

public class Pattern3 {

  public static void main(String[] args) {
    int n = 5;

    for (int i=1; i<=n; i++){
      for (int j=1; j<=n*2-i*2; j++){
        System.out.print(" ");
      }
      for (int k=1; k<=i*2-1; k++){
        System.out.print(k+" ");
      }
      System.out.println();
    }
  }

}
