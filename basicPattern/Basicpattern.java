
public class Basicpattern {
    public static void main(String[] args) {
       
        // Input 1
        // int n = 4;
        // for(int row = 1; row <= n; row++){
            // for(int col = 1; col <=row; col++){
                // System.out.print("*");
            // }
         // System.out.println();
        // }
        // Output 1
        // *
        // **
        // ***
        // ****
        
        // Input 2
        // int n = 4 ;
        // for(int row = 1; row <= n; row++){
           // for(int col = 1; col <= n-row+1; col++){
            // System.out.print("*");
           // }
           // System.out.println();
        // }
        // Output 2
        // ****
        // ***
        // **
        // *

        // Input 3
        // int n = 4;
        // for(int row = 1; row <= n; row++){
         // for(int col = 1; col <= row; col++){
            // System.out.print(col);
         // }
         // System.out.println();
        // }
        // Output 3
        // 1
        // 12
        // 123
        // 1234

        // Input 4
        // int n = 4;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n-row+1; col++){
        //         System.out.print(col);
        //     }
        //     System.out.println();
        // }
        // Output
        // 1234
        // 123
        // 12
        // 1

        // Input 5
        int n = 4;
        char ch = 'A' ;
        for(int row = 1; row<=n; row++){
         for(int col = 1; col<= row; col++){
            System.out.print(ch);
            ch++;
         }
         System.out.println();
        }
        // Output 5
        // A
        // BC
        // DEF
        // GHIJ

        // Input 6
        // int n = 4;
        // char ch = 'A';
        // for(int row = 1; row <=n; row++){
        //   for(int col = 1; col<=n-row+1; col++){
        //    System.out.print(ch);
        //    ch++;
        //   }
        //   System.out.println();
        // }
        // Output 6
        // ABCD
        // EFG
        // HI
        // J

        // Input 7
        // int n = 4;
        // for (int row = 1; row <= n; row++) {
        //     char ch = 'A';
            
        //     for (int col = 1; col <= row; col++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
            
        //     System.out.println();
        // }
        //  Output 7
        // A
        // AB
        // ABC
        // ABCD

        // Input 8
        // int n = 4;  
        // for(int row = 1; row <= n; row++){
        //    char ch = 'A';
        //     for(int col = 1; col <= n-row+1; col++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        // Output 8
        // ABCD
        // ABC
        // AB
        // A

        // Input 9
        //  int n = 4;
        // int num = 1; 
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= row; col++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }
        // Output 9
        // 1
        // 23
        // 456
        // 78910


        // Input 10
        // int n = 4;
        // int num = 1; 
        // for(int row = 1; row <= n; row++){  
        //     for(int col = 1; col <= n-row+1; col++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }
        //Output
        // 1234
        // 567
        // 89
        // 10





    }
}