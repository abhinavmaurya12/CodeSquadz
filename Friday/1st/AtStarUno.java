class AtStarUno
{
public static void main(String args[]){
int i,j,n,sp=1;

System.out.printf("Enter the size ");
n=new java.util.Scanner(System.in).nextInt();
if(n>=2)
{
for(i=0; i<n*3; i++)
{
if(i<n)
{
System.out.printf("@");
}
else if(i<n*2)
{
if(i==n)
{
System.out.printf("@");
}
if(i!=n)
{
for(j=0; j<sp; j++)
{
System.out.printf(" ");
}
}
for(j=0;j<n; j++)
{
System.out.printf("*");
}
sp=sp+n-1;
if((i+1)==(2*n))
{
sp++;
System.out.printf("@");
}
}
else
{
for(j=0; j<sp; j++)
{
System.out.printf(" ");
}
System.out.printf("@");
}
System.out.printf("\n");
}
}
else
{
System.out.printf("\nInvalid Input");
}
}
}