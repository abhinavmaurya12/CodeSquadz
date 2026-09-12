class Factorial
{
public static void main(String args[]) throws java.io.IOException
{
int n,i;
int fact=1;
System.out.printf("Enter an integer: ");
n=new java.util.Scanner(System.in).nextInt();

if(n<=0)
System.out.printf("error Factorial of negative num does't exit");
else
{
for(i=1; i<=n; ++i){
fact*=i;
// fact=fact*i;
}
System.out.printf("Factorial of %d = %d", n, fact);
}
}
}
