package com.practice.coding.practice.arrays;

import java.util.Arrays;

public class CountDuplicateElement {

  public static void main(String[] args) {
    int []a = {2,3,4,5,6,7,8,9,1,2,3,4,5,6,4,2,1};
    System.out.println(a.length);
    countDuplicate(a, a.length);
  }

  public static void countDuplicate(int []a, int n){

    Arrays.sort(a);
    int count;
    int loop = 0;
    for (int i=0; i<n; i++){
      loop++;
      count = 1;
      for (int j=i+1; j<n; j++){
        loop++;
        if (a[i] == a[j]){
          count++;
        }
        else{
          break;
        }
      }
      if (count>1)
      System.out.println(a[i] + " -> "+count);
      i = i+count-1;
    }
    System.out.println(loop);
  }

}
