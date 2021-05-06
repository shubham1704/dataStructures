package com.practice.java8features.streamApi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UseOfReduce {

  public static void main(String[] args) {
    System.out.println(Stream.of(1,2,34,5,6,7,8,5,5343,4,2,3,2,2,432,34,3,234,234,4,32).reduce((x,y) -> {
      if (x> y)
        return x;
      return y;
    }).get());
  }

  //Sum of N Natural Number Using Reduce
  public int sum(int[] a, int n){
    //return Arrays.stream(a).reduce(0, (i, j) -> i+j);
    return Arrays.stream(a).reduce(0, Integer::sum);
  }

  // multiply n integer by itself
  public int multiply(int a[], int n){
    return Arrays.stream(a).reduce(1, (i, j) -> i*j);
  }

  // Print 100 natural number
  public void printNumbers(int n){
    IntStream.range(1, 100).forEach(System.out::println);
  }

}
