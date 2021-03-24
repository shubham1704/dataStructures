package com.practice.dsalgo.map;

/**
 * This problem is from Leet code name as Group Anagram
 * We have to group the strings which are anagrams
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagramsInterviewQuestion {

  public static void main(String[] args) {
    String str[] = {"ate", "tan", "bat", "nat", "tea", "eat"};
    System.out.println(groupAnagram(str));
  }

  public static List<List<String>> groupAnagram(String[] str) {
    Map<String, List<String>> map = new HashMap<>();
    for (String s : str) {
      char charArray[] = s.toCharArray();
      Arrays.sort(charArray);
      String sorted = new String(charArray);
      if (!map.containsKey(sorted)) {
        map.put(sorted, new LinkedList<>());
      }
      map.get(sorted).add(s);
    }
    return new LinkedList<>(map.values());
  }
}
