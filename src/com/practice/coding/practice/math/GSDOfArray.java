package com.practice.coding.practice.math;

import java.util.Arrays;

public class GSDOfArray {

  public static void main(String[] args) {
    int a[] = {16,15};
    System.out.println(gcd(a.length, a));
  }

  public static int gcd(int n , int a[])
  {
    if (n==0)
      return 0;
    if (n == 1){
      return a[0];
    }
    Arrays.sort(a);
    int result = 0;
    for(int i=0; i<n; i++){
      result = gcd(result, a[i]);
      if(result == 1){
        return 1;
      }
    }
    return result;

  }

  static int gcd(int a, int b)
  {
    if (a == 0)
      return b;
    return gcd(b % a, a);
  }

}
