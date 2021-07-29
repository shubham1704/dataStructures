package com.practice.coding.practice.string;

public class StringToInteger {

  public static void main(String[] args) {
    String s ="-918291982818";
    System.out.println(new Solution().myAtoi(s));
  }

  static int atoi(String s) {

    String[] s2 = s.strip().split(" ");
    int result = 0;
    boolean positive = true;
    for (int i = 0; i < s2.length; i++) {
      //System.out.println(s2[i]);
      if (s2[i].charAt(0) == '-') {
        positive = false;
        if (Character.isDigit(s2[i].charAt(1))) {
          StringBuilder sb = new StringBuilder();
          for (int j=1; j<s2[i].length(); j++ ){
            sb.append(s2[i].charAt(j));
          }
          //System.out.println(s2[i]);
          try {
            result = Integer.parseInt(sb.toString());
            continue;
          }catch (NumberFormatException e){
            try {
              result = (int)Double.parseDouble(sb.toString());
            }catch (NumberFormatException e1) {
              result = Integer.MIN_VALUE;
            }
          }
        }
      }
      if (Character.isDigit(s2[i].charAt(0))) {
       // System.out.println(s2[i]);
        try {
          result = (int)Integer.parseInt(s2[i]);
        }catch (NumberFormatException e){
          try {
            result = (int)Double.parseDouble(s2[i]);
          }catch (NumberFormatException e1) {
            result = Integer.MAX_VALUE-1;
          }
        }
      }
      else break;
    }
    if (result > 0 && positive){
      return result;
    }
    else if (result > 0 && !positive){
      return -result;
    }
    if (result == Integer.MIN_VALUE){
      return result-1;
    }
    return result;
  }

}
class Solution {
  private String s;
  private int sign;
  private double result;

  public Solution() {
    this.sign = 1;
    this.result =0;
  }

  public int myAtoi(String s) {
    this.s = s.trim();
    if (this.s.isEmpty()) {
      return 0;
    }
    char signChar = this.s.charAt(0);
    if (signChar == '-' || signChar == '+') {
      this.s = this.s.substring(1);
    }
    if (signChar == '-') this.sign = -1;

    for(int i =0; i < this.s.length(); i++) {
      if (Character.isDigit(this.s.charAt(i))) {
        continue;
      } else {
        this.s = this.s.substring(0, i);
        break;
      }
    }

    for (int i=0; i< this.s.length(); i++) {
      this.result += ((int)(this.s.charAt(i)) - (int)('0')) * Math.pow(10, this.s.length() -i -1);
    }

    this.result *= this.sign;
    this.result = Math.max(this.result, Math.pow(-2,31));
    this.result = Math.min(this.result, Math.pow(2, 31) - 1);
    return (int)this.result;
  }
}


