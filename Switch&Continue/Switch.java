class Switch
{
public static void main(String args[])
{
System.out.println("enter the number");
int num = new java.util.Scanner(System.in).nextInt();
switch(num)
{
case 1: 
System.out.printf("sunday");
break;
case 2:
System.out.printf("monday");
break;
case 3:
System.out.printf("tuesday");
break;
default:
System.out.printf("holiday");
}
}
}