package Daily3DSA;
// https://practice.geeksforgeeks.org/problems/count-digits5716/1

// Given a number N. Count the number of digits in N which evenly divides N.

// Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

public class CountDigits {
  public static void main(String[] args) {
  System.out.println(evenlyDivides(22074));
  }
  static int evenlyDivides(int n){
    int temp= n;
    int rem=0;
    int count=0;
    while(temp > 0){
      rem=temp % 10;
      if(rem != 0 && n % rem == 0 ){
        count++;
      }
      temp/=10;
    }

    return count;
}
}
