package Daily3DSA;
// https://www.geeksforgeeks.org/problems/reverse-digit0316/1
// Given N,  reverse the digits of N.
public class Reversedigits {
  public static void main(String[] args) {
    System.out.println(reverse_digit(550));
  }
  static long reverse_digit(long n)
    {
      long result=0;
      long rem=0;
        while(n >0){
          rem = n % 10;
          result = (result*10)+rem;
          n/=10;
        }
        return result;
    }
}
