//https://leetcode.com/problems/find-in-mountain-array/

public class FindinMountainArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 6, 4, 3, 2, 1 };
    int target = 3;
    System.out.println(search(arr, target));

  }

  static int search(int[] arr, int target) {
    int peakelement = findPeakelement(arr);
    int fisrthalf = orderAgnosticBS(arr, target, 0, peakelement);
    if (fisrthalf != -1) {
      return fisrthalf;
    }
    return orderAgnosticBS(arr, target, peakelement + 1, arr.length - 1);
  }

  static int orderAgnosticBS(int[] arr, int target, int start, int end) {

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = (start + end) / 2;
      if (target == arr[mid]) {
        return mid;
      }
      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }

  static int findPeakelement(int[] arr) {
    int start = 0;
    ;
    int end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > arr[mid + 1]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    return end;

  }
}