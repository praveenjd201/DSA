import java.util.Arrays;

public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = { 1, 12, 45, 1, 25, 48, 18, 58 };
    int target = 18;

    String name = "praveen";
    char strTarget = 'e';

    // System.out.println(linearSearch(arr, target));
    System.out.println(stringSearch2(name, strTarget));
  }

  static boolean stringSearch2(String name, char strTarget) {
    for (char ch : name.toCharArray()) {
      if (ch == strTarget) {
        return true;
      }

    }
    return false;
  }

  static boolean stringSearch1(String name, char strTarget) {
    for (int i = 0; i < name.length(); i++) {
      return strTarget == name.charAt(i);

    }
    return false;
  }

  static int linearSearch(int[] arr, int target) {
    if (arr.length == 0)
      return -1;
    for (int index = 0; index < arr.length; index++) {
      if (target == arr[index]) {
        return index + 1;
      }
    }
    return -1;
  }
}