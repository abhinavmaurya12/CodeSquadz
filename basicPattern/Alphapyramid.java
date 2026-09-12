class Alphapyramid
{
public static void main(String args[]) throws java.io.IOException
{
int i,j;
char input, alphabet='A';
System.out.println("enter an uppercase character you want to print: ");
int x=System.in.read();
input=(char)x;

for(i=1; i<=(input-'A'+1); ++i)
{
for(j=1; j<=i; ++j)
{
System.out.printf("%c", alphabet);
}
++alphabet;
System.out.printf("\n");
}
}
}