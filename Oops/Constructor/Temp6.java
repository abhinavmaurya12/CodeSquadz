// annonymouse objects..
class Temp6
{
int salary;
Temp6()
{
salary=20000;
}
void show()
{
System.out.println(salary);
}
public static void main(String args[])
{
System.out.println(new Temp6().salary);
new Temp6().show();
System.out.println(new Temp6());
}
}
// const. return ref..id..