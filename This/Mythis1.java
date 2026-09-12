class Mythis1
{
int x=10;
void get (int x, Mythis1 z)
{
System.out.println(x);
System.out.println(z.x);
}
public static void main (String args[])
{
Mythis1 mt= new Mythis1();
System.out.println(mt.x);
mt.get(20,mt);
}
}
