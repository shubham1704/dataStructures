package com.practice.algorithm.searching;

import java.util.Arrays;

/**
 * In Binary Search first we sort the array or It can only be performed on sorted array
 */

public class BinarySearchUsingRecursion {

  public static void main(String[] args) {
    int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};
    Arrays.sort(arr);
    int item = 90;
    int location = binarySearch(arr,0,9,item);
    if(location != -1)
      System.out.println("the location of the item is "+location);
    else
      System.out.println("Item not found");
  }


  public static int binarySearch(int[] a, int beg, int end, int item)
  {
    int mid;
    if(end >= beg)
    {
      mid = (beg + end)/2;
      if(a[mid] == item)
      {
        return mid+1;
      }
      else if(a[mid] < item)
      {
        return binarySearch(a,mid+1,end,item);
      }
      else
      {
        return binarySearch(a,beg,mid-1,item);
      }
    }
    return -1;
  }
}
