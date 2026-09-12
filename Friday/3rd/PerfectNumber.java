import java.util.Scanner;
//the first few perfect number..
//ex: 6,28,496 and 8128
// 
class PerfectNumber
{
public static void main(String args[])
{
int n,s=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number: ");
n=in.nextInt();

for(int i=1; i<n; i++){
 if(n%i==0){
  s=s+i;
  }
  }
  if(s==n){
  System.out.println("it's perfect number");
  }
  else{
  System.out.println("it's not perfect number");
}}}  