class FloydTriangle
{
public static void main(String args[])
{
int rows, i, j, number =1;

System.out.printf("enter the num: ");
rows=new java.util.Scanner(System.in).nextInt();

for(i=1; i<=rows; i++)
{
for(j=1; j<=i; j++)
{
System.out.printf("%d", number);
++number;
}
System.out.printf("\n");
}
}
}
