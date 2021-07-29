package com.practice.coding.practice.math;

public class LCMAndGCD {

  public static void main(String[] args) {
    long a = 14L;
    long b = 8L;
    Long[] lcmAndGcd = lcmAndGcd(a, b);
    System.out.println("GCD is -->" + lcmAndGcd[0]);
    System.out.println("LCM is -->" + lcmAndGcd[1]);
  }

  static Long[] lcmAndGcd(Long A, Long B) {
    Long[] lcmGcd = new Long[2];
    lcmGcd[1] = gcd(A, B);
    lcmGcd[0] = lcm(A, B, lcmGcd[1]);
    return lcmGcd;
  }

  // gcd method returns the GCD of a and b
  static Long gcd(Long a, Long b) {

    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }

  static Long lcm(Long a, Long b, Long gcdValue) {
    return Math.abs(a * b) / gcdValue;
  }
}
