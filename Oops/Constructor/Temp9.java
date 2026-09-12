// constructor chaining...
class Temp9
{
Temp9()
{
this(10);
System.out.println("defalt");
}
Temp9(int x)
{
this(10, 20);
System.out.println(x);
}
Temp9 (int x, int y)
{
System.out.println(x+y);
}
public static void main (String args[])
{
new Temp9();
}
}