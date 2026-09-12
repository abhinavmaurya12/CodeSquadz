import java.util.*;
class Array_home14
{
public static void main(String args[])
{
int nums[]={3,2,1,5,4};
int min=nums[0];
int max=nums[0];
for(int i=1; i<nums.length; i++){
 if (nums[i]>max) {
	 max=nums[i];
 }
  if (nums[i]<min) {
	 min=nums[i];
 }
  }
  System.out.println("min number is: " + min);
  System.out.println("max number is: " + max);
  }
  }