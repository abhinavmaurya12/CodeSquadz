class RktStar
{
public static void main(String args[])
{
int i,j,n,sp,x=1;

System.out.printf("Enter the size ");
n=new java.util.Scanner(System.in).nextInt();
sp=n/2;
if(n>=5 && n%2!=0)
{
for(i=0; i<n/2+1; i++)
{
for(j=0; j<sp-i; j++)
{
System.out.printf(" ");
}
for(j=0; j<x; j++)
{
System.out.printf("*");
}
x+=2;
System.out.printf("\n");
}
//part 1 end

sp=n-2;
for(i=0; i<n/2+1; i++)
{
System.out.printf("@");
for(j=0; j<sp; j++)
{
System.out.printf(" ");
}
System.out.printf("@");
System.out.printf("\n");
}
//part 2 end 

x=1;
sp=1;
for(i=0; i<n/2; i++){
System.out.printf("@"); 

for(j=0; j<sp; j++){
System.out.printf(" "); 
}
for(j=0; j<x; j++){
System.out.printf("*");
}
for(j=0; j<sp; j++) {//remove n/2- form j
System.out.printf(" ");   
}                      
System.out.println("@"); 

x=x+2;
sp--;
}
// part 3 end

for(i=0; i<x; i++)
{
System.out.print("*");
}
}
//end

else
{
System.out.printf("\nInvalid Input");
}


}
}