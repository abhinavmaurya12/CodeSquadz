import java.util.Scanner;

class NeonNumber{
public static void main(String args[]){
int n,sq,s=0,r;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number: ");
n=in.nextInt();
sq=n*n;
while(sq!=0){
r=sq%10;
s=s+r;
sq=sq/10;
}
if(n==s){
System.out.println("it's a neon");
}
else{
System.out.println("it's not neon");
}
}
} 