package com.practice.coding.practice.arrays;

public class FindSecondLargest {

  public static void main(String[] args) {

    int a[] = {10, 5, 10, 10};
    System.out.println(print2largest(a, a.length));

  }

  static int print2largest(int a[], int n) {
    if(n==1){
      return -1;
    }
    int largest = -1;
    int secondLargest = -1;
    for (int i=0; i<n; i++){
      if (a[i]> largest){
        secondLargest = largest;
        largest = a[i];
      }else if (a[i] < largest && a[i] > secondLargest){
        secondLargest = a[i];
      }
    }

    return secondLargest;
  }

}
