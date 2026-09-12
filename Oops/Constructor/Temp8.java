// copy constructor....
//Copy Constructor Kya Hai?
// Definition: Ek constructor jo same class ke object ko parameter ke roop me 
// lekar naye object me uski values copy karta hai.
class Temp8
{
int x;
int y;
Temp8(int x, int y)
{
this.x=x;
this.y=y;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
Temp8(Temp8 z)
{
this.x=z.x;
this.y=z.y;
}
public static void main(String args[])
{
Temp8 t1= new Temp8(10, 20);
t1.show();

Temp8 t2 = new Temp8(t1);
t2.show();
}
}