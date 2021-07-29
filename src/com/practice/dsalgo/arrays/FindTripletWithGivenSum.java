package com.practice.dsalgo.arrays;



public class FindTripletWithGivenSum {

  public static void main(String[] args) {
    int A[] = {2, 4, 1, 5, 6, 3, 7, 8};
    int sum = 9;
    int arr_size = A.length;

    System.out.println("Total Triplet is -> "+findTriplet(A, arr_size, sum));
  }

  static int findTriplet(int A[], int arr_size, int sum) {
    int triplet = 0;
    for (int i = 0; i < arr_size - 2; i++) {
      for (int j = i + 1; j < arr_size - 1; j++) {
        for (int k = j + 1; k < arr_size; k++) {
          if (A[i] + A[j] + A[k] < sum) {
            System.out.println("Triplet "+ (triplet+1) +" [" + A[i] + ", " + A[j] + ", " + A[k]+"]");
            triplet++;
          }
        }
      }
    }
    return triplet;
  }
}
