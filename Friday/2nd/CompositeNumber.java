// a positive integer greater then 1 tha has more then one factors
// Ex.4, 6, 8,9. 
class CompositeNumber
{
public static void main(String args[])
{
System.out.printf("Enter the number: ");
int n=new java.util.Scanner(System.in).nextInt();
int h=n/2;
int flag=0;
if(n<3){
System.out.println("No it is not CompositeNumber");
}
else
{
for(int i=2; i<=h; i++){
 if(n%i==0){
  System.out.println("Yes it is a CompositeNumber");
  flag=1;
  break;
  }}
  if(flag==0){
   System.out.println("No it is Not CompositeNumber");
   }
   
   }
   }
   }