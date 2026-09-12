class BlankFinalVariable
{
final int x=getX();

int getX()
{

System.out.println(x + "via get function");
return 10;

}
BlankFinalVariable()
{

//x=0; (this line is inserted by the compiler)
// x=getX();
System.out.println(this.x + "via constructor ");

}

public static void main(String args[])
{
new BlankFinalVariable();
}
}

class InstanceFinalVariable
{
final int x=20;
public static void main (String args[])
{
InstanceFinalVariable t=new InstanceFinalVariable();

//t.x=t.x+100;

System.out.println(t.x);
InstanceFinalVariable t1 =new InstanceFinalVariable();

//t1.x=t.x+100;
System.out.println(t1.x);
}
}