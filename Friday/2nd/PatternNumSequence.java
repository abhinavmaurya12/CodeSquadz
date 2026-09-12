class PatternNumSequence
{
public static void main(String args[])
{
int a=3,b=4,n=8;
for(int i=1; i<=n; i++){
 int c= a+b;
 System.out.print(a+" "+ b + " " + c);
 System.out.println(" ");
 a =c;
 b=b+1;
 }
 }
 }