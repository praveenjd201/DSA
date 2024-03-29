import java.util.Arrays;

public class Search2darray {
  public static void main(String[] args) {
    int target = 20;
    int[][] arr = {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
    };
    System.out.println(arr[0].length - 1);
    System.out.println(Arrays.toString(search2Darray(arr, target)));
  }

  static int[] search2Darray(int[][] arr, int target) {
    int row = 0;
    int col = arr[row].length - 1;
    while (row < arr.length && col >= 0) {
      if (arr[row][col] == target) {
        return new int[] { row, col };
      }
      if (arr[row][col] < target) {
        row++;
      } else {
        col--;
      }

    }
    return new int[] { -1, -1 };
  }
}