package com.practice.algorithm.backtracking;

import java.util.ArrayList;

/** Given an Array and we have to find two array out of it whose sum of sum equal to Array sum
 * Ex --> [2,3,8,1,2,4]
 */

public class PartitionArrayIntoEqualSum {

  public static void main(String[] args) {
    int a[] = {2,3,8,1,2,4};
    int sum = 0;
    for (int i=0; i<a.length; i++){
      sum += a[i];
    }

    ArrayList<Integer> ans = new ArrayList<>();
    boolean isPossible = (sum&1) == 0 && partition(a, sum/2, 0, ans);

    if (isPossible){
      System.out.println(ans);
    }
    else {
      System.out.println("Not Possible");
    }

  }

  public static boolean partition(int a[], int sum, int i, ArrayList<Integer> ans){

    if (i>=a.length || sum < 0)return false;
    if (sum == 0) return true;

    ans.add(a[i]);
    boolean possibleLeft = partition(a, sum-a[i], i+1, ans);

    if (possibleLeft)return true;

    //This line makes BackTracking possible
    ans.remove(ans.size()-1);
    return partition(a, sum, i+1, ans);

  }

}
