/* 1729=1+7+2+9
       =19
       =1+9
       =10
       =1+0
       =1 */
class MagicNumber
{
public static void main(String args[])
{
System.out.printf("Enter the number: ");
int n=new java.util.Scanner(System.in).nextInt();

int r=0;
int sum=0;
while(true)
{
 while(n>0)
 {
 r=n%10;
 sum=sum+r;
 n=n/10;
 }
 
 if(sum==1){
 System.out.println("Yes, it is Magic Number");
 break;
 }
 else if(sum>1 && sum<=9){
 System.out.println("No, it is not Magic Number");
 break;
 }
 else{
 n=sum;
 sum=0;
 continue;
 }
 }
 }
 }

