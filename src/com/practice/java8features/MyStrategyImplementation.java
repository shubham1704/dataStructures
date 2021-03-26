package com.practice.java8features;

import java.util.function.Supplier;

public class MyStrategyImplementation {

  private final Supplier<String> supplier;

  private MyStrategyImplementation(Supplier<String> supplier) {
    this.supplier = supplier;
  }

  public static MyStrategyImplementation of(Supplier<String> supplier){
    return new MyStrategyImplementation(supplier);
  }

  public void doSomething(){

    System.out.println("a");
    System.out.println("a");
    System.out.println(supplier.get()); // If you want to do something different in a particular line of repetitive task then you can use this
    System.out.println("a");
    System.out.println("a");

  }

  public static void main(String[] args) {
    MyStrategyImplementation.of(() -> "c").doSomething();
    System.out.println("------------------------------------------");
    MyStrategyImplementation.of(() -> "d").doSomething();
  }

}
