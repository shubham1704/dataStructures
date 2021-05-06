package com.practice.java9Features;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethods {

  public static void main(String[] args) {
    //before Java 9
    Set<String> set = Collections.unmodifiableSet(new HashSet<>(){{
      add("Orange");
      add("Apple");
      add("Banana");
    }});
    System.out.println(set);

    /**After Java 9
     * This is the way of instantiating immutable object
     * That means we can't add or remove elements from the Set, List and Map
     */

    Set<String> set1 = Set.of("Apple", "Orange", "Banana");
    //Below Operation is not allowed
    //set1.add("fruit");

    List<Integer> list = List.of(1,2,34,4,5,6,7,87,9,90);
    //Below Operation is not allowed
    list.add(1);

    Map<Integer, Integer> map = Map.of(13,12, 34,12);
    //Below Operation is not allowed
    //map.put(12,123);
  }

}
