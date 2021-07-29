package com.practice.coding.practice.string;

/**
 * Given a string S of lowercase english alphabetic characters and a substring range starting from q1 and ending at q2,
 * the task is to find out the count of palindromic substrings in the given substring range.
 * Input:
 * N = 7
 * S = "xyaabax"
 * q1 = 3
 * q2 = 5
 * Output: 4
 * Explanation: The substring in the given range
 * is "aba". Hence, the palindromic substrings are:
 * "a", "b", "a" and "aba".
 */

public class CountPalindromeSubstring {

  public static void main(String[] args) {
    String s = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmcoqhnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcacehchzvfrkmlnozjkpqpxrjxkitzyxacbhhkicqcoendtomfgdwdwfcgpxiqvkuytdlcgdewhtaciohordtqkvwcsgspqoqmsboaguwnnyqxnzlgdgwpbtrwblnsadeuguumoqcdrubetokyxhoachwdvmxxrdryxlmndqtukwagmlejuukwcibxubumenmeyatdrmydiajxloghiqfmzhlvihjouvsuyoypayulyeimuotehzriicfskpggkbbipzzrzucxamludfykgruowzgiooobppleqlwphapjnadqhdcnvwdtxjbmyppphauxnspusgd.................";
    System.out.println(findPalindromeSubstring(s.length(), s, 234, 254));
    System.out.println(new Sol().countPalinInRange(s.length(), s, 234, 254));

  }

  static int findPalindromeSubstring(int n, String s, int q1, int q2){
    int longestPalindrome = 0;
    int temp = q1;
    q1 = q1<q2?q1:q2;
    q2 = q2>temp?q2:temp;
    int i = q1, j=q2;
    int substringLength = s.substring(q1, q2+1).length();
    while(q1<q2){
      boolean b = findPalindrome(s, q1, q2);
      if (b){
        longestPalindrome = q2+1-q1;
      }
      q1+=1;
    }

    j = j-1;
    while (i<j){
      boolean b = findPalindrome(s, i, j);
      if (b && longestPalindrome<(j+1-i)){
        longestPalindrome = j+1-i;
      }
      j-=1;
    }
    if (longestPalindrome == 0){
      longestPalindrome = substringLength;
    }
    else if (longestPalindrome == substringLength){
      longestPalindrome+=1;
    }

    return longestPalindrome;
  }

  static boolean findPalindrome(String s, int q1, int q2){
    StringBuilder s2 = new StringBuilder(s.substring(q1, q2+1));

    if (s2.toString().equals(s2.reverse().toString())) {
      return true;
    }
    else return false;
  }
}

class Sol
{
  int countPalinInRange (int n, String A, int q1, int q2)
  {
    if (q1 > q2)
    {
      int temp = q1;
      q1 = q2;
      q2 = temp;
    }
    int res = 0;
    int j, k;

    // solved using the fact that a palindrome mirrors around its centre
    for (int i = q1; i <= q2; i++)
    {
      j = i - 1;
      k = i + 1;
      res++;

      // generating the mirror around the current element
      // to have a palindrome with odd length
      while (j >= q1 && k <= q2)
      {
        if (A.charAt(j) == A.charAt(k))
          res++;
        else
          break;
        j--;
        k++;
      }

      // if the current character is same as the next,
      // a plaindrome can be mirrored around these 2 characters
      // this way, we'll have a palindrome of even length
      if (i < n - 1 && A.charAt(i) == A.charAt(i+1))
      {
        j = i;
        k = i + 1;

        while (j >= q1 && k <= q2)
        {
          if (A.charAt(j) == A.charAt(k))
            res++;
          else
            break;
          j--;
          k++;
        }
      }
    }

    return res;
  }
}
