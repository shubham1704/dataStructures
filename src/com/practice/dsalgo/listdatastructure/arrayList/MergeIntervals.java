package com.practice.dsalgo.listdatastructure.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * There are Intervals given in sorted form and you have to insert an interval withing it
 * The Output of the Interval Should also be in sorted form
 * Ex - I/p Given Few Intervals like --> [{1, 4}, {5, 7}, {10, 11}, {13, 15}]
 * You have to insert the interval {3,11}
 * o/p - [{1, 11}, {13, 15}]
 * Full Problem Statement Apni Kaksha vdo41
 * Actual Problem is on InterviewBit
 */

public class MergeIntervals {

  public static void main(String[] args) {
    List<Interval> intervals = Arrays.asList(new Interval(1, 4), new Interval(5, 7), new Interval(10, 11), new Interval(13, 15));
    ArrayList<Interval> arrayList = new ArrayList<>(intervals);
    System.out.println(arrayList);
    Interval newInterval = new Interval(3, 11);
    System.out.println(mergeInterval(arrayList, newInterval));
  }

  public static ArrayList<Interval> mergeInterval(ArrayList<Interval> intervals, Interval toInsert) {

    //boolean insert = false;

    if (intervals == null) {
       intervals = new ArrayList<>();
       intervals.add(toInsert);
       return intervals;
    }

    if (intervals.size() == 0){
      intervals.add(toInsert);
      return intervals;
    }

    int i = 0;
    for (; i < intervals.size(); i++) {
      Interval current = intervals.get(i);
      if (current.end < toInsert.start) {
      } else if (current.start > toInsert.end) {
        intervals.add(i, toInsert);
        //insert = false;
        break;
      } else if (current.end > toInsert.start) {
        toInsert.start = Math.min(current.start, toInsert.start);
        toInsert.end = Math.max(current.end, toInsert.end);
        intervals.remove(i);
        i--;
        //insert = true;
      }
    }

    if (i == intervals.size()) {
      intervals.add(toInsert);
    }

    /**
     * This below If condition will also work but has an extra variable insert
     * So it is better to use
     */
//    if (insert){
//      intervals.add(toInsert);
//    }

    return intervals;
  }
  private static class Interval {

    int start;
    int end;

    public Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }

    public Interval() {
      this.start = 0;
      this.end = 0;
    }

    @Override
    public String toString() {
      return "{" + start +
             ", " + end +
             '}';
    }
  }
}

