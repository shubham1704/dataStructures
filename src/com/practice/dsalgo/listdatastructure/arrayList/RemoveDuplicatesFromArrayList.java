package com.practice.dsalgo.listdatastructure.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * We can use Set but it doesn't store the order of the element.
 * If we need to maintain the order of the element then we have to sue LinkedHashSet
 */

public class RemoveDuplicatesFromArrayList {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(5);
    list.add(5);
    list.add(6);
    list.add(9);
    list.add(0);
    //To remove duplicate we can use distinct() function from stream
    System.out.println(list.stream().distinct().collect(Collectors.toList()));
    System.out.println(method1(list));

    /**
     * For Non Primitive Type we have to implement hashcode and equals method in our data class
     */

    List<Data> data = Arrays.asList(new Data(32, "Shubham"), new Data(32, "Amir"), new Data(45, "Nitika"));
    System.out.println(data.stream().distinct().collect(Collectors.toList()));

  }

  /**
   * Here we are using LinkedHasSet to maintain the insertion order and remove duplicate at same time
   * In case we need not to maintain the order then we could use other Set class
   * @param list
   * @return
   */

  public static List<Integer> method1(List<Integer> list){
    Set<Integer> set = new LinkedHashSet<>(list);
    list.clear();
    list.addAll(set);
    return list;

  }

  private static class Data{
    int marks;
    String name;

    public Data(int marks, String name) {
      this.marks = marks;
      this.name = name;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Data data = (Data)o;
      return marks == data.marks &&
             data.name.equals(name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(marks, name);
    }

    @Override
    public String toString() {
      return "{" + marks +
             ", '" + name + '\'' +
             '}';
    }
  }

}
