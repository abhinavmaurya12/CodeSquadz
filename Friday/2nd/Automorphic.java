//automorphic number (also known as a circular number) 
//is a number whose square ends in the same digits as the number itself.
// 5^2=25(End in 5)
// 6^2=36(End in 6)
// 76^2=5776(End in 76)
class Automorphic
{
public static void main(String args[])
{
int no,sq=0;
boolean flag =true;
System.out.printf("Enter the number : ");
no=new java.util.Scanner(System.in).nextInt();

sq=no*no;
while(no>0){
 if((no%10) != (sq%10)){
  flag=false;
  break;
  }
  else
  {
  flag = true;
  }
  no = no/10;
  sq = sq/10;
  }
  if(flag){
   System.out.print("It is Automorphic No.");
   }
   else{
   System.out.print("It is Not Automorphic No.");
   }
   }
   }
   
   