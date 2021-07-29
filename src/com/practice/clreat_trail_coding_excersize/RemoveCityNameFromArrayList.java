package com.practice.clreat_trail_coding_excersize;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a method to update the city attribute of Student object array list passed as an input parameter.
 * If the city is "Mumbai" then change it to "Delhi". The method should return how many student records were updated.
 */

public class RemoveCityNameFromArrayList {

  static int changeCityNameOfStudentClass(List<Student> list) {
    int count = (int)list.stream().filter(x -> x.getCity().equals("Mumbai")).count();
    list = list.stream().map(student -> {
      if (student.getCity().equals("Mumbai")) {
        return new Student("Delhi");
      } else {
        return student;
      }
    }).collect(Collectors.toList());
    System.out.println(list);
    return count;
  }

  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("Mumbai"));
    list.add(new Student("Delhi"));
    list.add(new Student("Vns"));
    list.add(new Student("Kolkata"));
    list.add(new Student("Mumbai"));
    list.add(new Student("Delhi"));
    System.out.println(changeCityNameOfStudentClass(list));

    //Or if we want to modify the current list
//    list.forEach(student -> {
//      if (student.getCity().equals("Mumbai")) {
//        student.setCity("Delhi");
//      }
//    });
//    System.out.println(list);

  }
}

  class Student {

    private String city;

    public Student(String city) {
      this.city = city;
    }

    public String getCity() {
      return city;
    }

    public void setCity(String city) {
      this.city = city;
    }

    @Override
    public String toString() {
      return "Student{" +
             "city='" + city + '\'' +
             '}';
    }
  }
