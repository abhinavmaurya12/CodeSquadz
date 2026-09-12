// if user enter the negative value it's not add in the result
class ForInfiniteloop
{
public static void main(String args[])
{
double number, sum =0.0;

for(; ; )
{
System.out.println("Enter the number");
number =new java.util.Scanner(System.in).nextInt();

if(number<0.0)
{
break;
}

sum += number;
}
System.out.println("the total num " + sum);
}
}