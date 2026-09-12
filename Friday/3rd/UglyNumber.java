import java.util.Scanner;

class UglyNumber{
 public static void main(String ars[]){
  int n,flag=0;
  Scanner in=new Scanner(System.in);
  System.out.println("Enter any number: ");
  n=in.nextInt();
  
  while(n!=1)
  {
   if(n%2==0){
    n=n/2;
	}
	else if(n%3==0){
	 n=n/3;
	 }
	 else if(n%5==0){
	  n=n/5;
	  }
	  else{
	   System.out.println("it's not ugly");
	   flag=1;
	   break;
	   }
	   }
	   if(flag==0){
	    System.out.println("it's ugly");
		}
		}
		}