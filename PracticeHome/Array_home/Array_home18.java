import java.util.*;
class Array_home18
{
public static void main(String args[])
{
int nums[][]={{2,3,4},{3,5,6},{2,3,4},{3,5,6}};
for(int i=0; i<nums.length; i++){
	for(int j=0; j<nums[i].length; j++){ //[i] or [j] with nums[]
	System.out.print(nums[i][j] + "  ");
	}
	System.out.println();
}
}
}