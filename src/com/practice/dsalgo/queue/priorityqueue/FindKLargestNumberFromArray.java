package com.practice.dsalgo.queue.priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindKLargestNumberFromArray {

  public static void main(String[] args) {
    int arr[] = {1, 23, 12, 9, 30, 2, 50};
    int k = 3;
    int n = arr.length;
    System.out.println(kLargest(arr, n, k));
  }

  public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
    if (k <=0) return new ArrayList<>(1);

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < n; i++) {
      if (i < k) {
        pq.add(arr[i]);
      }else
      if (pq.peek() < arr[i]) {
        pq.poll();
        pq.add(arr[i]);
      }
    }
    ArrayList<Integer> ar = new ArrayList<>(pq);
    ar.sort(Collections.reverseOrder());

    return ar;
  }
}


