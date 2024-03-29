

// Given a number and its reverse. Find that number raised to the power of its own reverse.
// Note: As answers can be very large, print the result modulo 109 + 7.

// https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1


package Daily3DSA;

public class PowerOfNumber {
  public static void main(String[] args) {
    int n = 12;
    int r=21;
    System.out.println(power(n, r));
    
  }
  static long power(int n,int r)
  {
    long mod= (long)1e9+7;
      if(n == 0){
        return 0;
      }
      if(r == 0){
        return 1;
      }

      if(r%2 == 0){
        long ans=power(n,r/2);
        return  (ans%mod*ans%mod) %mod;

      }else{
        long ans=power(n,r/2);
        return (ans%mod * ans%mod * n%mod)%mod;
      }   
      
      
  }
}
