package Array_home;

public class Array_home20 {
    public static void main(String args[]){
        int nums[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<nums.length; i++){
            int max=nums[i][0];
            for(int j=0; j<nums[i].length; j++){
                if(nums[i][j]>max){
                    max=nums[i][j];
                }

            }
            System.out.println(max);
            //Two-Dimensional Arrays in Java (Exercise 2)
        }
    }
}
