package Recursion;

public class bs {
  public static void main(String[] args) {
    int [] arr={1,2,5,9,8,10,51,59,62};
    int target=62;
    System.out.println(binarySearch(arr, target, 0, arr.length-1));
  }
  static int binarySearch(int [] arr,int target, int s,int e){
    if(s > e){
      return -1; // element not found
    }
    int mid = s + (e-s)/2;
    if(arr[mid] == target){
      return mid;
    }
    if(arr[mid] < target){
      return binarySearch(arr, target, mid+1, e);
    }
    return binarySearch(arr, target, s,mid-1);
  }
}
