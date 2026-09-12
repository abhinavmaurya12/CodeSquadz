import java.util.*;
class Array_home10
{
	
public static int sum(int... num) {
int sum=0;
for(int i=0; i<num.length; i++)
 sum=sum+num[i];
 return sum ;
 }

 public static void main(String args[]){
 int num[]={1,2,3,4,5,6};
 System.out.println(sum(num));
 }
 
}
