package com.practice.clreat_trail_coding_excersize;

import java.util.HashMap;

/**
 * Write a method to return the odd numbers and their frequency from an integer array list passed as an input parameter.
 */

public class OddNumbersInArrayAndFrequency {

static void findOddNumberAndFrequency(int[] a){

  HashMap<Integer, Integer> map = new HashMap<>();
  int count = 0;
  for (int i=0; i<a.length; i++){
    if (a[i] % 2 != 0){
      if (!map.containsKey(a[i])){
        map.put(a[i], count+1);
      }
      else {
        count = map.get(a[i]);
        map.put(a[i], count+1);
      }
    }
  }
  System.out.println(map);
}

  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6,7,8,9,3,5,7};
    findOddNumberAndFrequency(a);
  }
}
