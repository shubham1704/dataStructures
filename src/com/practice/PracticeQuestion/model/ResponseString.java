package com.practice.PracticeQuestion.model;

import java.util.ArrayList;
import java.util.List;

public class ResponseString {

  private String name;
  private List<Data> data = new ArrayList<>();

  public ResponseString(String name, List<Data> data) {
    this.name = name;
    this.data = data;
  }

  public String getName() {
    return name;
  }

  public List<Data> getData() {
    return data;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setData(List<Data> data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "{" +
           "name='" + name + '\'' +
           ", data=" + data +
           '}';
  }
}
