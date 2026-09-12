class Buzz //if it's ends with 7 or is divisible by 7, Ex. 63 and 747 are buzz num
{
public static void main(String args[])
{
System.out.printf("Enter the num to check weather it's a buzz number or not : ");
int n=new java.util.Scanner(System.in).nextInt();
if(n%10==7 || n%7==0){
 System.out.println("Yes , "+n+" it's a buzz Number");
 }
 else
 {
 System.out.println("No , "+n+" it is not a buzz Number");
 }
 }
 }