class Pattern3
{
public static void main(String args[]) throws java.io.IOException
{
int i, j, rows;

System.out.printf("enter the num: ");
rows=new java.util.Scanner(System.in).nextInt();

for(i=rows; i>=1; --i)
{
for(j=1; j<=i; ++j)
{
System.out.printf("%d", j);
}
System.out.printf("\n");
}
}
}

// 12345
// 1234
// 123
// 12
// 1