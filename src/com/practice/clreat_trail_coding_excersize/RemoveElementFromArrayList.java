package com.practice.clreat_trail_coding_excersize;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a method to remove a given value from array list having string values.
 */

public class RemoveElementFromArrayList {

  private static List<String> removeElementFromArrayListOfString(List<String> list, String element){
    return list.stream().filter(x -> !x.equals(element)).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("test1");
    list.add("test2");
    list.add("test3");
    list.add("test4");
    //Remove Element from List
    list = removeElementFromArrayListOfString(list, "test3");
    System.out.println(list);

    //Or we can use inbuilt method
    //list.remove("test2");

  }

}
