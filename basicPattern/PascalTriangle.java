class PascalTriangle
{
public static void main (String args [])
{
int rows, coef=1, space, i, j;
System.out.printf("Enter the num of rows: ");
rows=new java.util.Scanner(System.in).nextInt();

for(i=0; i<rows; i++)
{
for(space=1; space<=rows-i; space++ )
System.out.printf("  ");
for(j=0; j<=i; j++)
{
if(j==0 || i==0)
coef=1;
else
coef = coef * (i-j + 1)/j;
System.out.printf("%4d", coef);
}
System.out.printf("\n");
}
}
}
