package SortingAlgorithm;

import java.util.Arrays;

public class Selectionsort {
  public static void main(String[] args) {
    int[] arr = { 5, 2, 6, 1, 3, -4 };
    search(arr);
    System.out.println(Arrays.toString(arr));

  }

  static void search(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int lastIndex = arr.length - i - 1;
      int maxIndex = getMaxindex(arr, 0, lastIndex);
      swap(arr, lastIndex, maxIndex);
    }
  }

  static void swap(int[] arr, int lastIndex, int maxIndex) {
    int temp = arr[lastIndex];
    arr[lastIndex] = arr[maxIndex];
    arr[maxIndex] = temp;
  }

  static int getMaxindex(int[] arr, int start, int last) {
    int max = start;
    for (int i = 0; i <= last; i++) {
      if (arr[max] < arr[i]) {
        max = i;
      }
    }
    return max;

  }

}
