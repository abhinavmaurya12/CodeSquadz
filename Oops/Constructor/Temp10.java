// init block...
class Temp10
{
int x;
{
System.out.println("init block");
this.x=10;
}
Temp10()
{
System.out.println("secound");
}
Temp10 (int x)
{
System.out.println(x);
}
public static void main (String args [])
{
new Temp10();
new Temp10(10);
new Temp10();
}
}

