package Patterns;

public class Patterns {
  public static void main(String[] args) {
    pattern31(4);
  }
  //Pattern 1: Asterisk (*)
  static void pattern1(int n){
  for(int row=1;row<=n;row++){
    for(int col=1;col<=n;col++){
      System.out.print("* ");
    }
    System.out.println();
  }
}
//pattern 2:
  static void pattern2(int n){
  for(int row=1;row<=n;row++){
    for(int col=1;col<=row;col++){
      System.out.print("* ");
    }
    System.out.println();
  }
}

//pattern 3:
  static void pattern3(int n){
  for(int row=1;row<=n;row++){
    for(int col=1;col<=n-row + 1;col++){
      System.out.print("* ");
    }
    System.out.println();
  }
}
//pattern 4:
  static void pattern4(int n){
  for(int row=1;row<=n;row++){
    for(int col=1;col<=row;col++){
      System.out.print(col+ " ");
    }
    System.out.println();
  }
}

//pattern 5:
// *
// **
// ***
// ****
// ***
// **
// *
static void pattern5(int n) {
  for(int row=1;row<= n*2 ;row++){
    int totalCol = row > n ? 2*n-row+1 : row ;
    for(int col =1;col <= totalCol;col++){
      System.out.print("* ");
    }
    System.out.println();

  }
}
//pattern 17: 
      //    1
      //   212
      //  32123
      // 4321234
      //  32123
      //   212
      //    1

static void pattern17(int n) {
  for(int row=1;row <= 2*n-1;row++){
    int totalRowSpace= row > n ? 2*n-row :row;
    
    for(int col=1;col <= n-totalRowSpace;col++){
      System.out.print("  ");
    }
    for(int col=totalRowSpace;col>=1;col--){
      System.out.print(col+" ");
    }
    for(int col=2;col<=totalRowSpace;col++){
      System.out.print(col+" ");
    }

    System.out.println();
    


  }
}


//pattern 28:
//    *
//   * *
//  * * *
// * * * *
//  * * *
//   * *
//    *


static void pattern28(int n) {
  for(int row=1;row<= n*2-1 ;row++){
    int totalCol = row > n ? 2*n-row : row ;
    for(int space=1;space <=n-totalCol;space++){
      System.out.print(" ");
    }
    for(int col =1;col <= totalCol;col++){
      System.out.print("* ");
    }
    System.out.println();

  }
}

// patterns:30.   
  //         1
  //       2 1 2
  //     3 2 1 2 3
  //   4 3 2 1 2 3 4
  // 5 4 3 2 1 2 3 4 5

  static void pattern30(int n) {
    for(int row=1;row <= n;row++){
      int totalRowSpace = n - row;
      for(int col=1;col<=totalRowSpace;col++){
        System.out.print("  ");
      }
      for(int col=row;col>=1;col--){
        System.out.print(col+" ");
      }
      for(int col=2;col<=row;col++){
        System.out.print(col+" ");
      }
      System.out.println();
    }
  }

  // pattern:31.  
  //        4 4 4 4 4 4 4  
  //        4 3 3 3 3 3 4   
  //        4 3 2 2 2 3 4   
  //        4 3 2 1 2 3 4   
  //        4 3 2 2 2 3 4   
  //        4 3 3 3 3 3 4   
  //        4 4 4 4 4 4 4   

  static void pattern31(int n) {
    for(int row=1; row <=2*n-1;row++){
      for(int col=1;col <= 2*n-1;col++){
        int correctIndex=n-Math.min(Math.min(col-1, row-1), Math.min(2*n-1-(row), 2*n-1-(col)));
        System.out.print(correctIndex+" ");

      }
      System.out.println();
    }
  }

}

