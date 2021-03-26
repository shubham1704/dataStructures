package com.practice.java8features;

import java.time.Instant;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodRefrences {

  static Function<Integer, Integer> f1 = MethodRefrences::addOne;
  static Function<Integer, Integer> f2 = f -> f+ 2;

  public static void main(String[] args) {
    /**
     * Example of Using Method Reference
     */

    st(s -> Integer.parseInt(s));
    st(Integer::parseInt);

    unBound(s -> s.toLowerCase());
    unBound(String::toLowerCase);

    bound(instant -> Instant.now().isAfter(instant));
    bound(Instant.now()::isAfter);

    constructor(() -> new TreeMap<>());
    constructor(TreeMap::new);

    array(integer -> new int[integer]);
    array(int[]::new);
  }

  public static Integer addOne(Integer integer) {
    return integer + 1;
  }

  public static final Instant NOW = Instant.now();

  public static Instant getNow() {
    return NOW;
  }

  public static void st(Function<String, Integer> function) {
  }

  public static void bound(Predicate<Instant> predicate) {
  }

  public static void unBound(UnaryOperator<String> operator) {
  }

  public static void constructor(Supplier<TreeMap<String, String>> supplier) {
  }

  public static void array(Function<Integer, int[]> function) {
  }
}
