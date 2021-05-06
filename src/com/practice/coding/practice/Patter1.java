package com.practice.coding.practice;

/**
 * Print the below pattern
 *      1
 *    121
 *  12321
 *1234321
 */

public class Patter1 {

  public static void main(String[] args) {

    int n = 4;

    for (int i=1; i<=n; i++){
      for (int j=1; j<=n*2-i*2; j++){
        System.out.print(" ");
      }
      int t=1;
      for (int k=1; k<=i*2-1; k++){
        if (k <= i) {
          System.out.print(t);
          if(k!=i)t++;
        }
        else {
          System.out.print(--t);
          continue;
        }

      }
      System.out.println();
    }

  }

}
