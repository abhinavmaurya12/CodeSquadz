import java.util.Scanner;
class HappyNumber
{
static int count=0;
public static int CheckNumber(int n)
{
int r=0,s=0;
while(n>0){
r=n%10;
s=s+(r*r);
n=n/10;
count++;
}
return s;
}

public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
System.out.println("Enter any number you want to check ");
n=in.nextInt();
int rs=n;

while(rs!=1 && rs!=4){
 rs=CheckNumber(rs);
 }
 
 if(rs==1){
 System.out.println("Yes, "+n+" it's a HappyNumber= "+count);
 }
 else
 {
 System.out.println("No, "+n+" it's not a HappyNumber= "+count);
 }
 }
 }
 
 