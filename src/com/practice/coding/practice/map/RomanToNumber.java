package com.practice.coding.practice.map;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {

  public static void main(String[] args)
  {
    String input = "MCMIV";

    System.out.print(decode(input));
  }

  public static Integer decode(String roman)
  {
    final Map<Character,Integer> romanMap = new HashMap<>()
    {{
      put('I', 1);
      put('V', 5);
      put('X', 10);
      put('L', 50);
      put('C', 100);
      put('D', 500);
      put('M', 1000);
    }};
    int sum = 0;
    int n = roman.length();

    for(int i = 0; i < n; i++)
    {
      if (i != n - 1 && romanMap.get(roman.charAt(i)) <
                        romanMap.get(roman.charAt(i + 1)))
      {
        sum += romanMap.get(roman.charAt(i + 1)) -
               romanMap.get(roman.charAt(i));
        i++;
      }
      else
      {
        sum += romanMap.get(roman.charAt(i));
      }
    }
    return sum;
  }

}
