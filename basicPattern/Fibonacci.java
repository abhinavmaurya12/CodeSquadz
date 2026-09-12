class Fibonacci
{
public static void main(String args[]) throws java.io.IOException
{
int i,n;

int t1=0, t2=1;

int nextTerm = t1+t2;

System.out.printf("enter the number: ");
n=new java.util.Scanner(System.in).nextInt();

//print 1st 2 terms
System.out.printf("Fibonacci Series: %d, %d, ", t1, t2);

//print 3rd to nth terms
for(i=3; i<=n; ++i)
{
System.out.printf("%d , ", nextTerm);
t1=t2;
t2=nextTerm;
nextTerm= t1 + t2;
}
}
}
