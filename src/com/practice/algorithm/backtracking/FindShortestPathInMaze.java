package com.practice.algorithm.backtracking;

public class FindShortestPathInMaze {

  public static void main(String[] args) {

    int a[][] = {
        {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
        {0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
        {0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
        {1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
        {0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
        {1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
        {0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
        {0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
        {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
        {0, 0, 1, 0, 0, 1, 1, 0, 0, 1}
    };

    int b[][] = {
        {1,0,1},
        {1,1,0},
        {0,1,1}
    };

    int result = shortestPath(a, 0,0,8,0);
    System.out.println(result);
  }

  public static int shortestPath(int a[][], int i, int j, int x, int y) {
    int rows = a.length;
    int column = a[0].length;

    boolean visited[][] = new boolean[rows][column];
    return shortestPath(a, i, j, x, y, visited);
  }

  public static int shortestPath(int a[][], int i, int j, int x, int y, boolean[][] visited) {

    if (!isValid(a, i, j, visited)) {
      return 10000;
    }
    if (i == x && j == y) {
      return 0;
    }

    visited[i][j] = true;

    int left = shortestPath(a, i, j - 1, x, y, visited) + 1;
    int right = shortestPath(a, i, j + 1, x, y, visited) + 1;
    int top = shortestPath(a, i - 1, j, x, y, visited) + 1;
    int bottom = shortestPath(a, i + 1, j, x, y, visited) + 1;

    //This line makes Backtracking Work
    visited[i][j] = false;
    return Math.min(Math.min(left, bottom), Math.min(right, top));
  }

  public static boolean isValid(int[][] a, int i, int j, boolean[][] visited) {
    int rows = a.length;
    int column = a[0].length;
    return i >= 0 && j >= 0 && i < rows && j < column && a[i][j] == 1 && !visited[i][j];
  }
}
