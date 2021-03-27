package com.practice.java9Features;

import java.io.FileInputStream;

public class TryWithResourcesImprovisedVersion {

  static void readFile(String file) throws Exception {

    /**
     * In Java 7 We have to do this
     */
//    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//    try (BufferedReader reader1 = reader) {
//      String line;
//
//      while ((line = reader1.readLine()) != null) {
//        System.out.println(line);
//      }
//    }

    /**
     * This is Java 9 Feature
     */

//    try (reader) {
//      String line;
//
//      while ((line = reader.readLine()) != null) {
//        System.out.println(line);
//      }
//    }

    /**
     * Or we can write the below code instead of above
     */
    new FileInputStream(file).transferTo(System.out);
  }

  public static void main(String[] args) {
    try {
      readFile("C:\\Users\\sjai0003\\Documents\\test.txt");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
