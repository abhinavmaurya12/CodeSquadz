import java.util.*;
class Array_home13
{
public static void main(String args[])
{
int nums []={1,1,2,3,1,3};
int times=0;
// int findme=7;

System.out.printf("Enter the number you want to find: ");
int findme=new Scanner(System.in).nextInt();
// int findme=new java.util.Scanner(System.in).nextInt();

for(int i=0; i<nums.length; i++){
if(nums[i]==findme){
 times++;
// System.out.println("search for:"+findme + " , " +"occers:" + times); 
 }
}
  System.out.println("Total Occurrences of " + findme + " = " + times);
}
}