package com.practice.coding.practice.math;

public class LCMAndGCD {

  public static void main(String[] args) {
    int gcdValue = gcd(20, 30);
    int lcm = lcm(20, 30, gcdValue);
    System.out.println("GCD is -->"+gcdValue);
    System.out.println("LCM is -->"+lcm);
  }


  // gcd method returns the GCD of a and b
  static int gcd(int a, int b) {

    // if b=0, a is the GCD
    if (b == 0)
      return a;

      // call the gcd() method recursively by
      // replacing a with b and b with
      // modulus(a,b) as long as b != 0
    else
      return gcd(b, a % b);
  }

  // lcm() method returns the LCM of a and b
  static int lcm(int a, int b, int gcdValue)
  {
    return Math.abs(a * b) / gcdValue;
  }

}
