package com.practice.question_asked_in_Interview;

/**
 * Given an Array of Integer can be +ve or -ve. You have to find the farthest number from 0.
 * If there are multiple number far from zero then print the smallest one.
 * Ex -> A[] = {1, 3, -5, 5, 0, 1, 4}
 * O/P -> -5 Since there are two number farthest from zero (-5 and 5) so you have to print the minimum
 * A[] = {100, -805, 10 -20}
 * O/P -> -805
 */


public class FindFarthestFromZero {

  public static void main(String[] args) {
    int[] a = {1, 3, -5, 5, 0, 1, 4, 100, -100};
    System.out.println(findFarthest(a));
  }

  static int findFarthest(int[] a){
    int n = a.length;
    int result =0;
    boolean negative = false;
    for (int i=0; i<n; i++){
      if (a[i]<0 && result <= -a[i]){
        result = -a[i];
        negative = true;
      }
      else if (result < a[i]){
        result = a[i];
        negative = false;
      }
    }

    if (negative)
      result = result*-1;
    return result;

  }

}
