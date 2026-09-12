import java.util.Scanner;
class KNumber
{ // 145 is KNumber because 1!+4!+5!=145
static int fact(int n)
{
int m=1;
for(int i=n; i>=1; i--){
m=m*i;
}
return m;
}
public static void main(String args[])
{
int n, temp, r,s=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number: ");
n=in.nextInt();

temp=n;
while(temp>0){
 r=temp%10;
 s=s+fact(r);
 temp=temp/10;
 }
 
 if(s==n){
  System.out.println("true");
  }
  else{
  System.out.println("else");
  }
  }
  }