import java.util.Arrays;

public class RotateArray {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7};
    int k = 5;  

    k=k%nums.length;

    if (k != 0){
      reverseArray(nums,0,nums.length - 1);
      reverseArray(nums,0,k-1);
      reverseArray(nums,k,nums.length - 1);
      System.out.println("After rotation: " + Arrays.toString(nums));
    }else{
      System.out.println("no rotation: " + Arrays.toString(nums));
    }
    
    
    
  }
static void reverseArray(int[] nums,int start,int end){
  
  
  while (start<end) {
    System.out.println("call");
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
    start++;
    end--;
  }
}
}
