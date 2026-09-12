package Array_home;
import java.util.*;

//write a program to print sum of eac row ot 2D arrays...
public class Array_home19 {
    public static void main(String args[]) {
        int nums[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j=0; j<nums[i].length; j++) {
                sum = sum + nums[i][j];
            }
            System.out.println(sum);
        }
    }
}
