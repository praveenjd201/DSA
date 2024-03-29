public class BinarySearchInfinityArray {
  public static void main(String[] args) {
    int[] arr = { 12, 45, 46, 62, 98, 105, 106, 109, 128, 129, 190 };
    int target = 106;
    int start = 0;
    int end = 1;

    while (target > arr[end]) {
      int temp = end + 1;
      // end = previsous end + (no of old sets +1)*2
      end = end + (end - start + 1) * 2;
      start = temp;
    }
    System.out.println(start);
    System.out.println(end);
    System.out.println(binarySearch(arr, target, start, end));
  }

  static int binarySearch(int[] arr, int target, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
