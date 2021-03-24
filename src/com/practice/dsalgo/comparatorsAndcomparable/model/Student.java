package com.practice.dsalgo.comparatorsAndcomparable.model;

import java.util.Objects;

public class Student {

  private int marks;
  private String name;

  public Student(int marks, String name) {
    this.marks = marks;
    this.name = name;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
           "marks=" + marks +
           ", name='" + name + '\'' +
           '}';
  }

  /**
   * implement Comparable<Student> to use below method
   * This will Sort the Student object in Decreasing Order.
   * If we need to sort it by increasing order then we have to change the place of -1-->1 and 1--> -1
   * @param obj
   * @return

  @Override
  public int compareTo(Student obj) {
    if (this.marks > obj.marks) {
      return -1;
    } else if (this.marks < obj.marks) {
      return 1;
    }
    //In case we need to compare by Name if marks are same
     return obj.name.compareTo(this.name);
  }
   */

}
