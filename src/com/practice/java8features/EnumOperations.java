package com.practice.java8features;

import java.util.function.IntBinaryOperator;

/**
 * Before Java 8 we could have written the below code to some operation on Enums
 * But After Java 8 we can do the operation same as Class EnumOperationJava8
 */
public enum  EnumOperations {

  ADD{
    @Override
    public int apply(int x, int y) {
      return x+y;
    }
  },
  SUBTRACT{
    @Override
    public int apply(int x, int y) {
      return x-y;
    }
  },
  MULTIPLY{
    @Override
    public int apply(int x, int y) {
      return x*y;
    }
  },
  DIVIDE{
    @Override
    public int apply(int x, int y) {
      return x/y;
    }
  };
  public abstract int apply(int x, int y);
}

/**
 * Since Java 8 We can do the same above operation like this
 * If your code is too big to fit in one line then you can use the Method reference
 * Lets have an Example the business logic for addition is too big to write here in the lambda then
 * we can create another class for the business logic and define a static method with the business logic and use it here with the reference
 */

enum  EnumOperationJava8 {

  ADD(MyClassWithBusinessLogic::addBusinessLogic), // In case the business logic is too big to write here
  SUBTRACT((x, y) -> x+y),
  MULTIPLY((x, y) -> x+y),
  DIVIDE((x, y) -> x+y);

  private final IntBinaryOperator operator;

  EnumOperationJava8(IntBinaryOperator operator) {
    this.operator = operator;
  }

  public int apply(int x, int y){
    return operator.applyAsInt(x, y);
  }

}


class MyClassWithBusinessLogic{
  public static int addBusinessLogic(int x, int y){
    System.out.println("a");
    System.out.println("a");
    System.out.println("a");
    System.out.println("a");
    System.out.println("a");
    return x+y;
  }
}
