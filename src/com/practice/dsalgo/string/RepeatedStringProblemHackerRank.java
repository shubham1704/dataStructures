package com.practice.dsalgo.string;

/**
 * Count the number of character 'a' in a string which is the repetition of itself till n number of time
 * I/P --> String s = "abaas"
 * n = 200 this means the length of the above string after repeating itself
 * hence the string would look like --> "abaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaasabaas......200 length
 * So from this string of length 200 you have to find the occurrence of 'a'
 */
public class RepeatedStringProblemHackerRank {

  public static void main(String[] args) {

    String s = "abcad";
    System.out.println(countAInRepeatedString(s, 39));

  }

  /**
   * This method will work like this
   * Step 1 : Count the occurrence of 'a' in the given string
   * Step 2 : Count how many time the string will occur in given length
   * Step 3 : Count the remainder of the the length which will be leftout
   * Step 4 : Count the occurrence of 'a' in the remainder
   * Step 5 : Add all the occurrence
   * @param s
   * @param n
   * @return
   */
  public static long countAInRepeatedString(String s, long n)
  {
    long countAinGivenString = 0;
    int lengthOfString = s.length();
    for (int i = 0; i<lengthOfString; i++){
      if (s.charAt(i) == 'a' || s.charAt(i) == 'A'){
        countAinGivenString++;
      }
    }
    if (lengthOfString<n){
      long x = n/lengthOfString;
      long y = n%lengthOfString;
      countAinGivenString *= x;

      for (int i=0; i<y; i++){
        if (s.charAt(i) == 'a' || s.charAt(i) == 'A'){
          countAinGivenString++;
        }
      }
    }
    return countAinGivenString;
  }

}
