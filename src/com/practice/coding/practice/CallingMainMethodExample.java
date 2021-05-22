package com.practice.coding.practice;

public class CallingMainMethodExample {

  public static void main(String[] args) {
    int randomNum = (int)(Math.random()*10);

    if(randomNum >= 8)
      System.exit(0);

    System.out.println("Heyhey!"+randomNum);
    main(new String[]{});
  }

}

//Defining Two main method of same signature in single class

class example{

  static class NestedInner
  {

    public static void main(String[] args)
    {
      System.out.println("inside main method of Nested class");

    }//inner main
  }//NestedInner
  public static void main(String[] args)
  {

    NestedInner.main(new String[1] );//**calling of Main method**
    System.out.println("Hello World!");
  }//outer main
}
