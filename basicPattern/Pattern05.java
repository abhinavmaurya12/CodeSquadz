class Pattern05
{
public static void main(String args[]) throws java.io.IOException
{
int i, j, rows;

System.out.printf("enter the num: ");
rows=new java.util.Scanner(System.in).nextInt();

for(i=rows; i>=1; i--)
{
for(j=1; j<=i; j++)
{
System.out.print(j);
System.out.print(" ");
}

System.out.println();
}
}
}