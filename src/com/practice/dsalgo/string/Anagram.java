package com.practice.dsalgo.string;

/**
 * Anagram means two string have same number of character
 * Example --> aab , aba, baa these three String are Anagram
 * there could be more than one solution in which 1st can be for each element of str1 compare each of str2
 * Another solution could be count the occurrence of chars and compare both of them
 */

public class Anagram {

  private static boolean isAnagram = false;

  public static void main(String[] args) {

    Solution1("aba", "acb");
    solution2("abacbc","adbbcc");
  }

  /**
   * This will compare all the elements of string1 to all the element of str2
   * @param str1
   * @param str2
   */
  public static void Solution1(String str1, String str2) {

    boolean visited[] = new boolean[str2.length()];

    if (str1.length()==str2.length()) {

      for (int i = 0; i < str1.length(); i++) {
        isAnagram = false;
        for (int j = 0; j < str2.length(); j++) {
          if (str1.charAt(i) == str2.charAt(j) && !visited[j]) {
            visited[j] = true;
            isAnagram = true;
            break;
          }
        }
      }
    }

    if (isAnagram) {
      System.out.println("The Strings are Anagram");
    } else {
      System.out.println("Not An Anagram");
    }
  }

  /**
   * This will count the occurrence of each char in both the string and then compare both to check
   * @param str1
   * @param str2
   */
  public static void solution2(String str1, String str2){

    int asciiArray[] = new int[256];
    isAnagram = true;


    for (char charInStr1:str1.toCharArray()) {
      int indexOfChar = (int)charInStr1;
      asciiArray[indexOfChar]++;
    }

    for (char charInStr1:str2.toCharArray()) {
      int indexOfChar = (int)charInStr1;
      asciiArray[indexOfChar]--;
    }

    for (int occurance : asciiArray)
    {
      if (occurance>0)
      {
        isAnagram = false;
        break;
      }
    }

    if (isAnagram) {
      System.out.println("The Strings are Anagram");
    } else {
      System.out.println("Not An Anagram");
    }
  }
}
