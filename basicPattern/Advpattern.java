
public class Advpattern {
    // public static void hollowRhombus(int n){
    //  // outer loop
    //  for (int row = 1; row <= n; row++){
    //     // space
    //     for (int space = 1; space <= n - row; space++){
    //         System.out.print(" ");
    //     }
    //     // star and space
    //     for(int col = 1; col <= n; col++){
    //         if (row == 1 || row == n ||  col == 1 || col == n){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    //  }
    // }

    // public static void hol_rectangle(int totrow, int totcol){
    //     // outer loop
    //     for(int outerloop = 1; outerloop<=totrow; outerloop++){
    //         // innerloop
    //     for (int innerloop = 1; innerloop<=totcol; innerloop++){
    //         if( outerloop==1 || outerloop==totrow || innerloop==1 || innerloop== totcol){
    //             System.out.print("* "); // right space matter "* "
    //         }
    //         else{
    //             System.out.print("  "); // space imp "  " 2x
    //         }
    //     }
    //     System.out.println(); // move to nextLine
    //     }
    // }

    // public static void zeroOne(int n){
    //     // outer loop
    //     for(int outerloop = 1; outerloop<=n; outerloop++){
    //       // inner loop
    //       for(int innerloop =1; innerloop<= outerloop; innerloop++){
    //         if((outerloop+innerloop)%2==0){
    //             System.out.print("1 ");
    //         }
    //         else{
    //             System.out.print("0 ");
    //         }
    //       }
    //       System.out.println();
    //     }
    // } 

    // public static void solid_Rom(int n){
    //     // outer loop
    //     for(int otloop=1; otloop<=n; otloop++){
    //         // space
    //         for(int space=1; space<= n-otloop; space++){
    //             System.out.print(" ");
    //         }
    //          // star
    //         for(int star=1; star<=n; star++){
    //                 System.out.print("*");
    //             }
    //         System.out.println();
    //     }
    // }

    public static void btfly(int n ){
        // outer loop
        for(int i = 1; i <=n; i++){
           // star
           for(int j =1; j<=i; j++){
            System.out.print("*");
           }
           // space
           for(int j = 1; j <=2*(n-i); j++){
            System.out.print(" ");
           }
           // star
           for(int j =1; j<=i; j++){
            System.out.print("*");
           }
           System.out.println();
        }
        // lower half of butterfly
        for(int i = n; i >=1; i--){
           // star
           for(int j =1; j<=i; j++){
            System.out.print("*");
           }
           // space
           for(int j = 1; j <=2*(n-i); j++){
            System.out.print(" ");
           }
           // star
           for(int j =1; j<=i; j++){
            System.out.print("*");
           }
           System.out.println();
        }
    }

    // public static void diaPattern( int n ){
        //1st half
        // for(int i =1; i<=n; i++){
           space
           // for(int j=1; j<=n-i; j++ ){
              // System.out.print(" ");
           // }
           star
           // for(int k =1; k<=2*(i-1); k++){
            // System.out.print("*");
           // }
           // System.out.println();
        // }
        //2nd half
         // for(int i =n-1; i>=1; i--){
           space
           // for(int j=1; j<=n-i; j++ ){
              // System.out.print(" ");
           // }
           star
           // for(int k =1; k<=2*(i-1); k++){
            // System.out.print("*");
           // }
           // System.out.println();
        // }

    // }




    public static void main(String[] args) {
       btfly(7);
    }
}