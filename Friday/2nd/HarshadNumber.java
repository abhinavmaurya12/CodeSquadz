// Ex.18, 1+8=9, divided by 9
// Ex.12, 1+2=3, divided by 3
//completely divisible by sum of it's digit
class HarshadNumber
{
public static void main(String args[])
{
int n,r,s=0;
System.out.printf("Enter the number: ");
n=new java.util.Scanner(System.in).nextInt();

int temp=n;
while(n>0){
r=n%10;
s=s+r;
n=n/10;
}

if(temp%s==0){
 System.out.println("Yes, "+temp+" it is hashed number");
 }
 else
 {
 System.out.println("No, "+temp+" it is hashed number");
 }
 }
 }

