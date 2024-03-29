package SortingAlgorithm;

import java.util.Arrays;

public class Bubblesort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    search(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void search(int[] arr) {
    boolean swapped = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          swapped = true;
          System.out.println(swapped);
        }
      }
      if (!swapped) {

        break;
      }
    }
  }

}
