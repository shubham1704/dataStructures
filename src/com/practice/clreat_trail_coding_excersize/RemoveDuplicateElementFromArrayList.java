package com.practice.clreat_trail_coding_excersize;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a method to remove duplicate values from an array list passed as an input parameter.
 */

public class RemoveDuplicateElementFromArrayList {

  static List<Integer> removeDuplicate(List<Integer> list){
    return list.stream().distinct().collect(Collectors.toList());
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(2);
    list.add(3);
    list.add(2);
    list.add(3);
    list.add(2);
    list.add(3);
    list = removeDuplicate(list);
    System.out.println(list);
  }

}
