package com.practice.coding.practice.math;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class PrimeNumbers {

  public static void main(String[] args) {
//    System.out.println(printPrime(1));
    IntStream.range(1, (int)Math.sqrt(5)+1).forEach(System.out::println);
    System.out.println(printPrimeIn1Line(5));
    //System.out.println(isPrime(6));
    //System.out.println(sieveOfEratosthenes(101));
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
    if (N % 2 == 0){
      System.out.println(N + " is Prime!!!!!!!");
    }
    for (int i = 2; i < Math.sqrt(N); i++) {
      if (N % i == 0) {
        System.out.println(N + " Is not a Prime");
        return 0;
      }
    }
    System.out.println(N + " Prime!!!!!!!!");
    return 1;
  }

  // Not Working
  public static boolean printPrimeIn1Line(int n) {

    if (n%2 == 0){
      return false;
    }
    int sum = IntStream.range(1, (int)Math.sqrt(n)+1).map(x->(n % x == 0 ? 0 : 1)).sum();
    boolean b = sum != 0;
    System.out.println(sum+" "+b+" "+(int)Math.sqrt(n));
    return b;
  }

  public static ArrayList<Integer> sieveOfEratosthenes(int N){
    ArrayList<Integer> list = new ArrayList<>();

    for (int i=1; i<=N; i++){
      if (isPrime(i) == 1 ){
        list.add(i);
      }

    }
    return list;
  }

  static int isPrime(int N){
    if (N <= 1)
      return 0;

      // Check if number is 2
    else if (N == 2)
      return 1;

      // Check if n is a multiple of 2
    else if (N % 2 == 0)
      return 0;

    // If not, then just check the odds
    for (int i = 3; i <= Math.sqrt(N); i += 2)
    {
      if (N % i == 0)
        return 0;
    }
    return 1;
  }
}
