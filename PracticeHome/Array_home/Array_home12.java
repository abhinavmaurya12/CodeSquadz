import java.util.*;
class Array_home12
{
public static void main(String args[])
{
int nums[]={1,2,-3,5,7};
int sum=0;
int product=1;
double avg;

for(int i=0; i<nums.length; i++){
sum=sum+nums[i];
product=product*nums[i];	 
}
avg=(double)sum/nums.length;
System.out.println("sum:" + sum + ", " + "product:" + product + ", " + "avg:"+ avg);

}
}