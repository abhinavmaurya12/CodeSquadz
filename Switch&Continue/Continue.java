class Continue
{
public static void main(String args[]) throws	java.io.IOException
{
int i;
double number, sum =0.0;

for(i=1;i<=10; ++i)
{

System.out.printf("enter the number %d : " ,i);
number=new java.util.Scanner(System.in).nextInt();

if (number<0.0){
continue;
}
sum+= number;
}
System.out.println("sum of total = " + sum);
}
}