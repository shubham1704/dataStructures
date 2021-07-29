package com.practice.PracticeQuestion;

import com.practice.PracticeQuestion.model.Data;
import com.practice.PracticeQuestion.model.ResponseString;
import com.practice.PracticeQuestion.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccessDataOfStudent {

  public static void main(String[] args) {

    Data d1 = new Data("Bangalore", "2386742894");
    Student st1 = new Student("Shubham", d1);

    Data d2 = new Data("Bangalore", "2386742894");
    Student st2 = new Student("Amir", d2);

    System.out.println();

    List<Student> studentList = new ArrayList<>();
    studentList.add(st1);
    studentList.add(st2);

    System.out.println(studentList);

    ResponseString res = new ResponseString(st1.getName(), Collections.singletonList(studentList.get(0).getData()));
    ResponseString res2 = new ResponseString(st1.getName(), Collections.singletonList(studentList.get(1).getData()));

    List<ResponseString> print = new ArrayList<>();
    print.add(res);
    print.add(res2);
    System.out.println(print);



  }

}
