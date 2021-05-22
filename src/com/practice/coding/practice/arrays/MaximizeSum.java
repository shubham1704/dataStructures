package com.practice.coding.practice.arrays;

import java.util.Arrays;

/**
 * Given an array A of N integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,…., n – 1.
 * You are allowed to rearrange the elements of the array.
 * Note: Since output could be large, hence module 109+7 and then print answer.
 * Input : Arr[] = {5, 3, 2, 4, 1}
 * Output : 40
 * Explanation:
 * If we arrange the array as 1 2 3 4 5 then
 * we can see that the minimum index will multiply
 * with minimum number and maximum index will
 * multiply with maximum number.
 * So 1*0+2*1+3*2+4*3+5*4=0+2+6+12+20 = 40 mod(109+7) = 40
 */

public class MaximizeSum {

  public static void main(String[] args) {

    int a[] = {12313, 1231231, 213123, 321321,4356,456657,76585676, 9678657, 56758765, 96875675, 98767865, 879789, 976867867, 87956756,
               4575647, 967565, 8756565,67978,5675675,78967896,43563546,56756745,3454353,5676575,3453543,45764564,234234,56756765,
               56765758,65875685,4456456, 453534,6756,756775675,56756785,567,575675677,567657,56756765,765,7,56756,7,57,56,756,7546,34552};
    System.out.println(Maximize(a, a.length));

  }

  static int Maximize(int a[], int n)
  {
    long s=0;
    int m=1000000007;
    // Complete the function
    Arrays.sort(a);

    for(int i=0;i<a.length;i++)
      s=(s+((long)a[i]*i)%m)%m;
    return (int)s;
  }

}
