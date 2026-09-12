import java.util.*;
class Array_home16
{
public static void main(String args[])
{
int nums[]={1,2,4,5,7,9,-2,3};
int temp[]=new int [nums.length];
 int j=0;
 int k=nums.length-1;
  
  for(int i=0; i<nums.length; i++){
	  if(nums[i]%2==0)
		  temp[k--]=nums[i];
	  else
		  temp[j++]=nums[i];
  }
  copyArray(temp, nums);
  System.out.print(Arrays.toString(nums));
 }
 
 static void copyArray(int [] temp, int [] nums){
	 for(int i=0; i<nums.length; i++){
		 nums[i]=temp[i];
	 }
 }
 }
 