package com.practice.dsalgo.comparatorsAndcomparable;

import com.practice.dsalgo.comparatorsAndcomparable.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    students.add(new Student(23, "Ramesh"));
    students.add(new Student(22, "Alex"));
    students.add(new Student(77, "Rohit"));
    students.add(new Student(86, "Shubham"));
    students.add(new Student(89, "Amir"));
    students.add(new Student(95, "Nitika"));

    /**
     * Using Comparable
     */
    //Collections.sort(students);

    /**
     * Using Comparator
     */
    Collections.sort(students, (st1, st2) -> st1.getName().equals(st2.getName())
                                             ? st1.getMarks() - st2.getMarks()
                                             : st1.getName().compareTo(st2.getName()));
    /**
     * For more flexibility we can use below method
     * If we want to sort by using name then marks
     */

    Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());

    students.forEach(System.out::println);
  }
}
