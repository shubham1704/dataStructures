package com.practice.coding.practice.math;

import java.util.stream.IntStream;

public class PrimeNumbers {

  public static void main(String[] args) {
    System.out.println(printPrime(1));
    printPrimeIn1Line(2);
  }

  static int printPrime(int N) {
    if (N == 1) {
      System.out.println(N + " Is not a Prime");
      return 0;
    }
    if (N == 2) {
      System.out.println(N + " Prime!!!!!!!!");
      return 1;
    }
    for (int i = 3; i < Math.sqrt(N); i++) {
      if (N % i == 0) {
        System.out.println(N + " Is not a Prime");
        return 0;
      }
    }
    System.out.println(N + " Prime!!!!!!!!");
    return 1;
  }

  public static void printPrimeIn1Line(int n) {

    System.out.println(IntStream.range(0, (int)Math.sqrt(177)).skip(3).map(x->(n % x == 0 ? 0 : 1)).sum() == 0 ? "Is Not A Prime" : "Is Prime");
  }
}
