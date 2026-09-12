class Infiniteloop
{
public static void main(String args[])
{
double number, sum =0.0;

while (true)
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