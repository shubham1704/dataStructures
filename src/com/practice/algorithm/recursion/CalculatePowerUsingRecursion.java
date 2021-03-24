package com.practice.algorithm.recursion;

public class CalculatePowerUsingRecursion {

  static int stepCount = 0;

  public static void main(String[] args) {

    System.out.println(power(2, 1000));
    System.out.println(stepCount);

    stepCount = 0;
    System.out.println(fastPowerCalculator(2, 1000));
    System.out.println(stepCount);
  }

  /**
   * This solution will take O(n) linear time complexity
   *
   * @param n
   * @param p
   * @return
   */

  public static int power(int n, int p) {
    stepCount++;
    if (p == 0) {
      return 1;
    }
    return n * power(n, p - 1);
  }

  /**
   * Here we are applying math like if we need to calculate n^p then we can have (n^2)^(p/2) if p is even
   * otherwise n*n^(p-1)
   * Ex - 2^6 = (2^2)^3 (since 6 is even
   *      2^7 = 2*(2^2)^3   (since 7 is odd) and since we got p = even then we can go for the above
   * This solution can calculate the power of any number in > O(log n) times
   * @param n {@code denotes the number whose power need to be calculated}
   * @param p {@code denotes the power}
   * @return
   */

  public static int fastPowerCalculator(int n, int p) {

    stepCount++;
    if (p == 0) {
      return 1;
    }

    if (p % 2 == 0) {
      return fastPowerCalculator(n * n, p / 2);
    }
      return n * fastPowerCalculator(n, p - 1);

  }
}
