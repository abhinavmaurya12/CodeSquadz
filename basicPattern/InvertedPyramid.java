class InvertedPyramid
{
public static void main(String args[]) throws java.io.IOException
{
int i, j, rows;
System.out.printf("enter the rows: ");
rows=new java.util.Scanner(System.in).nextInt();
for(i=rows; i>=1; --i)
{
for(j=1; j<=i; ++j)
{
System.out.printf("*");
}
System.out.printf("\n");
}
}
}
