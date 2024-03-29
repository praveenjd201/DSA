package Daily3DSA;

import java.util.Arrays;

public class FindCommonPrefixArray {
  public static void main(String[] args) {

    String[] x = {"sharath","shaveen","shanthi","amu"};
    
    System.out.println(longestCommonString(x));
    
  }
  static String longestCommonString(String[] x){

    int size = x.length;

    // if (size == 0) return "";
    // to sory an given array

    Arrays.sort(x);

    // to find the minimum length of first and last string
    
    int end= Math.min(x[0].length(), x[size-1].length());
    // find the common prefix of 
    int i = 0;
    while (i < end && x[0].charAt(i) == x[size-1].charAt(i) )
        i++;

    String pre = x[0].substring(0, i);
    return pre;


    
  }
}
