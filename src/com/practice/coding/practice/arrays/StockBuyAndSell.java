package com.practice.coding.practice.arrays;

public class StockBuyAndSell {

  public static void main(String[] args) {
    int a[] = {1 ,1, 2, 3 ,4 ,4, 4, 5, 6 ,6};
    int b[] = {
        886, 2777, 6915, 7793, 8335, 5386, 492, 6649, 1421, 2362, 27, 8690, 59, 7763, 3926, 540, 3426, 9172, 5736, 5211, 5368, 2567, 6429, 5782, 1530, 2862, 5123,
        4067, 3135, 3929, 9802, 4022, 3058, 3069, 8167, 1393, 8456, 5011, 8042, 6229, 7373, 4421, 4919, 3784, 8537, 5198, 4324, 8315, 4370, 6413, 3526, 6091, 8980,
        9956, 1873, 6862, 9170, 6996, 7281, 2305, 925, 7084, 6327, 336, 6505, 846, 1729, 1313, 5857, 6124, 3895, 9582, 545, 8814, 3367, 5434, 364, 4043, 3750, 1087,
        6808, 7276, 7178, 5788
    };
    stockBuySell(a, a.length);
  }

  public static void stockBuySell(int[] price, int n) {

    int buy;
    int sell = 0;

    for (int i = 0; i < n - 1; i++) {
      if (price[i] >= price[i + 1]) {
        continue;
      }
      buy = i;
      for (int j = i + 1; j <= n - 1; j++) {
        if (j == n - 1 && price[j] > price[i]) {
          System.out.print("(" + buy + " " + j + ") ");
          i = j;
          sell++;
          break;
        }
        if (price[j] < price[j + 1]) {
          continue;
        }

        if (price[j] > price[j + 1]) {
          System.out.print("(" + buy + " " + j + ") ");
          i = j;
          sell++;
          break;
        }
      }
    }
    if (sell == 0) {
      System.out.print("No Profit");
    }
  }
}
