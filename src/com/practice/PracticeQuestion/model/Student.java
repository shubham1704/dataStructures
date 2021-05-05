package com.practice.PracticeQuestion.model;

public class Student {

  private String name;
  private Data data;

  public Student(String name, Data data) {
    this.name = name;
    this.data = data;
  }

  public String getName() {
    return name;
  }

  public Data getData() {
    return data;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setData(Data data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return name+"{" +
           "name='" + name + '\'' +
           ", data=" + data +
           '}';
  }
}
