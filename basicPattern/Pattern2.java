class Pattern2
{
public static void main(String args[]) throws java.io.IOException
{
int i, j, rows;

System.out.printf("enter the num: ");
rows=new java.util.Scanner(System.in).nextInt();

for(i=1; i<=rows; ++i)
{
for(j=1; j<=i; ++j)
{
System.out.printf("*");
}
System.out.printf("\n");
}
}
}
