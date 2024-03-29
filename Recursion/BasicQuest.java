package Recursion;

public class BasicQuest {
  public static void main(String[] args) {
    int n=-1;
    System.out.println(funRevDigit2(n));
    
    // System.out.println(sum);
  }

  
// reverse the number
static int sum=0;
static void funRevDigit(int n){
  if (n == 0) return;

  int rem=n%10;
  sum = sum*10 + rem;
  funRevDigit(n/10);

}

static boolean funRevDigit2(int n){
  int digit = (int)Math.log10(n)+1;
  int mul=1;
  if(n < 0){
    mul=-1;
  }
  // System.out.println(digit);
  return n == (helper(n,digit) * mul);
}
static int helper(int n,int digit){
  if (n%10 ==n) return n ;

  int rem=n%10;
  return rem * (int)Math.pow(10, digit-1) + helper(n/10,digit-1);
}




  // print number n to 1
static void funRev(int n){
  if (n==0) return ;
  System.out.println(n);
  funRev(n-1);

}

// print number n to 1
static void fun(int n){
  if (n==0) return ;
  
  fun(n-1);
  System.out.println(n);
}

// product of digits

static int funProd(int n){
  if (n==0) return 1; /*it retrun 1 because 0 mutiple anything zero */
  
  return n%10 * funProd(n/10);

}
// sum of digits
static int funsum(int n){
  if (n==0) return 0;
  
  return n%10 + funsum(n/10);

}


}

