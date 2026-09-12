import java.util.*;
class Array_home15
{
public static void main(String args[])
{
int nums[];

System.out.printf("Enter the nums: ");
int num=new Scanner(System.in).nextInt();
nums=new int[num];

System.out.println("Enter the elements"); 
for(int i=0; i<nums.length; i++){
	nums[i]=new Scanner(System.in).nextInt();
}

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