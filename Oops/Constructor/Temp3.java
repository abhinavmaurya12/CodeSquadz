// constructor as defalt
class Temp3
{
int x;
int y;

Temp3()
{
x=10;
y=20;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String args[])
{
Temp3 t1 = new Temp3();
t1.show();

Temp3 t2= new Temp3();
t2.show();
}
}
