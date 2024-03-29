public class Splitarrarray {
  public static void main(String[] args) {
    int[] nums = { 7, 2, 5, 10, 8 };
    int m = 2;

    System.out.println(splitArray(nums, m));
  }

  static int splitArray(int[] nums, int m) {
    int start = 0;
    int end = 0;
    // case 1: if m = 1 , my ans would be max number of array
    // case 2 : if m=no of element in array. my ans would be sum of array
    for (int i = 0; i < nums.length; i++) {
      start = Math.max(start, nums[i]);
      end += nums[i];
    }

    while (start < end) {
      int mid = start + (end - start) / 2;
      int sum = 0;
      int pieces = 1;
      for (int num : nums) {
        if (sum + num < mid) {
          sum = num;
          pieces++;
        } else {
          sum += num;
        }
      }
      if (pieces <= m) {
        end = mid;
      } else {
        start = mid + 1;
      }

    }
    return end;
  }
}
