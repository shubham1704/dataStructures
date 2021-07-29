import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//    int n = 15;
//    for (int i = 1; i <= n; i++) {
//      System.out.println((i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" : ((i % 3 == 0) ? "Fizz" : (i % 5 == 0 ? "Buzz" : i + "")));
//    }

// Don't know what kind of sorting method is this but it is working fine
    int a[] = {3, 67, -1, 45, 12, 0, 1};
    int a2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int countJ = 0;
    boolean sorted = false;
    for (int i = 0; i < a.length; i++) {
      sorted = true;
      for (int j = i; j < a.length; j++) {
        countJ++;
        if (a[i] > a[j]) {

          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
          sorted = false;
        }
      }
      if (sorted) {
        break;
      }
    }

    Arrays.stream(a).forEach(System.out::println);
    System.out.println("\nCount of J = " + countJ);
  }
}

class test {

  public static void main(String[] args) {
    sortInDescending();
  }

  public static void sortInDescending() {
    List list = Arrays.asList(12, 1234, 34, 765, 3, 67, 9, 0);
    //Collections.sort(list, Comparator.reverseOrder());
    list.sort(Comparator.reverseOrder());
    System.out.println(list);

    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    System.out.println(list1.toString());
  }
}
