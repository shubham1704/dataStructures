package com.practice.coding.practice;

/**
 * Print the diamond pattern
       *
      ***
     *****
    *******
   *********
  ***********
   *********
    *******
     *****
      ***
       *
 *
 */

public class DiamondPattern {

  public static void main(String[] args) {
    int n=6;
    for (int i=1; i<=n; i++){
      for (int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for (int k=1; k<=i*2-1; k++){
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i=n-1; i>=1; i--){
      for (int j=i; j<n; j++){
        System.out.print(" ");
      }
      for (int k=1; k<=i*2-1; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
