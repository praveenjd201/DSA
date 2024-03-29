public class FindMin {
  public static void main(String[] args) {
    int[] num = { 1, 45, 21, 78, 7, 87, 5, 54 };
    System.out.println("The minimum element is " + min(num));

  }

  static int min(int[] num) {
    int ans = num[0];
    for (int i = 1; i < num.length; i++) {
      if (num[i] < ans) {
        ans = num[i];
      }
    }
    return ans;
  }
}
