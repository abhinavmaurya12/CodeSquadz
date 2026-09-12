class Dowhileprinttable
{
public static void main(String args [])
{
int i=1;
int number;


System.out.println("enter the number");
 number =new java.util.Scanner(System.in).nextInt();


while(i<=10)
do

{
System.out.printf("%d * %d =%d ", number, i, number*i);
System.out.println();
i++;
}while(i<=10);

}
}