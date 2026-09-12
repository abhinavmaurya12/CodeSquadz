class Temp5
{
int x;
int y;
Temp5(int x, int y)
{
this.x =x;
this.y=y;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main (String args[])
{
Temp5 t1 = new Temp5(10, 20);
t1.show();
Temp5 t2 = new Temp5(100, 200);
t2.show();
}
}
// always use parameterized const. for diff. diff. value...