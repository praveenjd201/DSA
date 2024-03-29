public class Searchrotationalarray {
  public static void main(String[] args) {
    int[] nums = { 5, 5, 5, 1, 4 };
    int target = 6;
    System.out.println(search(nums, target));
  }

  static int search(int[] nums, int target) {
    int pivot = findPeakvaluewithDuplicate(nums);
    System.out.println("pivot is :  " + pivot);
    if (pivot == -1) {
      return binarySearchlimits(nums, target, 0, nums.length - 1);
    }
    if (nums[pivot] == target) {
      return pivot;
    }

    if (target >= nums[0]) {
      return binarySearchlimits(nums, target, 0, pivot - 1);
    } else {
      return binarySearchlimits(nums, target, pivot + 1, nums.length - 1);
    }
  }

  static int binarySearchlimits(int[] arr, int target, int start, int end) {
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

  static int findPeakvalue(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      } else if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      } else if (arr[start] >= arr[mid]) {
        end = mid - 1;
      } else if (arr[start] <= arr[mid]) {
        start = mid;
      }
    }
    return -1;
  }

  static int findPeakvaluewithDuplicate(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }
      if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
        if (arr[start] > arr[start + 1]) {
          return start;
        }
        start++;
        if (arr[end] < arr[end - 1]) {
          return end - 1;
        }
        end--;

      } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
